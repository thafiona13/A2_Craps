/*
 Fiona Xie
4/8/2020
Plays game of craps
 */
package a2_craps;
import java.util.Scanner; //Scanner
public class A2_craps {
    
    public static int roll(){ // method for generating the random dice roll
    int min = 1; // minuminm roll number
    int max = 6; // maximum roll number
    int result = (int) ((Math.random()*((max-min)+1))+min); //randominizes
    return result; //returns number
    }
            
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); // scanner
        String input; // variable that stores input
        
        System.out.println("Welcome to CRAPS");
        System.out.println("Press \"Y\" or \"y\" to start the game.");
        System.out.print("Input: ");
        input = x.nextLine(); 
        
        while ((input.equals("Y")) || (input.equals("y"))){ // game only runs if user enters Y or y
            int d1 = roll(); // records number of first dice
            int d2 = roll();// records number of second dice
            
            System.out.println("First dice: "+d1);
            System.out.println("Second dice: "+d2);
            
            int tot = d1+d2; // total of the two dice
            System.out.println("Total: "+tot);
            
            
            if (tot == 7 || tot == 11){ // if total is 7 or 11, user wins
                
                System.out.println("Congratulations, you win the game!");
            }
            else if(tot == 2 || tot == 3 || tot == 12){ // if total is 2,3 or 12, user lose
                
                System.out.println("You lose.");
            }
            else{
                int point = tot;
                System.out.println("Point, roll again? Press \"P\" or \"p\" to continue"); // if total is none of the above, rolls again; point
                System.out.print("Input: ");
                input = x.nextLine();
                
                    while ((input.equals("P"))||(input.equals("p"))){
                        d1 = roll(); // records number of first dice
                        d2 = roll();// records number of second dice
            
                        System.out.println("First dice: "+d1); // rolls first #
                        System.out.println("Second dice: "+d2); // rolls second #
            
                        tot = d1+d2; // total of the two dice
                        System.out.println("New Total: "+tot); // total of new roll
                        System.out.println("Original Total: "+point); // total of orignal roll
                        
                        if (tot == point){ // if new total is equal to old total
                            System.out.println("Congrations, you won point!"); // game is won
                            break; // exits point 
                        }
                        else{
                            System.out.println("Roll Again? Press \"P\" or \"p\""); // ask users if they want to roll again, runs if p or P is pressed
                            System.out.print("Input: "); 
                            input = x.nextLine();
                        }
                }
                
            }
            System.out.println("Play Again? Press \"Y\" or \"y\""); // ask user whatever they want to play again, user enters y or Y
            System.out.print("Input: ");
            input = x.nextLine();
        }

    }
    
}
