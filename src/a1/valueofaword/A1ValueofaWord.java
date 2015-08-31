package a1.valueofaword;

/**
* Calculates the value of the word "Bunny", my favorite critter. 
* 
* CLASS:   CPT 163  Java Programming I
* AUTHOR:  Sharon R. Tinkey
* DATE:    08/30/15
* CHAPTER: 2
* PROGRAM: Assignment 1: The Value of a Word
*/

public class A1ValueofaWord {
    
    public static void main(String[] args) {
        // define variables
        int wordValue = 0;
        String wordIs = "Bunny";
        
        // dislay program heading
        System.out.println("Calculate the Value of a Word\n");
                
        // calculate the value of the word
        wordValue = wordIs.charAt(0) + wordIs.charAt(1) + wordIs.charAt(2) +
                wordIs.charAt(3) + wordIs.charAt(4);
               
        // display results
        System.out.println("The value of the word Bunny is " + wordValue +
                            "\n\n");
        
    }
    
}
