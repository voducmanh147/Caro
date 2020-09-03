package view;

import java.io.InputStream;
import java.util.Optional;

import javax.swing.JLabel;

import controller.Controller;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import model.Board;
import model.Bot;
import model.Human;

public class View implements EventHandler<ActionEvent> {
	public static final int WIDTH_BOARD = 15;
	public static final int HEIGHT_BOARD = 15;
	public static final int WIDTH_PANE = 1100;
	public static final int HEIGHT_PANE = 750;
	private Button btnHuman;
	private Button btnExit;
	private Button btnUndo;
	private Button btnAbout;
	private Button btnBoss;
	private Board boardState;
	private Bot boss;
	// lop dieu khien
	Controller controller;
//	 mang quan co khi danh
	public Button[][] arrayButtonChess;
	// khung view
	public static Stage primaryStage;

	public View() {
	}

	public void start(Stage primaryStage) {
		try {
			View.primaryStage = primaryStage;
			arrayButtonChess = new Button[WIDTH_BOARD][HEIGHT_BOARD];
			boardState = new Board(WIDTH_BOARD, HEIGHT_BOARD);
			controller = new Controller();
			controller.setView(this);

			BorderPane borderPane = new BorderPane();
			BorderPane borderPaneRight = new BorderPane();
			menu(borderPaneRight);

			GridPane root = new GridPane();
			Scene scene = new Scene(borderPane, WIDTH_PANE, HEIGHT_PANE);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			borderPane.setPadding(new Insets(20));
			borderPane.setCenter(root);
			borderPane.setRight(borderPaneRight);
			// mac dinh player 1 di truoc
			for (int i = 0; i < WIDTH_BOARD; i++) {
				for (int j = 0; j < HEIGHT_BOARD; j++) {
					Button button = new Button();
					button.setPrefSize(50, 60);
					button.setAccessibleText(i + ";" + j);
					arrayButtonChess[i][j] = button;
					root.add(button, j, i);
					button.setOnAction(new EventHandler<ActionEvent>() {
						@Override
						public void handle(ActionEvent event) {

							controller.play(button, arrayButtonChess);

						}
					});
				}
			}
			primaryStage.setScene(scene);
			primaryStage.setTitle("Game caro hai người chơi");
			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void menu(BorderPane pane) {
		VBox box = new VBox();
		box.setSpacing(10);
		Class<?> clazz = this.getClass();
		AnchorPane anchorPaneLogo = new AnchorPane();
		AnchorPane anchorPaneMenu = new AnchorPane();
		// set logo
		InputStream input = clazz.getResourceAsStream("/image/giabui1.jpg");
		Image image = new Image(input);
		ImageView imgView = new ImageView(image);
		imgView.setFitHeight(260);
		imgView.setFitWidth(260);
		AnchorPane.setTopAnchor(imgView, 10.0);
		AnchorPane.setLeftAnchor(imgView, 30.0);
		AnchorPane.setRightAnchor(imgView, 30.0);
		anchorPaneLogo.getChildren().add(imgView);

		// Human
		btnHuman = new Button("Hai người chơi");
		btnHuman.setId("btnMenu");
		btnHuman.setOnAction(this);
		AnchorPane.setTopAnchor(btnHuman, 10.0);
		AnchorPane.setLeftAnchor(btnHuman, 30.0);
		AnchorPane.setRightAnchor(btnHuman, 30.0);
		anchorPaneMenu.getChildren().add(btnHuman);

		// Boss

		btnBoss = new Button("Chơi với máy");
		btnBoss.setId("btnMenu");
		btnBoss.setOnAction(this);
		AnchorPane.setTopAnchor(btnBoss, 70.0);
		AnchorPane.setLeftAnchor(btnBoss, 30.0);
		AnchorPane.setRightAnchor(btnBoss, 30.0);
		anchorPaneMenu.getChildren().add(btnBoss);

		// Undo
		btnUndo = new Button("Quay lại");
		btnUndo.setId("btnMenu");
		btnUndo.setOnAction(this);
		AnchorPane.setTopAnchor(btnUndo, 130.0);
		AnchorPane.setLeftAnchor(btnUndo, 30.0);
		AnchorPane.setRightAnchor(btnUndo, 30.0);
		anchorPaneMenu.getChildren().add(btnUndo);

		// abouts
		btnAbout = new Button("Luật chơi");
		btnAbout.setId("btnMenu");
		btnAbout.setOnAction(this);
		AnchorPane.setTopAnchor(btnAbout, 190.0);
		AnchorPane.setLeftAnchor(btnAbout, 30.0);
		AnchorPane.setRightAnchor(btnAbout, 30.0);
		anchorPaneMenu.getChildren().add(btnAbout);
		// exit
		btnExit = new Button("Thoát");
		btnExit.setId("btnMenu");
		btnExit.setOnAction(this);
		AnchorPane.setTopAnchor(btnExit, 250.0);
		AnchorPane.setLeftAnchor(btnExit, 30.0);
		AnchorPane.setRightAnchor(btnExit, 30.0);
		anchorPaneMenu.getChildren().add(btnExit);
		//
		box.getChildren().add(anchorPaneLogo);
		box.getChildren().add(anchorPaneMenu);

		// Bottom
		GridPane gridPaneBottom = new GridPane();
		Labeled namePlayer1 = new Label("Player 1:");
		namePlayer1.setId("timeplayer");
		InputStream in1 = clazz.getResourceAsStream("/image/x.png");
		Image icon1 = new Image(in1);
		ImageView iconView1 = new ImageView(icon1);
		iconView1.setFitHeight(30);
		iconView1.setFitWidth(30);
		gridPaneBottom.add(namePlayer1, 0, 0);
		gridPaneBottom.add(iconView1, 1, 0);

		InputStream in2 = clazz.getResourceAsStream("/image/o.png");
		Image icon2 = new Image(in2);
		ImageView iconView2 = new ImageView(icon2);
		iconView2.setFitHeight(30);
		iconView2.setFitWidth(30);
		Labeled namePlayer2 = new Label("Player 2:");
		namePlayer2.setId("timeplayer");
		gridPaneBottom.add(namePlayer2, 0, 1);
		gridPaneBottom.add(iconView2, 1, 1);

		box.getChildren().add(gridPaneBottom);

		pane.setCenter(box);

	}

	boolean d;

	public void handle(ActionEvent e) {
		if (e.getSource() == btnExit) {
			primaryStage.close();
		}
		if (e.getSource() == btnHuman) {
			replayHuman();
			 btnHuman.setStyle("-fx-background-color: black;\r\n" + 
			 		"    -fx-scale-y: 1.1;\r\n" + 
			 		"    -fx-text-fill: white;\r\n" + 
			 		"    -fx-font-size: 22.0px;");
			 btnBoss.setStyle("-fx-background-radius: 15.0;\r\n" + 
				 		"	 -fx-min-height: 30.0px;\r\n" + 
				 		"	 -fx-font-style: oblique ;\r\n" + 
				 		"	 -fx-font-weight: bold;\r\n" + 
				 		"	 -fx-font-family: \"Times New Roman\", Times, Arial, sans-serif;\r\n" + 
				 		"	 -fx-wrap-text: true ;\r\n" + 
				 		"	 -fx-font-size: 20.0px;\r\n" + 
				 		"	 -fx-border-color: transparent ;");
			d = true;
		}
		if (e.getSource() == btnBoss) {
			replayBoss();
			 btnBoss.setStyle("-fx-background-color: black;\r\n" + 
			 		"    -fx-scale-y: 1.1;\r\n" + 
			 		"    -fx-text-fill: white;\r\n" + 
			 		"    -fx-font-size: 22.0px;");
			 btnHuman.setStyle("-fx-background-radius: 15.0;\r\n" + 
			 		"	 -fx-min-height: 30.0px;\r\n" + 
			 		"	 -fx-font-style: oblique ;\r\n" + 
			 		"	 -fx-font-weight: bold;\r\n" + 
			 		"	 -fx-font-family: \"Times New Roman\", Times, Arial, sans-serif;\r\n" + 
			 		"	 -fx-wrap-text: true ;\r\n" + 
			 		"	 -fx-font-size: 20.0px;\r\n" + 
			 		"	 -fx-border-color: transparent ;");
			d = false;
		}
		if (e.getSource() == btnUndo) {

			if (d == true) {
				controller.undo(arrayButtonChess);
			}
			if (d == false) {
				controller.undoBoss(arrayButtonChess);
			}
		}

		if (e.getSource() == btnAbout) {
			aboutUs();
		}
		
	}

	// che do 2 nguoi choi
	public void replayHuman() {
		controller.setPlayer(new Human(new Board(WIDTH_BOARD, HEIGHT_BOARD)));
		controller.setPlayerID(1);
		controller.reset(arrayButtonChess);

	}

	public void replayBoss() {
		controller.setPlayer(new Bot(new Board(WIDTH_BOARD, HEIGHT_BOARD)));
//		controller.setPlayerID(1);
		controller.reset(arrayButtonChess);
		gameMode();
	
	}

	// thong tin ve nhom phat trien
	public void aboutUs() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Luật chơi");
		alert.setHeaderText("Game được phát triển bởi Giabui");
		alert.setContentText("Thắng là đc !");
		alert.showAndWait();
	}
	public void gameMode() {
//		Alert gameMode = new Alert(AlertType.CONFIRMATION);
//		gameMode.setTitle("Chọn người chơi trước");
//		gameMode.setHeaderText("Bạn có muốn chơi trước không ?");
//		Optional<ButtonType> result = gameMode.showAndWait();
//		if (result.get() == ButtonType.CANCEL) {
			controller.move(WIDTH_BOARD / 2 - 1, HEIGHT_BOARD / 2, 2, arrayButtonChess);
			controller.setPlayerID(1);
//		} else {
//			controller.setPlayerID(1);
//		}
	}
}
