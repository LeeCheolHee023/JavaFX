package fxml;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AppRoot extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("Root.fxml")); // 실행되는 클래스안에서 리소스파일을 읽어오겠다
		Scene scene =  new Scene(root);										//
		
		primaryStage.setScene(scene);
		primaryStage.show();
		primaryStage.setTitle("FXML sample");
	}
	public static void main(String[] args) {
		launch(args);
	}
	
}
