
import java.util.ArrayList;
import java.util.Scanner;

public class problemaDos {
    public static void main(String[] args){
        System.out.println("Please enter a positive number ... ");
        Scanner INPUT = new Scanner(System.in);
        int number;
        int maxNumber=0;
        int potition = 0;
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Ingrese un numero");
            if (!INPUT.hasNextInt()){
                System.out.println("solo digite numeros");
                INPUT.next();
                i=i-1;
            }else{
                numbers[i] = INPUT.nextInt();
            }
        }
        for (int i = 0; i < numbers.length; i++){
            number = numbers[i];
            if(number > maxNumber)
            {
                potition = i+1;
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
        System.out.println(potition);
    }
}
