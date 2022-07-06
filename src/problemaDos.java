import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class problemaDos {
    public static void main(String[] args) throws FileNotFoundException {
        int number;
        int maxNumber = 0;
        int potition = 0;
        List<Integer> numbers = new ArrayList<>();
        File doc = new File("src/file.txt");
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine()){
            numbers.add(Integer.parseInt(obj.nextLine()));
        }
       for (int i = 0; i < numbers.size(); i++){
            number = numbers.get(i);
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
