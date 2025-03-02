/**
 * Created by iyasuwatts on 10/17/17.
 * Modified by kristofer on Jan 2024.
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args ){
        // create a new object of class Main
        Main newObject = new Main();

        newObject.compute();
        // call the compute() method on that new object
    }

    public void compute() {
        // Get input string of name from user

         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter your name here: ");
         String input = scanner.nextLine().toLowerCase();
        // Create conditional to check name against Alice and Bob
         if(input.equals("alice") || input.equals("bob")){
             System.out.println("Hey, "+input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase()+" how are you doing today??");
         }else{
             System.out.println(input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase() + " you are neither Alice nor Bob !");
         }
        // Print greeting to screen if Alice or Bob are true
        
        // Print "You are neither Alice nor Bob." otherwise

    }
}
