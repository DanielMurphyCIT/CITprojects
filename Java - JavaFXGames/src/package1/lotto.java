package package1;

import java.util.Random;

import javafx.scene.control.TextField;

public class lotto {
int i;
int j;
int counter = 0;
int randomNumbers;
int[] winningNumbers = new int[6]; 


    public void lottoSetup()
    {   
    	System.out.println("The winning lotto numbers are:");
        for(i = 0; i < winningNumbers.length; i++ ){
        	winningNumbers[i]  = new Random().nextInt(9) + 1;
            System.out.print(winningNumbers[i]);
        
        }
        System.out.println("\n");
    }
    public void lottoPlay(TextField lottoField, int guess)
    { 
    	counter = 0;
    	String temp = Integer.toString(guess);
    	int[] numbers = new int[temp.length()];
    	for (int i = 0; i < temp.length(); i++)
    	{
    	    numbers[i] = temp.charAt(i) - '0';
    	}
       for(j = 0; j < numbers.length; j++){
    		if(numbers[j] == winningNumbers[j] ){
    			counter++;
            }
        }
    	if (counter == 5) {
            lottoField.setPromptText("Well done, you matched 5 numbers");
            lottoField.setText("");
            star.starCounter(4);
        }
    	else if(counter == 6){
            lottoField.setPromptText("Congratulations, you matched all numbers");
            lottoField.setText("");
            star.starCounter(5);
    	}
    	else {
            lottoField.setPromptText("Unlucky, Please try again");
            lottoField.setText("");
    	}
      
    }       
}        
    
