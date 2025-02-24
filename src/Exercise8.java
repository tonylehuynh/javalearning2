import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args){

        // if statement


        Scanner scanner = new Scanner(System.in);

        int age;
        String name;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student (true/false): ");
        isStudent = scanner.nextBoolean();


        // 1
        if(name.isEmpty()){
            System.out.println("You didn't enter your name...");
        }
        else{
            System.out.println("\nHello " + name + "!");
        }



        // 2
        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if (age >= 18){
            System.out.println("You are an adult");
        }
        else if(age < 0){
            System.out.println("You are unborn...");
        }
        else if (age == 0){
            System.out.println("You are a new born baby!");
        }
        else{
            System.out.println("You are a child!");
        }

        // 3
        if(isStudent){
            System.out.println("You are a student.");
        }
        else{
            System.out.println("You are NOT enrolled.");
        }

        scanner.close();
    }
}
