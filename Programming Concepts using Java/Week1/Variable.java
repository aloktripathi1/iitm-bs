public class Variable {

    public static void main(String[] args) {


    /*
        What is a Variable??

        - A variable is a labeled box that holds something.

        Real-world analogy:
        Imagine you have a box labeled age, and inside it, 
        you put the number 21. If someone asks, 
        “What’s in the age box?” — you say 21.

        In programming, variables let you:

        - Store values
        - Reuse them later
        - Change them

    */ 

    /*
        How do you create a variable in Java?

        1. declaration -> int age;
        2. assignment -> int age = 21;

        Breakdown:
        - int → The type of value: this says, “This box will hold whole numbers.”
        - age → The name of the box.
        - = → Think of this as “put into”.
        - 21 → The actual value.
        - ; → Required at the end of every statement in Java.

        So: “Create a box named age, that holds the number 21.”

    */

    //Let's do with an example:


        // int age = 21;
        // System.out.println("I am " + age + " years old");
    
        // Data Types

        //Primitve: Simplest value stored directly in memory(stack)
        //Reference: Memory address(stack) that points to the (heap)

        // Primitive😁            vs        Reference (Non-primitive)😒 

        // int -> 53                         string -> "Alok"
        // doube -> 38.43                    array ->  [1,2,3]
        // char -> "A"                       object -> 
        // boolean -> True/False    

        
        // int studentid = 123;
        // System.out.println("My enrollment id is " + studentid);
        
        // double cgpa = 9.44;
        // System.out.println("My cgpa is " + cgpa + " which is quite good");

        // char grade = 'A';
        // char symbol = '!';
        // char currency = '$';
        // System.out.println("My grade is " + grade + " and i pay " + currency + "2000 per semester" + symbol);

        // boolean isStudent = true;
        // //boolean forSale = False;

        // if(isStudent){
        //     System.out.println("You are a student!!");
        // }

        // else{
        //     System.out.println("You are not a student!!");
        // }
    
        // String name = "Alok Tripathi";

        // System.out.println("I'm " + name + " !!");


        String name = "Alok Tripathi";
        int age = 20;
        double cgpa = 8.98;
        char gender = 'M';
        boolean isStudent = true;

        System.out.println("I am " + name + ", BS degree student at IITM " + ", " + age + " years old, " + "with cgpa of " + cgpa + ", " + "gender: " + gender + " & student status: " + isStudent);
    
    }

}





