
import java.util.ArrayList;
import java.util.Scanner;

public class problemaUno {
    public static void main(String[] args){
        Scanner INPUT = new Scanner(System.in);
        long[] numberss = {};
        ArrayList<Long> numbers = new ArrayList<Long>();
        int count = 0;
        while (INPUT.hasNextDouble()) {
            numberss[count] = INPUT.nextLong();
            numbers.add(INPUT.nextLong());
            System.out.println("Ingrese un numero y oprima una letra para continuar");
            count = count+1;
        }
        System.out.println(numbers);
        for (int i = 0; i < numbers.size(); i++){
            ArrayList<Integer> dividingNumbers;
            dividingNumbers = divider((int) numberss[i]);
            boolean isPerfectNumber = isPerfectNumber(dividingNumbers, (int) numberss[i]);
            if (isPerfectNumber){
                System.out.println(numberss[i]+" es perfecto");
            }else System.out.println(numberss[i] + " no es perfecto");
        }
    }

    private static ArrayList<Integer> divider(int enteredNumber){
        ArrayList<Integer> dividingNumbers = new ArrayList<>();
        for(int i = 1; i <= enteredNumber; i++){
            if(enteredNumber%i==0){
                dividingNumbers.add(i);
            }
        }
        return dividingNumbers;
    }

    private static boolean isPerfectNumber(ArrayList<Integer> dividingNumbers, int enteredNumber){
        int sum = 0;
       for (int number : dividingNumbers) {
           if (number < enteredNumber){
               sum += number;
           }
       }
       if (sum == enteredNumber){
           return true;
       }
       return false;
    }
}
