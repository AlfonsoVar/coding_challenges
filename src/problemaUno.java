
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problemaUno {
    private static final int MAX_NUM = 10000000;
    private static final int MIN_NUM = 1;
    public static void main(String[] args){
        Scanner INPUT = new Scanner(System.in);
        Scanner sizeArray = new Scanner(System.in);
        int maxNum = sizeArray.nextInt();;
        if (1 <= maxNum && maxNum >= 100){
            System.out.println("no puede ser mayor o igual de 100 los datos ingresados");
        }else {
            List<Integer> numbers = new ArrayList<>();
            while ((numbers.size() < maxNum) && INPUT.hasNextInt()) {
                Integer number = INPUT.nextInt();
                if (number <= MAX_NUM) {
                    numbers.add(number);
                }else{
                    System.out.println("numero no valido");
                }
            }
            System.out.println(numbers.size());
            for (int i = 0; i < numbers.size(); i++) {
                ArrayList<Integer> dividingNumbers;
                dividingNumbers = divider(numbers.get(i));
                boolean isPerfectNumber = isPerfectNumber(dividingNumbers, numbers.get(i));
                if (isPerfectNumber) {
                    System.out.println(numbers.get(i) + " es perfecto");
                } else {
                    System.out.println(numbers.get(i) + " no es perfecto");
                }
            }
        }
    }

    private static ArrayList<Integer> divider(long enteredNumber){
        ArrayList<Integer> dividingNumbers = new ArrayList<>();
        for(int i = 1; i <= enteredNumber; i++){
            if(enteredNumber%i==0){
                dividingNumbers.add(i);
            }
        }
        return dividingNumbers;
    }

    private static boolean isPerfectNumber(ArrayList<Integer> dividingNumbers, long enteredNumber){
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
