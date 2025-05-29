import java.util.Scanner;

public class studentCheck {
    public static void main(String[] args) {
        
        // if statement = performs a block of code if its condition is true

        Scanner scanner = new Scanner(System.in);

        String name;
        int age;
        boolean isStudent;

        //Group 1

        System.out.print ("Enter your name: ");
        name = scanner.nextLine();

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        System.out.print("Are you a student(True/False): ");
        isStudent = scanner.nextBoolean();

        if(name.isEmpty()){
            System.out.println("You didn't enter your name.😡");
        }
        else{
            System.out.println("Hello, " + name + "!😁");
        }

        // Group 2
        if(age >= 65){
            System.out.println("You are a senior.🧓");
        }
        else if(age >= 18){
            System.out.println("You are an adult.🙍");
        }
        else if(age < 0){
            System.out.println("You are an alien then.👽");
        }
        else if(age == 0){
            System.out.println("You are a baby.👶");
        }
        else{
            System.out.println("You are a child.🧒");
        }

        // Group 3

        if(isStudent){
            System.out.println("You are a student!🧑‍🎓");
        }
        else {
            System.out.println("No, You're NOT a student.🧑‍💼");
        }

        scanner.close();
    }
    
}
