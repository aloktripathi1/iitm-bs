public class arithmetic_operators {
    public static void main(String[] args) {
        
        /*
        // Arithmetic Operators

        int a = 10;
        int b = 4;
        int c;

        // c = a+b;
        // c = a-b;
        // c = a*b;
        // c = a/b;      // result = 2 not 2.5 as / gives quotient
        // c = a%b;      // modulous operator -> gives remainder

        System.out.println(c);
        
        */

        /*

        // Arithmetic Assignment Operators

        
        int a = 11;
        int b = 2;

        // a += b;
        // a -= b;
        // a *= b;
        // a /= b;
        // a %= b;

        //while working with integer, it dont return decimals part as output.
        //to get decimals as output, double should be used.

        System.out.println(a);

        /*

        // Increment and Decrement Operators

        int a = 2;

        a++; //   increment -> it increases value of a by 1

        a--; //   decrement -> it decreases value of a by 1

        System.out.println(a);
        
         */

        // ORDER OF OPERATIONS [P-E-M-D-A-S]

        // P → Parentheses ()
        // E → Exponents → Math.pow(a, b) (Java doesn’t have ^ for powers)
        // MD → Multiplication *, Division /, Modulo %
        // AS → Addition +, Subtraction -

        double result = 3 + 4 * (7 - 5) / 2.0;

        System.out.println(result);

    }
}


