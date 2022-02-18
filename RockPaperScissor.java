import java.lang.Math;
import java.util.Scanner;

public class RockPaperScissor {
    
    public static void main(String[] args){
        boolean Replay = true;
        while (Replay == true){
        int rounds, i, rand, Comp, User, Tie;
        String mypick,choice,Continue;
        String[] choices = {"Rock", "Paper", "Scissors"}; 
        User = 0;
        Comp = 0;
        Tie = 0;


        Scanner inputReader = new Scanner(System.in); 
        System.out.println("How many rounds would you like to play?"); 
        rounds = Integer.parseInt(inputReader.nextLine());


        if (rounds > 10 || rounds < 1){ 
            System.out.println("Number of rounds is out of bounds!");
            System.exit(0); 
        }
        i = 0;
        while (i < rounds){
            rand = (int)(Math.random() * 3) + 0;
            choice = choices[rand]; 
            System.out.println("This is round "+ (i+1));
            System.out.println("Please pick 'Rock', 'Paper', or 'Scissors'");
            mypick = inputReader.nextLine(); //restart loop is entry is invalid
            System.out.println("User: " + mypick + " | Computer: " + choice);
            
            
            if (mypick.equals("Rock")){
                if (choice.equals("Scissors")){
                    User +=1;
                    System.out.println("User wins this round!");
                }else if (choice.equals("Paper")){
                    Comp +=1;
                    System.out.println("Comp wins this rounds!");
                }else{
                    Tie +=1;
                    System.out.println("This round is a tie!");
                }
            }

            else if (mypick.equals("Paper")){
                if (choice.equals("Rock")){
                    User +=1;
                    System.out.println("User wins this round!");
                }else if (choice.equals("Scissors")){
                    Comp +=1;
                    System.out.println("Comp wins this rounds!");
                }else{
                    Tie +=1;
                    System.out.println("This round is a tie!");
                }
            }
            else if (mypick.equals("Scissors")){
                if (choice.equals("Paper")){
                    User +=1;
                    System.out.println("User wins this round!");
                }else if (choice.equals("Rock")){
                    Comp +=1;
                    System.out.println("Comp wins this rounds!");
                }else{
                    Tie +=1;
                    System.out.println("This round is a tie!");
                }
            }
            
            i++;
            }

        
    
    if (User > Tie && User > Comp){
        System.out.println("You are the winner!");
    }else if (Comp > User && Comp > Tie){
        System.out.println("The Computer is the Winner!");
    }else if (Tie > User && Tie > Comp){
        System.out.println("Overall Tie!");
    }
    System.out.println("User: " + User + " | " + "Tie: " + Tie + " | " + "Comp: "+ Comp);
    System.out.println("Would you like to play again? (Y/N)");
    Continue = inputReader.nextLine();
    if (Continue.equals("y") || Continue.equals("Y")){
            Replay = true;
            System.out.println("Playing again!");
       } else if (Continue.equals("n") || Continue.equals("N")) {
           Replay = false;
           System.out.println("Thanks for playing!");
           inputReader.close();
       }
    }
}
    }


