import java.util.Scanner;

public class FactorsOfNumber {

    static void factorsOfNum(int num){

        System.out.print(1);

        for(int i = 2; i < num; i++){

            if(num%i==0){
               System.out.print(","+i);
            }

        }

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        factorsOfNum(number);

    }

}
