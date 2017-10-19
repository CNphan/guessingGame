package com.company;

import java.util.Scanner;

public class GuessGame {

   Player player1 = new Player();
   Player player2 = new Player();


    public void startGame(){

        Scanner sc = new Scanner(System.in);

        // Get the name for player1
        System.out.println("Player 1:");
        String player1Name = sc.nextLine();
        player1.name = player1Name;

        // Get the name for player2
        System.out.println("Player 2: ");
        String player2Name = sc.nextLine();
        player2.name = player2Name;

        //Correct Guess or Not
        boolean p1IsRight = false;
        boolean p2IsRight = false;

        // Get the targetNumber
        int TargetNumber = (int)(Math.random()*10)+1;
        String userInput;



        do{
            // Get the Guessing Number for player 1
            System.out.println("Player 1: Pick a number from 1 - 10. ");
            int player1Guess = sc.nextInt();
            player1.guess = player1Guess;

            // Get the Guessing Number for player 2
            System.out.println("Player 2: Pick a number from 1-10. ");
            int player2Guess = sc.nextInt();
            player2.guess = player2Guess;

            if(player1Guess == TargetNumber){
                p1IsRight = true;
                System.out.println(player1Name+ " won! the number is: "+TargetNumber);

                break;
            }else if (player2Guess == TargetNumber){
                p2IsRight = true;
                System.out.println(player2Name+ " won! the number is: "+TargetNumber);

                break;
            }
            else if((player1Guess == TargetNumber) && (player2Guess == TargetNumber)){
                p1IsRight = true;
                p2IsRight = true;

                System.out.println("Draw! The number is: "+TargetNumber);
                break;
            }
            else{
                System.out.println("Wrong answer.");
            }
            System.out.println("Do you want to continue?");
            userInput = sc.next().toUpperCase();
        }while(userInput.equals("YES"));

        if((p1IsRight == false)&&(p2IsRight == false)) {
            System.out.println("Thank you for playing, the answer is: " + TargetNumber);
        }
        else if ((p1IsRight == true)||(p2IsRight == true)){
            System.out.println("Thank you for playing");
        }
        sc.close();
}
}
