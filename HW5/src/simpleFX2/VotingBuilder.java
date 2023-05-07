package simpleFX2;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class VotingBuilder extends Application {

	@SuppressWarnings("unused")
	@Override
	public void start(Stage stage) {
		VBox vbox;
		ValueController controller;
		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(getClass().getResource("SceneBuilder.fxml"));
			vbox = loader.load();
			controller = loader.getController();
			stage.setTitle("Voting Machine");
			Scene scene = new Scene(vbox);
			stage.setScene(scene);
			stage.show();
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
