// Assignment 3

import java.util.*;

public class Check {
     
    public static void main(String[] args) {

       int i = 0;
       String sentence;
       char letter;

        Scanner inputText = new Scanner(System.in);
        
        //Asking user to enter Sentence
        System.out.print("Enter a Sentence(any English sentence) : ");
        sentence = inputText.nextLine();
        
        // Asking user to Enter a Letter to Check in Given Sentence
        System.out.print("Enter a Letter(any letter from A to Z) : ");
        letter = inputText.nextLine().charAt(0);
        
        //Storing Sentence Length in Variable senLen
        int sentLen= sentence.length();
        
        //Traverse into the sentence and Checking Char of Each Sentence to the entered Letter
        for(i = 0; i < sentLen; i++) {
            if(sentence.charAt(i) == letter) {
                break;
            }
        }
        //Checking upto the Last Character of given Sentence & Showing Data
        if(i < sentLen - 1) {
            System.out.println("Result:"+sentence.substring(i + 1));
        }
        else {
            System.out.println("The letter does not exist in the sentence");
        }
    }
}