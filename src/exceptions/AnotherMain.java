package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AnotherMain {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(divide());
    }

    private static int divide(){
        int x = getInt();
        int y = getInt();
        return x/y;
    }

    private static int getInt(){
        System.out.println("Please, enter a number:");
        while(true){
            try{
                return scanner.nextInt();
            }catch(InputMismatchException e){
                scanner.nextLine();
                System.out.println("Enter a number only. Use digits from 0-9");
            }
        }
    }
}