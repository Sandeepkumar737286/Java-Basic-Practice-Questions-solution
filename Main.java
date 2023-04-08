import java.util.Scanner;
import java.util.Random;
class Wwtbam{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnum=0;
        int num1, num2, num3, num4 = 0;
        String lifeline1= "1";
        String lifeline2="2";
        String lifeline3="3";
        String a = "a";
        String b = "b";
        String c = "c";
        String d = "d";
        String guess = "0";
        String guess1="0";
        String guess2="0";
        String guess3 = "0";
        String name;
        String finalanswer = "0";
        String x = "yes";
        String y = "no";
        String one = "What does NBA most commonly stand for? \n A. National Basketball Association \n B. New Brunswick Accounting \n C. Nevada Bowling Association \n D. Nile Boating Associates \n 1. 50/50 \n 2. Poll the audience \n 3. Ask a friend";
        String two = "Which country invented hockey? \n A. Iceland \n B. Canada \n C. Australia \n D. China \n 1. 50/50 \n 2. Poll the audience \n 3. Call a friend";

        System.out.println("What is your name?");
        name = scanner.nextLine();
        System.out.println("Welcome to Who Wants to be a Millionaire! As I'm sure you know, you will have to answer 13 questions correctly in a row. \n But you have 3 lifelines to work with: 50/50, poll the audience, or ask a friend \n So, " + name+ " lets begin! You have a chance to win ONE MILLION DOLLARS!!! \n\n\n\n\n");

        randomnum = random.nextInt(2)+1;
        if (randomnum ==1) {
            do {
                do{
                    System.out.println(one);
                    guess=scanner.nextLine();
                    if ((!guess.equalsIgnoreCase(a) && !guess.equalsIgnoreCase(b) && !guess.equalsIgnoreCase(c) && !guess.equalsIgnoreCase(d)&&!guess.equalsIgnoreCase(lifeline1)&&!guess.equalsIgnoreCase(lifeline2)&&!guess.equalsIgnoreCase(lifeline3))) {
                        System.out.println("Invalid Input. Please Try Again. \n\n");
                    }
                } while(!guess.equalsIgnoreCase(a) && !guess.equalsIgnoreCase(b) && !guess.equalsIgnoreCase(c) && !guess.equalsIgnoreCase(d)&&!guess.equalsIgnoreCase(lifeline1)&&!guess.equalsIgnoreCase(lifeline2)&&!guess.equalsIgnoreCase(lifeline3));
                System.out.println("Is this your final answer? (yes or no)");
                finalanswer=scanner.nextLine();
            } while (!finalanswer.equalsIgnoreCase(x));

            if (guess.equalsIgnoreCase(a)) {
                System.out.println("You got it right! Congrats!");
            }
            else if ((guess.equalsIgnoreCase(b)) || (guess.equalsIgnoreCase(c)) || (guess.equalsIgnoreCase(d))) {
                System.out.println("Sorry you got it wrong :( \n Better luck next time");
            }
        }

        if (guess.equals(lifeline1)){
            System.out.println("You chose the 50/50 lifeline!");
            do{
                do{
                    System.out.println("Your choices are now between: \n A. National Basketball Association \n C. Nevada Bowling Association");
                    guess1 = scanner.nextLine();
                    if ((!guess1.equalsIgnoreCase(a) && !guess1.equalsIgnoreCase(b) && !guess1.equalsIgnoreCase(c) && !guess1.equalsIgnoreCase(d)&&!guess1.equalsIgnoreCase(lifeline1)&&!guess1.equalsIgnoreCase(lifeline2)&&!guess1.equalsIgnoreCase(lifeline3))) {
                        System.out.println("Invalid Input. Please Try Again. \n\n");
                    }
                } while(!guess1.equalsIgnoreCase(a) && !guess1.equalsIgnoreCase(b) && !guess1.equalsIgnoreCase(c) && !guess1.equalsIgnoreCase(d)&&!guess1.equalsIgnoreCase(lifeline1)&&!guess1.equalsIgnoreCase(lifeline2)&&!guess1.equalsIgnoreCase(lifeline3));

                System.out.println("Is this your final answer? (yes or no)");
                finalanswer=scanner.nextLine();

            } while(!finalanswer.equals(x));

            if (guess1.equals(a)) {
                System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
            }
            else {
                System.out.println("Sorry you got it wrong :(");
            }
        }

