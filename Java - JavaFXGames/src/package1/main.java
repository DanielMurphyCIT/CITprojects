package package1;
import java.awt.Insets;
import java.util.HashMap;
import java.util.Random;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.value.ObservableNumberValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
// Author: Daniel Murphy
// 			SDH2-B
//			R00165402
public class main extends Application {
static HashMap<String, String> prizeMap = new HashMap<>(3);
    public static void main(String[] args) {
        launch(args);
    }
    
    @Override
    public void start(Stage stage) throws Exception{
    	
    	guess Guess = new guess();
    	lotto Lotto = new lotto();
    	
    	star star = new star();
    	
		prizeMap.put("Apple","10 euro");
		prizeMap.put("Pear","150 euro");
		prizeMap.put("Grape","200 euro");
    	
        TabPane pane = new TabPane();
        
        Tab guess_number = new Tab("Guessing Game");
        Label gWelcome = new Label("I am thinking of a number between 1 and 50, can you guess it?");
        VBox guessVBox = new VBox();
        TextField guessField = new TextField("");
        Button gStart = new Button("Start/Reset");
        gStart.setOnAction(e ->{Guess.guessSetup();});
        Button gGuess  = new Button("Guess");
        gGuess.setOnAction(e ->{
        	try {
        	Guess.guessPlay(guessField, Integer.parseInt(guessField.getText()));
        	}
        	catch(NumberFormatException n) {
        		guessField.setPromptText("Please enter a number between 1 and 50");
        	}
        	});
        
        guessVBox.getChildren().addAll(gWelcome, guessField,new HBox(gStart,gGuess));
        guess_number.setContent(guessVBox);
        pane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
     
        Tab lotto = new Tab("Lotto Game");
        Label lWelcome = new Label("Welcome to the REAL Irish Lotto. Please choose 6 numbers, from 1 - 9");
        VBox lottoVBox = new VBox();
        TextField lottoField = new TextField("");
        Button lStart = new Button("Start/Reset");
        lStart.setOnAction(e ->{Lotto.lottoSetup();});
        Button lGuess  = new Button("Guess");
        lGuess.setOnAction(e ->{
        	try {
        	Lotto.lottoPlay(lottoField, Integer.parseInt(lottoField.getText()));
        	}
        	catch(NumberFormatException n) {
        		lottoField.setPromptText("Please enter your 6 numbers");
        	}
        	});
        Button lQuit = new Button("Quit");
        lQuit.setOnAction(e ->{stage.close();});
        
        lottoVBox.getChildren().addAll(lWelcome, lottoField,new HBox(lStart,lGuess,lQuit));
        lotto.setContent(lottoVBox);
        pane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        Tab prize = new Tab("Prize");
        Label pWelcome = new Label("Welcome to the prize tab");
        VBox prizeVBox = new VBox();
        TextField prizeField = new TextField("");
        
        Button pApple = new Button("Apple");
        pApple.setVisible(false);
        pApple.setOnAction(e ->{prizeField.setPromptText("You win " + prizeMap.get("Apple"));});
        
        Button pPear = new Button("Pear");
        pPear.setVisible(false);
        pPear.setOnAction(e ->{prizeField.setPromptText("You win " + prizeMap.get("Pear"));});
        
        Button pGrape = new Button("Grape");
        pGrape.setVisible(false);
        pGrape.setOnAction(e ->{prizeField.setPromptText("You win " + prizeMap.get("Grape"));});
        
        Button stars = new Button("Show stars");
        stars.setOnAction(e ->{System.out.println(star.starCount);});
        Button update = new Button("Update prizes");
        update.setOnAction(e -> {
			if(star.starCount >= 3) {
				pApple.setVisible(true);
			}
			if(star.starCount >= 4) {
				pPear.setVisible(true);
			}
			if(star.starCount >= 5) {
				pGrape.setVisible(true);
			}
        });
        prizeVBox.getChildren().addAll(pWelcome, prizeField,new HBox(pApple,pPear,pGrape,stars,update));
        prize.setContent(prizeVBox);
        pane.setTabClosingPolicy(TabClosingPolicy.UNAVAILABLE);
        
        pane.getTabs().addAll(guess_number, lotto, prize);
       
        Scene scene = new Scene(pane);
       
        stage.setTitle("Title");
        stage.setX(400);
        stage.setY(100);
        stage.setHeight(500);
        stage.setWidth(600);
        stage.setScene(scene);
        stage.show();
    }


}