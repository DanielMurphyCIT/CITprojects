package package1;
import java.awt.Insets;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Labeled;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TabPane.TabClosingPolicy;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import java.util.Random;

public class guess{
int counter;
int numberToGuess;

    public void guessSetup()
    {
  
        //set guessField to zero
        counter = 0; //set counter to zero

        //set numberToGuess to a new random number
        Random random = new Random();
        numberToGuess = random.nextInt(50) + 1;
        System.out.println("Number to guess: " + numberToGuess);
    }
    public void guessPlay(TextField guessField, int guess)
    {
        
    	
        if(counter == 3)//Check it counter == 4
        {
            System.out.println("Game over");
            guessField.setPromptText("Game over! You lose!");
            guessField.setText("");
        }
        else{
            if(guess == numberToGuess)
            {
                System.out.println("You win");
                guessField.setPromptText("Your guess of " + guess + " is correct! You win!");
                guessField.setText("");
                star.starCounter(2);
            }
            else if(guess < numberToGuess)
            {
                System.out.println("You guessed to low");
                guessField.setPromptText("My number is Higher...");
                guessField.setText("");
                counter++;
            }
            else 
            {
                System.out.println("You guessed to high");
                guessField.setPromptText("My number is Lower...");
                guessField.setText("");
                counter++;
            }         
        } 
        
    }
}
