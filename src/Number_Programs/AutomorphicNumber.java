package Number_Programs;

import java.util.Scanner;

public class AutomorphicNumber {

    static boolean isAutomorphicNumber(int num){

        int square = num * num;
        while (num>0){
            if(num%10 != square%10)
            return false;
            num/=10;
            square/=10;

        }
        return true;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println(isAutomorphicNumber(number)?number+ " is Automorphic":number+" is Not Automorphic");
        sc.close();
    }

}
