/*
  Ödev
  Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
*/

import java.util.Scanner;
import static java.lang.Math.min;
import static java.lang.Math.max;

public class Main
{
    public static void main(String[] args) {
        
        int num1, num2;
        Scanner input = new Scanner(System.in);
        
        System.out.print("1st Number: ");
        num1 = input.nextInt();
        
        System.out.print("2nd Number: ");
        num2 = input.nextInt();
        
        int min = min(num1, num2);
        int max = max(num1, num2);
        
        // EBOB
        int tempEBOB = min;
        while (num1%tempEBOB != 0 || num2%tempEBOB != 0) {
            tempEBOB--;
        }
        int EBOB = tempEBOB;
        System.out.println("EBOB: " + EBOB);
        
        // EKOK
        int tempEKOK = max;
        while (tempEKOK%num1 != 0 || tempEKOK%num2 != 0) {
            tempEKOK++;
        }
        int EKOK = tempEKOK;
        System.out.println("EKOK: " + EKOK);

    }
}
