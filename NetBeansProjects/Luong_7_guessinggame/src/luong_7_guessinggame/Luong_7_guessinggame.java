/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_guessinggame;
import java.util.Random;
import java.util.Scanner;   
/**
 *
 * @author mluong
 */
public class Luong_7_guessinggame {
   static String username;
    static String yn;
    static int userguess;
    static int magicnumber;
    static Random Micheal = new Random();
    static boolean stopplay = false;
    static boolean playagain;
    static int counter = 10;
   
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       playagain = true;
       magicnumber = Micheal.nextInt(100);
       Scanner guess = new Scanner(System.in);
       System.out.println("Hello, would you like to play");
       Scanner yes_no = new Scanner(System.in);
       yn = yes_no.nextLine();
       System.out.println("What is your name?");     
       Scanner userinputname = new Scanner(System.in);
       username = userinputname.nextLine();
       System.out.println("Hello " + username);
       while (playagain && counter > 0){
           playthegame();           
       }
       playthecounter();
       
    }
    static void playthegame() {
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println( "Please pick a number between 1-100");
        userguess = userinputnumbers.nextInt(10);
        playagain = true;
        if (magicnumber == userguess) {
            System.out.println("You win!!!");
            playagain = false;
        }else if (magicnumber > userguess) {
            System.out.println("too low ");
            counter--;
            System.out.println("You have " + counter + " tries left.");
        }
        else {
            System.out.println("Too High. Try again");
            counter--;
            System.out.println("You have " + counter + " tries left.");
        }
        
          
              
                  
              
                  
          
                
    }
    static void playthecounter() {
        if(counter == 0) {
            System.out.println("You have ran out of tries"); 
            System.out.println("The magic number was " + magicnumber);
        }
    }
      }  


 

