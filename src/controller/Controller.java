/**
 * Lop dieu khien chinh 
 */
package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.Optional;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Labeled;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.FileChooser;
import model.Board;
import model.Bot;
import model.Human;
import model.Player;
import model.Point;
import view.View;

public class Controller {
	public View view;
	private Player player;
	private Stack<Point> stack; // ngan xep luu cac nuoc da di
	private Class<?> classImg; // lay anh quan co
	private InputStream o;
	private InputStream x;
	private Image imageO;
	private Image imageX;
	private boolean end;
	private int tongNuocDi;
	private String playerWin;
	Board boardState;
	
	public Controller() {
		getComponents();
	}

	private void getComponents() {
		end = false;
		tongNuocDi = 0;
		playerWin = "";
		stack = new Stack<>();
		classImg = this.getClass();
		o = classImg.getResourceAsStream("/image/o.png");
		x = classImg.getResourceAsStream("/image/x.png");
		imageO = new Image(o);
		imageX = new Image(x);
	}

	public Point AI() {
		return this.player.movePoint();
	}

	public int getPlayerID() {
		return player.getPlayerID();
	}

	public void setPlayerID(int playerFlag) {
		player.setPlayerID(playerFlag);
	}

	public Board getBoardState() {
		return player.getBoardState();
	}

	public int isOver(int x, int y) {
		if (tongNuocDi != (getBoardState().height * getBoardState().width)) {
			return player.getBoardState().isOver(x, y);
		}
		return 10;
	}

	public boolean isEnd() {
		return end;
	}

//	public boolean isValid(int x, int y) {
//		if (boardState.boardArr[x][y] != 0) {
//			return false;
//		}
//		return true;
//	}

	public void play(Button c, Button[][] a) {
		StringTokenizer tokenizer = new StringTokenizer(c.getAccessibleText(), ";");
		int x = Integer.parseInt(tokenizer.nextToken());
		int y = Integer.parseInt(tokenizer.nextToken());
		//
//		if (player instanceof Human) {
//			if (isOver(x, y) == 1) {
//				playerWin = 1 + "";
//				dialog("Player " + playerWin + " Win!");
//			}
//			if (isOver(x, y) == 2) {
//				playerWin = 2 + "";
//				dialog("Player " + playerWin + " Win!");
//			}
//			if (isOver(x, y) == 10) {
//				dialog("Player 1 Huề Player 2!");
//			}
//		} else {
//			if (playerWin.equals("1")) {
//				playerWin = "Sen";
//				dialog(playerWin + " Win!");
//			}
//			if (playerWin.equals("2")) {
//				playerWin = "Boss";
//				dialog(playerWin + " Win!");
//			}
//			if (isOver(x, y) == 10) {
//				dialog("Sen với Boss Huề");
//			}
//		}
		if (player instanceof Human) {
			Board aH = getBoardState();
			if (getPlayerID() == 1 && aH.boardArr[x][y] == 0) {
				move(x, y, 1, a);
				setPlayerID(2);
				if (isOver(x, y) == 1) {
					playerWin = 1 + "";
					dialog("Player " + playerWin + " Win!");
				}
				if (isOver(x, y) == 2) {
					playerWin = 2 + "";
					dialog("Player " + playerWin + " Win!");
				}
				if (isOver(x, y) == 10) {
					dialog("Player 1 Huề Player 2!");
				}
			} else {
				Board aM = getBoardState();
				if (getPlayerID() == 2 && aM.boardArr[x][y] == 0) {
					move(x, y, 2, a);
					setPlayerID(1);
				}
				if (isOver(x, y) == 1) {
					playerWin = 1 + "";
					dialog("Player " + playerWin + " Win!");
				}
				if (isOver(x, y) == 2) {
					playerWin = 2 + "";
					dialog("Player " + playerWin + " Win!");
				}
				if (isOver(x, y) == 10) {
					dialog("Player 1 Huề Player 2!");
				}
			}

		} else {
			if (getPlayerID() == 1) {
				if (getBoardState().getPosition(x, y) == 0) {
					
					move(x, y, 1, a);
					setPlayerID(2);
				}
				if (playerWin.equals("1")) {
					playerWin = "Sen";
					dialog(playerWin + " Win!");
				}
				if (playerWin.equals("2")) {
					playerWin = "Boss";
					dialog(playerWin + " Win!");
				}
				if (isOver(x, y) == 10) {
					dialog("Sen với Boss Huề");
				}
			}
			if (getPlayerID() == 2) {
				Point p = AI();
				move(p.x, p.y, 2, a);
				setPlayerID(1);
				if (playerWin.equals("1")) {
					playerWin = "Sen";
					dialog(playerWin + " Win!");
				}
				if (playerWin.equals("2")) {
					playerWin = "Boss";
					dialog(playerWin + " Win!");
				}
				if (isOver(x, y) == 10) {
					dialog("Sen với Boss Huề");
				}
			}
			

		}
		

	}