        else if (guess.equalsIgnoreCase(lifeline2)) {
            System.out.println("You chose the poll the audience lifeline!");

            num1 = random.nextInt(10)+80;
            num2 = random.nextInt(6)+1;
            num3 = random.nextInt(5)+1;
            num4 = 100 - (num1+num2+num3);
            do{
                do{
                    System.out.println("The audience, out of 100 people said: \n A. National Basketball Association: "+ (num1)+ " \n B. New Brunswick Accounting: "+num2+ "\n C. Nevada Bowling Association: "+num3+" \n D. Nile River Boating: "+num4 + "\n\n Enter your new guess:");
                    guess2 = scanner.nextLine();
                    if (!guess2.equalsIgnoreCase(a) && !guess2.equalsIgnoreCase(b) && !guess2.equalsIgnoreCase(c) && !guess2.equalsIgnoreCase(d)&&!guess2.equalsIgnoreCase(lifeline1)&& !guess2.equalsIgnoreCase(lifeline2)&& !guess2.equalsIgnoreCase(lifeline3)) {
                        System.out.println("Invalid Input. Please Try Again. \n\n");
                    }
                } while(!guess2.equalsIgnoreCase(a) && !guess2.equalsIgnoreCase(b) && !guess2.equalsIgnoreCase(c) && !guess2.equalsIgnoreCase(d)&&!guess2.equalsIgnoreCase(lifeline1)&& !guess2.equalsIgnoreCase(lifeline2)&& !guess2.equalsIgnoreCase(lifeline3));

                System.out.println("Is this your final answer? (yes or no)");
                finalanswer=scanner.nextLine();

            } while(!finalanswer.equals(x));
            if (guess2.equals(a)) {
                System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
            }
            else {
                System.out.println("Sorry you got it wrong :(");
            }
        }


        else if(guess.equalsIgnoreCase(lifeline3)) {
            System.out.println("You chose the call a friend lifeline!");
            do{
                System.out.println("Your friend says: Oh it's definitely A! I grew up watching the National Basketball Association and playing basketball!");
                do{
                    System.out.println("What is your answer?");
                    guess3 = scanner.nextLine();
                    if ((!guess3.equalsIgnoreCase(a) && !guess3.equalsIgnoreCase(b) && !guess3.equalsIgnoreCase(c) && !guess3.equalsIgnoreCase(d)&& !guess3.equalsIgnoreCase(lifeline1)&& !guess3.equalsIgnoreCase(lifeline2)&&!guess3.equalsIgnoreCase(lifeline3))) {
                        System.out.println("Invalid Input. Please Try Again. \n\n");
                    }
                } while(!guess3.equalsIgnoreCase(a) &&!guess3.equalsIgnoreCase(b)&& !guess3.equalsIgnoreCase(c) && !guess3.equalsIgnoreCase(d)&& !guess3.equalsIgnoreCase(lifeline1)&& !guess3.equalsIgnoreCase(lifeline2)&& !guess3.equalsIgnoreCase(lifeline3));

                System.out.println("Is this your final answer? (yes or no)");
                finalanswer=scanner.nextLine();

            } while(!finalanswer.equals(x));
            if (guess3.equals(a)) {
                System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
            }
            else {
                System.out.println("Sorry you got it wrong :(");
            }
        }



