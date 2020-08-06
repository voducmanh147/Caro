package application;

import javafx.application.Application;

import javafx.stage.Stage;
import view.View;

public class Main extends Application {
// Bat dau khoi tao stage

	public void start(Stage primaryStage) {
		try {
			View view = new View();
			view.start(primaryStage);
			view.replayHuman();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
public static void main(String[] args) {
	launch(args);
}
}
