import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProblemaTres {
    private static final int PERCERTAGE_SALARY = 15;
    private static final int PERCERTAGE = 100;
    public static void main(String[] args) throws FileNotFoundException {
        List<Integer> numbers = new ArrayList<>();
        File doc = new File("src/salari.txt");
        double salary = 0;
        double sales = 0;
        double percentage = 0;
        double totalSalary = 0;
        int count = 1;
        Scanner obj = new Scanner(doc);
        while (obj.hasNextLine()){
            if (count == 2){
                salary = Double.parseDouble(obj.nextLine());
            }else if(count == 3){
                sales = Double.parseDouble(obj.nextLine());
            }else {
                obj.nextLine();
            }
            count = count+1;
        }
        percentage = (sales* PERCERTAGE_SALARY)/PERCERTAGE;
        totalSalary = percentage+salary;
        System.out.println("TOTAL = R$ "+String.format("%.2f", totalSalary)+" ");
    }
}
