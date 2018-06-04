package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String firstLevel,secondLevel,thirdLevel,fourthLevel;
        System.out.println("WELCOME TO MITCHELL'S TINY ADVENTURE!");
        System.out.println("You are in a creepy house!  Would you like to go \"upstairs\" or into the \"kitchen\"?");
        firstLevel = input.nextLine();

        if(firstLevel.equals("kitchen")){
            System.out.println("There is a long countertop with dirty dishes everywhere.  Off to one side\n" +
                    "there is, as you'd expect, a refrigerator. You may open the \"refrigerator\"\n" +
                    "or look in a \"cabinet\".");
            secondLevel = input.nextLine();

            if(secondLevel.equals("refrigerator")){
                System.out.println("Inside the refrigerator you see food and stuff.  It looks pretty nasty.\n" +
                        "Would you like to eat some of the food? (\"yes\" or \"no\")");
                thirdLevel = input.nextLine();

                if(thirdLevel.equals("no")){
                    System.out.println("You die of starvation... eventually.");
                }
                else if(thirdLevel.equals("yes")){
                    System.out.println("Enjoy the pizza inside the refrigerator. It is fresh. I was kidding earlier.");
                }
            }
            else if(secondLevel.equals("cabinet")){
                System.out.println("You are in the cabinet. There is a pandora box. Do you want to open it?(\"yes\" or \"no\")");
                thirdLevel=input.nextLine();
                if(thirdLevel.equals("yes"))
                {
                    System.out.println("You got trapped in the pandora box");
                }
                else{
                    System.out.println("You chose to be lucky. Good Job!!");
                }
            }
        }
        else if(firstLevel.equals("upstairs"))
        {
            System.out.println("Upstairs you see a hallway.  At the end of the hallway is the master\n" +
                    "\"bedroom\".  There is also a \"bathroom\" off the hallway.  Where would you like\n" +
                    "to go?");
            secondLevel=input.nextLine();
            if(secondLevel.equals("bedroom")){
                System.out.println("You are in a plush bedroom, with expensive-looking hardwood furniture.  The\n" +
                        "bed is unmade.  In the back of the room, the closet door is ajar.  Would you\n" +
                        "like to open the door? (\"yes\" or \"no\")");
                thirdLevel=input.nextLine();
                if(thirdLevel.equals("no"))
                {
                    System.out.println("Well, then I guess you'll never know what was in there.  Thanks for playing,\n" +
                            "I'm tired of making nested if statements.");
                }
                else if(thirdLevel.equals("yes"))
                {
                    System.out.println("Haha, you won the game. ");
                }
            }
            else if(secondLevel.equals("bathroom"))
            {
                System.out.println("Welcome to the bathroom level. Do you want to use the sink? (yes/no)");
                thirdLevel=input.nextLine();
                if(thirdLevel.equals("yes")){
                    System.out.println("The water is not working huhhahahahahah");
                }
                else if(thirdLevel.equals("no"))
                {
                    System.out.println("won the game hahahahahahahahahahahahah");
                }
            }

        }
    }
}