	public void move(int x, int y, int player, Button[][] arrayButtonChess) {
		getBoardState().setPosition(x, y, player);
		if (player == 1) {
			arrayButtonChess[x][y].setGraphic(new ImageView(imageX));
			Point point = new Point(x, y);
			point.setPlayer(1);
			stack.push(point);
			tongNuocDi++;
		} else {
			arrayButtonChess[x][y].setGraphic(new ImageView(imageO));
			Point point = new Point(x, y);
			point.setPlayer(2);
			stack.push(point);
			tongNuocDi++;
		}
		if (getBoardState().isOver(x, y) == player) {
			playerWin = player + "";
			end = true;
		}
	}

	void print(int[][] a) {
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

	// quay lại 1 nuoc co
	public void undo(Button[][] arrayButtonChess) {
		if (!stack.isEmpty()) {
			
			if (getPlayerID() == 1) {
				tongNuocDi--;
				Point point = stack.pop();
				Board e = getBoardState();
				e.boardArr[point.x][point.y] = 0;
				arrayButtonChess[point.x][point.y].setGraphic(null);
				setPlayerID(2);
			} else {
				tongNuocDi--;
				Point point = stack.pop();
				Board e = getBoardState();
				e.boardArr[point.x][point.y] = 0;
				arrayButtonChess[point.x][point.y].setGraphic(null);
				setPlayerID(1);
			}
		} else {
			reset(arrayButtonChess);
		}
	}

	public void undoBoss(Button[][] arrayButtonChess) {
		if (!stack.isEmpty()) {
			for (int i = 0; i < 2; i++) {
				tongNuocDi--;
				Point point = stack.pop();
				Board e = getBoardState();
				e.boardArr[point.x][point.y] = 0;
				arrayButtonChess[point.x][point.y].setGraphic(null);
			}

		}else {
			reset(arrayButtonChess);
		}
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public EventHandler<ActionEvent> action(String action) {
		return null;
	}

	EventHandler<ActionEvent> event = new EventHandler<ActionEvent>() {
		@Override
		public void handle(ActionEvent e) {

		}
	};

	public void dialog(String title) {
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Trò chơi kết thúc");
		alert.setHeaderText(title);
		alert.setContentText("Bạn có muốn chơi lại");

		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK) {
			if (getPlayer() instanceof Human) {
				view.replayHuman();
			} else {
				view.replayBoss();
			}
		} else {
			// su dung khi chon khong hoac dong hoi thoai
		}
	}

	public void setView(View view) {
		this.view = view;
	}

	public void setEnd(boolean end) {
		this.end = end;
	}

	public Player getPlayer() {
		return player;
	}

	public void reset(Button[][] arrayButtonChess) {
		tongNuocDi = 0;
		getBoardState().resetBoard();
		for (int i = 0; i < arrayButtonChess.length; i++) {
			for (int j = 0; j < arrayButtonChess[i].length; j++) {
				arrayButtonChess[i][j].setGraphic(null);
			}
		}
	}

}
