import java.util.Random;

public class random {
    public static void main(String[]args){
        Random random = new Random();

        int number;

        number = random.nextInt();

        System.out.println(number);
    }
}