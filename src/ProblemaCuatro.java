import java.util.*;

public class ProblemaCuatro {
    public static void main(String[] args) {
        System.out.println("cuantas personas?");
        Scanner INPUT = new Scanner(System.in);
        Integer persons = INPUT.nextInt();
        if (persons <= 100){
            List<Integer> numberOfHits = new ArrayList<>();
            while (numberOfHits.size() < persons) {
                numberOfHits.add((int)(Math.random() * 20 + 0));
            }
            int minNumber = Collections.min(numberOfHits);
            int person = numberOfHits.indexOf(minNumber)+1;
            System.out.println(person);
        }else {
            System.out.println("Numero no valido");
        }
    }
}
