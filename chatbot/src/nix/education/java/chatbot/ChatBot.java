package nix.education.java.chatbot;

import java.util.Scanner;

public class ChatBot {
    public static void main (String[] args){
        System.out.println("Hello! My name is Dred");
        System.out.println("I was created in 2021");
        System.out.println("Please,remind me your name");
        Scanner scanner = new Scanner(System.in);
        String myName = scanner.next();
        System.out.println("What a great name you have, " + myName + "!");

        System.out.println("Let me guess your age.");
        int valueFirst = scanner.nextInt();
        int valueSecond = scanner.nextInt();
        int valueThird = scanner.nextInt();
        int age = (valueFirst * 70 + valueSecond * 21 + valueThird * 15) % 105;
        System.out.println("Your age is " + age + ";" + " that's a good time to start programming!");

        System.out.println("Now i will prove to you that i can count to any number you want");
        var num = scanner.nextInt();
        System.out.println(num);

        for(int a=0; a<num+1; a++) {
            System.out.println(a + "!");
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1." + "To repeat a statement multiply times");
        System.out.println("2." + "To decompose a program into several small subroutines");
        System.out.println("3." + "To determine the execution time of a program");
        System.out.println("4." + "To interrupt the execution of a program");


        var choose = scanner.nextInt();

        while (choose !=2) {
            System.out.println("Please try again.");
            choose = scanner.nextInt();
        }
        System.out.println("Great, you right!");
        System.out.println("Goodbye, have a nice day!");
    }
}


