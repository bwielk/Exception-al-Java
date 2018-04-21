package exceptions;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){
//        System.out.println(divideBYL(x, y));
//        System.out.println(divideEAFP(x, y));
//        System.out.println(divide(x, y));
//        getNumbers();
        System.out.println("The result is " + getNumbersLBYL());
    }

    private static Integer getNumbersLBYL(){
        boolean isValid = true;
        System.out.println("Please, enter a first number:");
        String firstInput = scanner.next();
        for(int i=0; i<firstInput.length(); i++){
            if(!Character.isDigit(firstInput.charAt(i))){
                isValid = false;
                break;
            }
        }
        if(isValid){
             return Integer.parseInt(firstInput);
        }
        return 0;
    }

    private static void getNumbers(){
        System.out.println("Please, enter a first number:");
        int firstNum = scanner.nextInt();
        System.out.println("Please enter a second number:");
        int secondNum = scanner.nextInt();
        System.out.println("RESULT: " + divideLBYL(firstNum, secondNum));
    }

    //Before you leap
    private static int divideLBYL(int x, int z){
        if(z != 0){
            return x/z;
        }else{
            return 0;
        }
    }

    //Easier to ask for permission that forgiveness
    private static int divideEAFP(int x, int z){
        try{
            return x/z;
        }
        catch(ArithmeticException e){
           return 0;
        }
    }

    public static int divide(int x, int y){
        return x/y;
    }
}
