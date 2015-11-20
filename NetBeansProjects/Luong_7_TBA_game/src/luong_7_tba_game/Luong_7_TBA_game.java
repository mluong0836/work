/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package luong_7_tba_game;
    import java.util.Scanner;
    import java.util.Random;
/**
 *
 * @author mluong
 */
public class Luong_7_TBA_game {
    static String username;
    static String enter;
    static String strings; // used to reply when the player fails a challenge
    static String fdoor;
    static String direction;
    static String answer; // this is used to let the player respond to yes and no questions
    static String attack;
    static Random arenafight_r = new Random ();//this will randomly select different leveled monkeys in red portal version
    static Random arenafight_y = new Random ();//this wil randomly select different leveld monkeys in yellow portal version
    static int monsterchoices_y_r; //This is the numbers that will be selected in the random monster generator in yellow portal version
    static int playerhealth;
    static int monsterhealth;//this is the monster's health for challenge 1...challenge 2 will be more complicated so I have to make another health bar
    static int zero = 0;
    static int spiderhealth;// This is the enemy that you have to defeat when the random generator spits out number 1
    static int goblinshealth;// This is the second type of enemy the player can encounter in yellow portal version
    static int golbathealth;// This is the third type of enemy one can encounter as the player and Separt attempts to defeat 
    static Scanner responses  = new Scanner(System.in); //this is the scanner for all the responses in the game.
    static boolean items;
    static boolean spells;
    static boolean door;
    static boolean gameplay;
    static boolean monsterisalive;
    static Scanner next = new Scanner(System.in); // this is used to let the player press the enter key to continue
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         intro();
    } 
    
    static void player_fights() { //method that introduces the fighting in challenge 1 of both versions
        monsterisalive = true;
        monsterhealth = 50; //this is a level one monster
        playerhealth = 200; //this is the player's maximum health

        do {
          
            if(monsterisalive = true){
                System.out.println("Use you spells to defeat your enemies...");
                System.out.println("Which attack do you want to use? Fire Spell, Ice Spell, or run");
                attack = next.nextLine();
                if(attack.contains("f")) {
            System.out.println(username + " uses his fire spell...FOOOSH!!!");
            enter = next.nextLine();
            System.out.println("The monster lost 30 HP");
            enter = next.nextLine();
            monsterhealth = monsterhealth-30;            
        }else if(attack.contains("i")) {
            System.out.println(username + " uses his ice spell...GHAAAA!!!");
            enter = next.nextLine();
            System.out.println("The monster loses 20 HP");
            enter = next.nextLine();
            monsterhealth = monsterhealth-20;                  
        }else{
            System.out.println(username + " there's no turning back");
            
        }
            }
            /*make sure that this if statement is outside the main if statement that introduces the do while loop
           location matters, not following this formula will keep cycling through this method without ever continuing the main story */
            
              if(monsterhealth == zero) {
                monsterisalive = false;
                //condition that will exit the while loop and return back to the main game
                  System.out.println("You won");
            }else if(monsterisalive = true){ 
                
                /* I placed the if statement for the monster here so it won't interfere with the player's fighting
                //if you were to place this statement somewhere inside if(monsterisalive = true), you would keep going
                until it is done going over the entire battle play. */
                
                    System.out.println("It's the monster's turn...Be prepared!");
                    enter = next.nextLine();
                    System.out.println("The monster engulfs you in a dark portal and throws you back out!");
                    enter = next.nextLine();
                    System.out.println("OUCH!!! You lose 10 HP!");
                    enter = next.nextLine();
                    playerhealth = playerhealth-10;
                }
              //this is the if statement that will determine whether or not the player continues to fight
              //if the player's HP reaches zero...the player will be forced to withdraw and return to the current checkpoint
              // * check statement *
              if(playerhealth == zero){
                  System.out.println("Oh no...you lost all your HP!");
                  backtocheckpoint1();
              }
             
        }while(monsterisalive);      
    }   
    
    static void yellow_fight () { //This is the method to allow randomly selected monsters to fight the player and Separt
        monsterchoices_y_r = arenafight_y.nextInt(5);
        monsterhealth = 150;
        playerhealth = 500; // player leveled up to level 5 with 500 HP
        if (monsterchoices_y_r == 1 ) {
            System.out.println("You encountered a giant spider with " + spiderhealth + " health");
            spider_fight();
        }else if(monsterchoices_y_r == 2) {
            System.out.println("YOu encountered a goblin with " + goblinshealth + " health");
            goblin_fights();    
    }else if(monsterchoices_y_r == 3) {
            System.out.println("YOu encountered a golbat with " + golbathealth + " health");
            golbat_fight();
    }
        
    }
    
    static void spider_fight() {
        enter = next.nextLine();
        System.out.println("You ");
        
    }
    static void red_fight() { //This is the method to randomly select monkeys to fight the player and Kongo
        
    }
    
    static void intro() { //This is where you would here the story line
        System.out.println("Welcome to ABANDONED SPELLS. What is your name?");
        Scanner userinputname = new Scanner(System.in);
        username = userinputname.nextLine();
        System.out.println(username + " here is a reminder...When you don't see text appear, press enter, this game will force you to read ");
        System.out.println("INSTRUCTIONS!!!!");
        System.out.println(username + ", you had a depressing day today and was seeking refuge in an abandoned house, so you could ");
        System.out.println("be alone, comforted by the isolation of the outside world.");
        System.out.println("You had a lot of fun in the house, discovering hidden secrets that was forbidden to know. ");
        System.out.println("It turns out that the book lying on the ground is a spell book from the Dark Ages.");
        System.out.println("You were able to cast several spells, an introduction to the world of witchcraft.");
        System.out.println("Thinking that you can bring back knowledge about witchcraft and casting spells.");
        System.out.println("YOU WERE WRONG!!! You now have to deal with the evil spirits that guarded this book.");
        System.out.println("There is no turning back now, use your spells to cast your way out of this mess or at least get out of here alive.");
        System.out.println("GOOD LUCK " + username );
        System.out.println("Press enter to continue.");
        enter = next.nextLine();
        System.out.println("Choose which door you would want to go through. Door 1 or Door 2.");
        Scanner choose = new Scanner(System.in);
        fdoor = choose.nextLine();
        if(fdoor.contains("1")) {
            door = true;
        }else {
            door = false;
        }
            if(door) {
                Door1intro();
           }else {
                Door2_intro();
            }
    }
       static void Door1intro() {  //challenge 1
           System.out.println("You are now currently in the living room...It is probably safe.");
           System.out.println("Do you agree?");
           String response;
           response = responses.nextLine();
           System.out.println("YOU're WRONG...The creatures are chasing you. Navigate your way in the dark");
           System.out.println("and use your spells to destroy the enemies.");
           System.out.println("Press enter to continue...");
           enter = next.nextLine();
           System.out.println(username + " Use your fire spell to disintegrate your enemy");
           System.out.println("Use your ice spell to freeze your opponents");
           System.out.println("Use your brain to navigate through this dark arena... ");
           System.out.println("Are you ready?");
           enter = next.nextLine();
           Door1challenge();
       }
       
       static void Door1challenge() {
           
           System.out.println("Ready. 3...2...1...GO!");
           System.out.println("Where do you want to go? Left, Right, or Straight");
           direction = next.nextLine();
           //this is where the player will decide where to go
           //the rest of the maze will branch off from this decision. These choices will have the same outcome.
           
               if(direction.contains("left")) {
                   door1challenge_leftpath();
                   //player enters the left branch
                   
           }else if(direction.contains("right")){
                    System.out.println("Oh NO!!!! You fell into the pit.");
                    backtocheckpoint1(); //this will bring the player back to the beginning of the challenge
                    
           }else{
               door1challenge_straightpath();
           }
       }
       
       static void door1challenge_leftpath() {
           System.out.println("You met a creature! Use your powers to defeat it.");
           player_fights();
            //This will go to a different section of the game with a left path.
            //after you defeat the creature
            System.out.println(username + ", You defeated the beast");
            enter = next.nextLine();
            System.out.println("Now there is a straight path ahead and a curved path to the right.");
            System.out.println("Which way do you want to go. Straight or right?");
            direction = next.nextLine();
             //part 2 wave
                if(direction.contains("straight")) {
                        System.out.println("You met another creature! Use your powers to defeat the creature");
                        player_fights();
                        //after you beat the creature
                        System.out.println(username + ", you defeated the beast...you're on a roll!");
                        enter = next.nextLine();
                        System.out.println("Now there is a path directing you forward and a path directing you to the left");
                        System.out.println("Which path way would you like to pass? Left or straight?");
                        direction = next.nextLine();
                        if(direction.contains("left")) {
                            System.out.println("Oh NO!!! You fell in the trap.");
                            backtocheckpoint1();
                     
                            }else{
                                System.out.println("Looks like it is a safe path. Look there is only a path leading");
                                System.out.println("to the left. Shall we take that path?");
                                answer = responses.nextLine();
                                if(answer.contains("yes")) {
                                       System.out.println("You met another creature! Defend yourself!");
                                       player_fights();
                                       //after you beat the creature
                                       System.out.println("Great job " + username + ", you defeated the creature!");
                                       enter = next.nextLine();
                                       door1challenge_commonpath();
                            }
                        }
                         
                    }else { //going right (linked path)
                        System.out.println("You met another creature! Use your powers to defeat the creature");
                        player_fights();
                        //after you beat it
                        System.out.println(username + ", you defeated the beast...you're on a roll!");
                        enter = next.nextLine();
                        System.out.println("Here is another tough choice...There are two diverging paths, do");
                        System.out.println("you want to take the right or the straight path");
                        direction = next.nextLine();
                            if(direction.contains("right")) {
                                System.out.println("Oh No!!! You fell into the pit!");
                                backtocheckpoint1();
                            }else if(direction.contains("straight")) {
                                System.out.println("Here is another creature." + username + "get ready to exterminate it");
                                player_fights();
                                //after winning
                                System.out.println("Great job, you're a pro");
                                enter = next.nextLine();
                                door1challenge_commonpath();
                                
                            }
                        }
       }
       
       static void door1challenge_straightpath() {
            System.out.println("It looks safe...There is a straight path ahead. Press enter to continue.");
            enter = next.nextLine();
            //next choice
            System.out.println("looks like you're still safe...continue ahead or turn to the right and use that path?");
            direction = next.nextLine();//this is where you chose which way to go...also a linked path.
                 if(direction.contains("right")) {
                        System.out.println("Oh NO!!! You fell in the trap!");
                        backtocheckpoint1();
                        
                        } else{
                            System.out.println("Creature encountered... Fight this creature to continue.");
                            //after winning
                            System.out.println("You beat the creature!");
                            enter = next.nextLine();
                            //this next path is a linked path too.
                            System.out.println("Now, you can either go straight or take the right route.");
                            System.out.println("Which one do you want to go through: the right or the straight path?");
                            direction = next.nextLine();
                                if(direction.contains("right")) {
                                    System.out.println("OH NO " + username + ". You fell into the pit");
                                    backtocheckpoint1();
                                } else {
                                    door1challenge_commonpath();
                                }
                        }
                }
    
       
       
       static void Door2_intro() {
           System.out.println("You are now currently in the basement ...It is probably safe.");
           System.out.println("Besides...who would think of hiding in the basement anyways?");
           System.out.println("Do you agree?");
           //String response;
           answer = next.nextLine();
           System.out.println("YOU're WRONG...The creatures are chasing you. Navigate your way in the dark");
           System.out.println("and use your spells to destroy the enemies.");
           System.out.println("Press enter to continue...");
           enter = next.nextLine();
           System.out.println(username + " Use your fire spell to disintegrate your enemy");
           System.out.println("Use your ice spell to freeze your opponents");
           System.out.println("Use your brain to navigate through this dark arena... ");
           System.out.println("Are you ready for the challenge?");
           answer = next.nextLine();
           if(answer.contains("yes")){
               Door1challenge();
           }else if(answer.contains("no")) {
               System.out.println("Too bad!!! There's no other way out of this mess. Go kick some monster's behind!");
               Door2challenge();
       }else{
               Door2_intro();
           }
       }
       
       static void Door2challenge() { //This is where the second variation of the first challenge arrives
           System.out.println("Ready! 3...2...1...GO!");
           System.out.println("Where do you want to go? Left, Right, or Straight");
           direction = next.nextLine();
           //this is where the player will decide where to go
           //the rest of the maze will branch off from this decision. These choices will have the same outcome.
           
               if(direction.contains("left")) {
                   door2challenge_leftpath();
                   //player enters the left branch maze
                   
           }else if(direction.contains("right")){
                    door2challenge_rightpath();
                    //player enters the right branch of the maze
                    
           }else if(direction.contains("straight")){
               door2challenge_straightpath();
               //player enters the straight branch of the maze
           }else{
               System.out.println("I don't understand...type it correctly!!!");
               Door2challenge();
           }
           
       }
       
       static void door2challenge_leftpath() {
           System.out.println("The area looks safe... Continue on " + username + " on the straight path ahead.");
           System.out.println("You met a creature! Get ready to FIGHT!");
           enter = next.nextLine();
           player_fights();
           //when you defeat the creature
           System.out.println(username + ", You defeated the beast");
           System.out.println("Continue on..."); 
           //There is a straight path up ahead that the player will take to advance
           enter = next.nextLine();
           System.out.println("There is now only a curved path ahead... Take that path now.");
           System.out.println("OH NO... It was a trap. You fell into molten lava");
           enter = next.nextLine();
           backtocheckpoint1_version2();  //Dead end...Will return back to the first challenge second version
}
       
       static void door2challenge_rightpath() {
           System.out.println("YOu met a creature...");
           System.out.println("Get ready to RIP!!!");
           player_fights();
           //after you beat the creature...
           System.out.println("You killed it!!! " + username + "You are on a roll!");
           enter = next.nextLine();
           System.out.println("There is a straight path ahead take the path and continue to survive long enough to escape the creatures");
           System.out.println("grasp...");
           enter = next.nextLine();
           //when you take that straight path...
           System.out.println("It looks safe here... Shall we continue?");
           answer = responses.nextLine();
           //Choice doesn't matter...you still have to continue
           System.out.println("No time to think " + username + " the creatures are behind you...run");
           enter = next.nextLine();
           System.out.println("There are two diverging paths. Do you want to take the left or the right path?");
           answer = next.nextLine();
           if(answer.contains("left")) {
               System.out.println("You met a creature!");
               System.out.println(username + ", prepare yourself...");
               enter = next.nextLine();
               player_fights();
               //after you beat the monster you will go into another method which is a linked path...
               System.out.println("Congratulations you beat the monster"); {
               door2_linkedpath(); //this is the linked path with the straight path branch.
           }
           }else if (answer.contains("right")) {
               System.out.println("OH NO!!!" + username + " fell into the hole with razor sharp knives ");
               backtocheckpoint1_version2();
               
           }else{ //in case if the player mistypes the code, they will be punished by getting dragged back to an earlier checkpoint
               System.out.println(username +" Please retype your response correctly. ");
               System.out.println("There is no horse playing at a time like this... ");
               System.out.println("The monsters dragged you back...Luckily you escaped");
               enter = next.nextLine();
               System.out.println("Looks like you're back to the place where you just made your decision of taking the right path");
               door2challenge_rightpath(); 
           }
               
           
       }
       
       static void door2challenge_straightpath() { // straight branch of version 2 
           System.out.println("Oh Look! There is a creature charging directly at you");
           System.out.println("Brace Yourself " + username + "!!!");
           enter = next.nextLine();
           player_fights();
           //after you defeat the monster...
           System.out.println("Now there is another straight path up ahead take that path now.");
           enter = next.nextLine();
           System.out.println("Do you hear anything? Well, I don't. It must be safe for here...Shall we continue?");
           answer = responses.nextLine();
           System.out.println("WHA HA HA HA!!! VRMMMM!");
           enter = next.nextLine();
           System.out.println("You don't have much time...Hurry up and take the path!");
           enter = next.nextLine();
           System.out.println("Now there are two diverging paths. One leading you straight ahead and the other one ");
           System.out.println("curving to the right");
           System.out.println("Which path would you like to take straight or right?");
           answer = responses.nextLine();
           if(answer.contains("straight")) {
               System.out.println("AHHHH!!! The creatures trapped you... " + username + "!");
               System.out.println(username + " fell into the creatures grasp and was thrown into the molten rocks to burn.");
               backtocheckpoint1_version2();
           }else if(answer.contains("left")) {
               System.out.println("It appears to be safe");
               enter = next.nextLine();
               System.out.println("Let's sit for awhile and relax.");
               System.out.println("GET THAT " + username + "!");
               System.out.println("That kid is going to be killed when I come there!");
               //Here is a brief statement of the main antagonist of the game...More will be revealed as 
               //the player advances in the game.
               enter = next.nextLine();
               System.out.println("'Who's voice is that'/ Could that voice be the voice you heard as you gain your magic? ");
               enter = next.nextLine(); 
               //this hints to the later interaction between the witch and the player
               System.out.println("No time to sit...Hurry and move");
               enter = next.nextLine();
               door2_linkedpath();
               /*this is the path that links both branches the straight and the right branch that the
               player took in the beginning of the challenge.*/
          }
          
         
       }
       
       
       static void door2_linkedpath() {
           System.out.println("There is a straight path ahead take that route now if you want to live.");
           enter = next.nextLine();
           System.out.println("The path seems to be safe...");
           System.out.println("Let's take a break");
           System.out.println("MUHA HA HA HA!!!");
           System.out.println("Not again...Sorry " + username + ", break time is already over.");
           enter = next.nextLine();
           System.out.println("There is are three diverging paths...Which one do you want to cross?");
           System.out.println("The left, right , or straight path?");
           answer = responses.nextLine();
           if(answer.contains("left")) {
               System.out.println("Looks safe...");
               enter = next.nextLine();
               System.out.println("ROAR!!!! / AHHH!!!");
               System.out.println("The hounds tore you apart...");
               enter = next.nextLine();
               backtocheckpoint1_version2();//this will lead you back to the beginning of the challenge
           }else if (answer.contains("straight")) {
               System.out.println("BLOOPPP!!! You fell to your death!");
               enter = next.nextLine();
               //this was a dead end, as a result, the player will be transported back to the beginning of the challenge.
           }else{ //the player takes the right passage
               System.out.println("It appears to be safe... Let's just keep going");
               enter = next.nextLine();
               System.out.println("You met a creature...Let's show how good you've become!");
               enter = next.nextLine();
               player_fights();
               //after you beat the creature...
               System.out.println("You beat the creature...There seems to be an opening up ahead...Take the path.");
               enter = next.nextLine();
               completeddoor2challenge();
           }
       }
       
       static void backtocheckpoint1() {
           //Back to check point one version 1
           System.out.println("You came back to the main entrance of challenge 1...Are you ready to restart this challenge?");
           strings = responses.nextLine();
           Door1challenge();
       }
       
       static void backtocheckpoint1_version2() {
           //Back to check point one version 2
           System.out.println("You arrived to the main entrance of challenge 1... Are you ready to restart this challenge?");
           strings = responses.nextLine();
           if (strings.contains("n")) {
               System.out.println("It's not an option"); 
               backtocheckpoint1_version2();
           }else if (strings.contains("y")) { 
               Door2challenge();
           }else {
               System.out.println("I don't understand...type it correctly");
               backtocheckpoint1_version2();//in case the player types something else that the system can't read
           }
                   
                  
           
       }
       
       static void door1challenge_commonpath() {
            System.out.println("You completed the first task. Take the red key on the table.");
            System.out.println("Use it to unlock the next door.");
            enter = next.nextLine();
            enddoorsurvey();//this is when you finish the task and take a brief break
           
       }
       
       static void completeddoor2challenge() {
           System.out.println("You completed the first task. Take those red keys on the table.");
           System.out.println(username + " take the keys");
           enter = next.nextLine();
           System.out.println("Could this be the key to your survival?");
           enter = next.nextLine();
           enddoorsurvey();//this is when you are done with the task and follow up questions will began shortly.
           
    
}
       static void enddoorsurvey() {
           System.out.println("The small creatures that you have just encountered is just an introduction to your quest.");
           System.out.println("How do you feel about this? Good or bad?");
           answer = responses.nextLine();
           //talk about the keys
           if(answer.contains("good")) {
               System.out.println("Well " + username + ", you are going to like the rest of this journey.");
               redkeys_unlock();
           }else if(answer.contains("bad")) {
               System.out.println("Sucks for you, it was you that decided to read the spell book in the first place.");
               redkeys_unlock();
           }else{
               System.out.println("I don't understand...can you say that one more time?");
               enddoorsurvey();
           }
       }
       
       static void redkeys_unlock() {
           System.out.println(username + ", you now have the keys to unlock the doors. Hurry before they catch you!");
           enter = next.nextLine();
           System.out.println("You see a massive gate...Do you want to check it out?");
           answer = responses.nextLine();
           if(answer.contains("yes")) {
               System.out.println("The door seems to be locked...");
               System.out.println("perhaps you should use your red key and see what happens.");
               //red keys will allow you to go to challenge 2
               enter = next.nextLine();
               System.out.println("The door is unlocked. When you take a peak inside you see two different colored portals.");
               System.out.println(username + " take a better look inside.");
                answer = next.nextLine();
                portal_introduction();
           }else if(answer.contains("no")){
                   //this will introduce you to the next challenge
                   portal_denied();
                   //this will lead back to the living room where you will understand that you must go through the portals
               }else{
               System.out.println("I don't understand what you are trying to say... Please redo this again.");
               redkeys_unlock();
           }
           }
       
       
       static void portal_introduction() {
           System.out.println("There are two portals that obviously lead to different paths.");
           enter = next.nextLine();
           System.out.println("You learned that in order to be teleported you must repeat a line and jump into the portal");
           System.out.println("Are you ready?");
           answer = next.nextLine();
           if(answer.contains("no")) {
               System.out.println("There's no turning back, you must go now!");
           }else if(answer.contains("yes")) {
               System.out.println("Alright...Which portal would you like to go through?");
               System.out.println("The Yellow or Red one");
               answer = responses.nextLine();
               //this is used to record the player's responses
               if(answer.contains("y")) { //this will lead player to yellow portal storyline
                   System.out.println("alright...say 'portal open for your master commands you' and then jump in");
                   //these are the lines that the protagonist will say and do to go to the next challenge
                   enter = next.nextLine();
                   System.out.println(username + " said ");
                   System.out.println(" 'portal open for your master commands you' ");
                   enter = next.nextLine();
                   System.out.println(username + " then jumps into the yellow portal.");
                   enter = next.nextLine();
                   yellowportal(); //this is where the player will be teleported into the Yellow River of China               
               }else if (answer.contains("r")) { // in the case if the player wants to chose the red portal
                   System.out.println("alright...say 'portal open for your master commands you' and then jump in");
                   //these are the lines that the protagonist will say and do to go to the next challenge
                   enter = next.nextLine();
                   System.out.println(username + " said ");
                   System.out.println(" 'portal open for your master commands you' ");
                   enter = next.nextLine();
                   System.out.println(username + " then jumps into the red portal.");
                   enter = next.nextLine();
                   redportal(); //this is where the player will be transported into the Amazon rainforest
               }
           }else{
               portal_introduction();
           }
       }
       
       static void yellowportal() { //The setting starts in the Yellow River in China. Intro to the challenge
           System.out.println( username + " closes the weary eyes that have witnessed so much chaos.");
           enter = next.nextLine();
           System.out.println("SWSSSS...SWSSSS...SWSSSS");//sound of flooding water
           System.out.println("What is this, why on earth are we in China...the Yellow River to be exact!");
           System.out.println("What does this have to do with anything...Did you say the right spell?");
           enter = next.nextLine();
           System.out.println("Blurp...Blurp...Floooosh...Blurp....");
           enter = next.nextLine();
           System.out.println("What is this...the river is rising. Quich run " + username + ".");
           enter = next.nextLine();
           System.out.println(username + " drowns in the river and wakes up weary from all the thrashing and swirming");
           System.out.println("from the day before");
           enter = next.nextLine();
           System.out.println( username + " just remembered what had happen.");
           System.out.println("You were thrown into the flooding waters and survived...how could have you survived this flood");
           enter = next.nextLine();
           System.out.println("You suddenly hear a crowd of people or creatures roaring...time to get up on your feet again.");
           //the yelling is caused by monsters 
           enter = next.nextLine();
           //a new protagonist/hero is here to support the player. The name is Separt. Separt will be involved within fights.
           System.out.println("Run to your left...stated a lizard");
           enter = next.nextLine();
           System.out.println("Wait... who are you? asked " + username);
           enter= next.nextLine();
           System.out.println("'The name is Separt");
           System.out.println("I was the yellow portal that you summoned to come help you, stated Separt.");
           System.out.println("I am now your apprentice...you are my master.'");
           enter = next.nextLine();
           System.out.println("I guess you now have support ot help you fight these new monsters.");
           System.out.println("Separt came at good timing. These creatures are way stronger that the ones you have fought.");
           enter = next.nextLine();
           System.out.println("'We have to fight all of those creatures before you can destroy that wicked witch...'");
           System.out.println("stated Separt");
           enter = next.nextLine();
           System.out.println("Alright, lets kick some butts today!!!");
           play_yellowportal();//this is the battle arena that the player and his sidekick will play
       }
       
       static void redportal() { //The setting starts in the Amazon Rainforest where tribes of monkeys will hunt you down
           //intro to red portal
           System.out.println(username + " closes the weary eyes which have seen so much destruction lately.");
           enter = next.nextLine();
           System.out.println("Suddenly you hear rustles of leaves...where are you?");
           enter = next.nextLine();
           System.out.println("OOH OOH AHH AHH");
           enter = next.nextLine();
           System.out.println("Are those monkey sounds that you hear. Wait...");
           System.out.println("The monkeys, the trees, the portal...");
           enter = next.nextLine();
           System.out.println("You got transported into the Amazon Rainforest...What does this have to do with your survival");
           enter = next.nextLine();
           System.out.println("Watch out master " + username);
           enter = next.nextLine();
           System.out.println("Why is the ground shaking and did someone just say your name?");
           enter = next.nextLine();
           System.out.println("You see a gorilla rampaging towards you. AHHHHH!!!");
           enter = next.nextLine();
           System.out.println("'Don't worry, I'm not here to hurt you. I was summoned by you to provide support");
           System.out.println("I'm the red portal'");
           enter = next.nextLine();
           System.out.println("Wow! Spells really help you when you really need it.");
           System.out.println("What's your name " + username + " stated");
           enter = next.nextLine();
           System.out.println("The names Kongo...");//new protagonist named Kongo will assist you in your battles
           enter = next.nextLine();
           System.out.println("'Look " + username + ", to kill that wicked witch you need to defeat those monkeys up there.'");
           System.out.println("stated Kongo.");
           enter = next.nextLine();
           System.out.println("Alright lets kick some butts today!!!");
           play_redportal();//this is the battle arena that the player and his sidekick will play
       }
       
       //this is where the second challenge begins in the yellow version
       static void play_yellowportal () {
           System.out.println("Here is challenge 2");
           System.out.println("In this challenge you would have to defeat all 10 levels without being killed...watch");
           System.out.println("out for your HP.");
           System.out.println("3...2...1...Ready-or Not...GO!!!");
           enter = next.nextLine();
           System.out.println("");
       }
       
       //this is where the second challenge begins in the red version
       static void play_redportal () {
           System.out.println("Here is the second challenge");
           System.out.println("In this challenge you will have to defeat all the monkeys in 5 different levels.");
           System.out.println("Be careful...Your HP sets the boundaries");
           enter = next.nextLine();
           System.out.println("Alright...3...2...1...Ready- or NOT...GO!!!");
           enter = next.nextLine();
           System.out.println("");
       }
       
       static void portal_denied() { //this will take the player into the living room in which the player will understand that
                                     //they must turn back and go inside the portals.
           System.out.println("Ok...let's turn left and go to the living room");
           enter = next.nextLine();
           System.out.println("Wait!");
           enter = next.nextLine();
           System.out.println("What is that noice?");
           enter = next.nextLine();
           System.out.println("Creak...Creak...Creak...");
           System.out.println(username + " sees a thousand of creatures surrounding the living room.");
           System.out.println("I don't think it is a veery good idea to take them on at once. They might look small,");
           System.out.println("but are extremely ferocious...I suggest you turn back");
           enter = next.nextLine();
           System.out.println( username + " returns to the portals");
           enter = next.nextLine();
           portal_introduction(); //this will take the player back to the portals that the player first had a choice to decide
                                  //whether or not he/she wanted to open the massive gate
       }
}