import java.util.Scanner;

public class user_input {
    
    public static void main(String[] args) {
        
        //We can accept user input with the help of Scanner
        /*
            Scanner is an object(class) that allows to 
            accept user input in java, however we need to
            import from certain packages called utilites or util.

            //import java.util.Scanner;

        */

        Scanner scanner = new Scanner(System.in);

        // // To read a String, nextLine() method is used.

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();
 
        // System.out.println("Hello " + name);
        // scanner.close();

        // Not closing scanner leads to unexpected behaviour;
        // lets say: 

        // To read an integer, nextInt() mehtod is used.

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();
         
        // System.out.println("My age is " + age);

        // // To read a float, nextDouble() method is used. 

        // System.out.println("What's you cgpa: ");
        // double cgpa = scanner.nextDouble();
        // System.out.println("My cgpa is "+ cgpa);

        // To accept boolean as input, nextBoolean() is used.

        // System.out.println("Are you a robot: ");
        // boolean isRobot = scanner.nextBoolean();
        // System.out.println("Robot   : " + isRobot);

        // if(isRobot){
        //     System.out.println("This is impossible, How human can be a Robot?");
        // }
        // else{
        //     System.out.println("Yeah, coz its not possible !!");
        // }
 
        // COMMON ISSUES

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter your favourite color: ");
        String color = scanner.nextLine();

        System.out.println("You are " + age + "years old");
        System.out.println("You like the color of " + color);
        
        //So the issue is after accepting
        scanner.close();


        /*

            scanner.next() doesn't read after spaces
            for eg: if Bro Code is the input then,
            it wont show after space and return Bro as Output

        */


    }

}
