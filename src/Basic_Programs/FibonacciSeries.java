package Basic_Programs;
import java.util.Scanner;

public class FibonacciSeries {

    static void fibonacciSeries(int count){

        int n1 = 0;
        int n2 = 1,i,n3;
        System.out.print(n1+","+n2);
        for(i=2;i<count;++i){
            n3 = n1 + n2;
            System.out.print(","+n3);
            n1 = n2;
            n2 = n3;
    }

    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the count: ");
        int count = sc.nextInt();
        fibonacciSeries(count);

    }

}

