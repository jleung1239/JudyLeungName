package JLeung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name +", nice to meet you!");

	// write your code here

        System.out.println("How old are you?");
        input = new Scanner(System.in);
        int age = input.nextInt();
        System.out.println(name + " is " + age + " years old.");
    }
}
