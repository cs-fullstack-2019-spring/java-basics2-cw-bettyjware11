import java.util.Scanner;
public class Main {
    //Exercise 1:
//Print 0 through 100 using a while loop.
    public static void main(String[] args) {
//        int count = 0;
//        while (count <= 100){
//            System.out.println(count);
//            count++;
//        }

//    Exercise 2:
//    Print only the even numbers between 0 and 100 using a for loop
//        int count = 2;
//        while (count <= 100) {
//            System.out.println(count);
//            count += 2;

//        }

//Exercise 3:
//Prompt the User for a number. Create a function in your program that counts from 0 to [NUMBER]
//        Scanner reader = new Scanner(System.in);
//        System.out.println("ENTER A NUMBER");
//        double num1 = reader.nextInt();
//            int count = 0;
//            while (count <= num1) {
//                System.out.println(count);
//                count ++;

//        }

//Exercise 4:
//Prompt the User for secret word. Create a while loop that will continually ask the Player to guess the secret word until it’s correct, or 5 wrong guesses have been made. Once it’s correct print THAT’S CORRECT!!! and also how many guesses it took to get it right. If the Player doesn't get the secret word after 5 tries, end the program and print Sorry! Out of guesses :-(

        Scanner reader = new Scanner(System.in);
        System.out.println("ENTER secret word");
        String secret1 = reader.nextLine();
        System.out.println("ENTER secret word");
        String secret2 = reader.nextLine();

        if (secret1.equals(secret2)){
            System.out.println("That's Correct");
        }
        else if (secret1 != secret2) {
            System.out.println("Guess again");
        }


    }
}


