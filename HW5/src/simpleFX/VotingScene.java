package simpleFX;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class VotingScene extends Application {
	// Class for voting system
	// manually design
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage stage){
		Scene scene = new Scene(createRoot(), 300,100);
		stage.setTitle("Voting Scene");
		stage.setScene(scene);
		stage.show();
	}
	
	private int i ;
	
	private Parent createRoot() {
		// the main scene
		VBox v = new VBox();
		Button ofraBtn = new Button("Ofra Haza");			// create button
		Button yardenaBtn = new Button("Yardena Arazi");	// create button
		Label label = new Label("0");						// initialize text
		GridPane buttonsGrid = new GridPane();
		label.setFont(Font.font(null,FontWeight.BOLD,22));
		
		class Increaser implements EventHandler<ActionEvent> {
			@Override
			public void handle(ActionEvent event) {
				// every click -> increase & update 
				i++;
				label.setText("" + i);	
			}
		}
		class Decreaser implements EventHandler<ActionEvent> {
			@Override
			public void handle(ActionEvent event) {
				// every click -> decrease & update
				i--;
				label.setText("" + i);
			}
		}
		
		// some label style
		label.setFont(Font.font(null, FontWeight.BOLD, 18));
		label.setPrefHeight(40);    
		label.setStyle("-fx-background-color:red");
		label.setAlignment(Pos.CENTER);
		label.setMaxSize(192, 46);
		
		// buttons style
		ofraBtn.setMaxWidth(Double.MAX_VALUE);
		yardenaBtn.setMaxWidth(Double.MAX_VALUE);
		ofraBtn.setPadding(new Insets(5,10,5,15));
		yardenaBtn.setPadding(new Insets(5,10,5,15));
		ofraBtn.setOnAction(new Increaser());
		yardenaBtn.setOnAction(new Decreaser());
		
		buttonsGrid.add(ofraBtn, 0, 0);
		buttonsGrid.add(yardenaBtn, 2, 0);
		buttonsGrid.setPadding(new Insets(10,10,10,10));
		buttonsGrid.setHgap(40);
		
		v.setAlignment(Pos.CENTER);
		v.setPadding(new Insets(10));
		v.getChildren().addAll(buttonsGrid, label);
		return v;
		
		
		
		
	}

	
}

