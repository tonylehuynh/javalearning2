import java.util.Random;
import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int number;
        int lower;
        int higher;

        System.out.print("Enter a starting number: ");
        lower = scanner.nextInt();
        System.out.print("Enter a higher number: ");
        higher = scanner.nextInt();

        number = random.nextInt(lower, higher+1);

        System.out.println("\nYour random number generated between " + lower + " and " + higher + " is:");
        System.out.println(number);

        double number2;
        System.out.println("Random decimal generated is: ");
        number2 = random.nextDouble();
        System.out.print(number2);

        boolean isHeads;
        System.out.println("\nYour coin flip:");
        isHeads = random.nextBoolean();
        if(isHeads){
            System.out.print("HEADS");
        }
        else {
            System.out.print("TAILS");
        }
    }
}