        else if (randomnum==2){
            do {
                do{
                    System.out.println(two);
                    guess=scanner.nextLine();
                    if ((!guess.equalsIgnoreCase(a) && !guess.equalsIgnoreCase(b) && !guess.equalsIgnoreCase(c) && !guess.equalsIgnoreCase(d)&&!guess.equalsIgnoreCase(lifeline1)&&!guess.equalsIgnoreCase(lifeline2)&&!guess.equalsIgnoreCase(lifeline3))) {
                        System.out.println("Invalid Input. Please Try Again. \n\n");
                    }
                } while(!guess.equalsIgnoreCase(a) && !guess.equalsIgnoreCase(b) && !guess.equalsIgnoreCase(c) && !guess.equalsIgnoreCase(d)&&!guess.equalsIgnoreCase(lifeline1)&&!guess.equalsIgnoreCase(lifeline2)&&!guess.equalsIgnoreCase(lifeline3));
                System.out.println("Is this your final answer? (yes or no)");
                finalanswer=scanner.nextLine();
            } while (!finalanswer.equalsIgnoreCase(x));

            if (guess.equalsIgnoreCase(b)) {
                System.out.println("You got it right! Congrats!");
            }
            else if((guess.equals(a)) || (guess.equals(c)) || (guess.equals(d))) {
                System.out.println("Sorry you got it wrong :( \n Better luck next time");
            }

            else if(guess.equalsIgnoreCase(lifeline1)) {
                System.out.println("You chose the 50/50 lifeline!");
                do{
                    do{
                        System.out.println("Your choices are now between: \n A. Iceland \n B. Canada");
                        guess1 = scanner.nextLine();
                        if ((!guess1.equalsIgnoreCase(a) && !guess1.equalsIgnoreCase(b) && !guess1.equalsIgnoreCase(c) && !guess1.equalsIgnoreCase(d)&&!guess1.equalsIgnoreCase(lifeline1)&&!guess1.equalsIgnoreCase(lifeline2)&&!guess1.equalsIgnoreCase(lifeline3))) {
                            System.out.println("Invalid Input. Please Try Again. \n\n");
                        }
                    } while(!guess1.equalsIgnoreCase(a) && !guess1.equalsIgnoreCase(b) && !guess1.equalsIgnoreCase(c) && !guess1.equalsIgnoreCase(d)&&!guess1.equalsIgnoreCase(lifeline1)&&!guess1.equalsIgnoreCase(lifeline2)&&!guess1.equalsIgnoreCase(lifeline3));

                    System.out.println("Is this your final answer? (yes or no)");
                    finalanswer=scanner.nextLine();

                } while(!finalanswer.equals(x));
                if (guess1.equals(b)) {
                    System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
                }
                else {
                    System.out.println("Sorry you got it wrong :(");
                }
            }

            else if(guess.equalsIgnoreCase(lifeline2)) {
                System.out.println("You chose the poll the audience lifeline!");

                num1 = random.nextInt(10)+20;
                num2 = random.nextInt(10)+55;
                num3 = random.nextInt(5)+3;
                num4 = 100 - (num1+num2+num3);
                do{
                    do{
                        System.out.println("The audience, out of 100 people said: \n A. Iceland: "+ (num1)+ " \n B. Canada: "+num2+ "\n C. Australia: "+num3+" \n D. China: "+num4 + "\n\n Enter your new guess:");
                        guess2 = scanner.nextLine();
                        if (!guess2.equalsIgnoreCase(a) && !guess2.equalsIgnoreCase(b) && !guess2.equalsIgnoreCase(c) && !guess2.equalsIgnoreCase(d)&&!guess2.equalsIgnoreCase(lifeline1)&& !guess2.equalsIgnoreCase(lifeline2)&& !guess2.equalsIgnoreCase(lifeline3)) {
                            System.out.println("Invalid Input. Please Try Again. \n\n");
                        }
                    } while(!guess2.equalsIgnoreCase(a) && !guess2.equalsIgnoreCase(b) && !guess2.equalsIgnoreCase(c) && !guess2.equalsIgnoreCase(d)&&!guess2.equalsIgnoreCase(lifeline1)&& !guess2.equalsIgnoreCase(lifeline2)&& !guess2.equalsIgnoreCase(lifeline3));

                    System.out.println("Is this your final answer? (yes or no)");
                    finalanswer=scanner.nextLine();

                } while(!finalanswer.equals(x));
                if (guess2.equals(b)) {
                    System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
                }
                else {
                    System.out.println("Sorry you got it wrong :(");
                }
            }


            else if(guess.equalsIgnoreCase(lifeline3)) {
                System.out.println("You chose the call a friend lifeline!");
                do{
                    System.out.println("Your friend says: Oh I think its B? I grew up in the U.S. but I remember the Canadians always winning the Olympic Gold Medal and lots of ceremonies for hockeys anniversaries. B is my best guess.");
                    do{
                        System.out.println("What is your answer?");
                        guess3 = scanner.nextLine();
                        if ((!guess3.equalsIgnoreCase(a) && !guess3.equalsIgnoreCase(b) && !guess3.equalsIgnoreCase(c) && !guess3.equalsIgnoreCase(d)&& !guess3.equalsIgnoreCase(lifeline1)&& !guess3.equalsIgnoreCase(lifeline2)&&!guess3.equalsIgnoreCase(lifeline3))) {
                            System.out.println("Invalid Input. Please Try Again. \n\n");
                        }
                    } while(!guess3.equalsIgnoreCase(a) &&!guess3.equalsIgnoreCase(b)&& !guess3.equalsIgnoreCase(c) && !guess3.equalsIgnoreCase(d)&& !guess3.equalsIgnoreCase(lifeline1)&& !guess3.equalsIgnoreCase(lifeline2)&& !guess3.equalsIgnoreCase(lifeline3));

                    System.out.println("Is this your final answer? (yes or no)");
                    finalanswer=scanner.nextLine();

                } while(!finalanswer.equals(x));
                if (guess3.equals(b)) {
                    System.out.println("You got it right!!! Congrats " + name+ " !! \n\n");
                }
                else {
                    System.out.println("Sorry you got it wrong :(");
                }
            }
        }
    }
}