import java.util.Scanner;

public class FactorialOfGivenNumber {

    static String factorialOf(int num){

        int factorial = 1;
        for(int i = num; i>=1;i--){
            factorial *= i;
        }
        return "Factorial : "+factorial;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(factorialOf(number));

    }

}
