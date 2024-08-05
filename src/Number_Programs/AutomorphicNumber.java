package Number_Programs;

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

        System.out.println(isAutomorphicNumber(76)?"Automorphic":"Not Automorphic");
        System.out.println(isAutomorphicNumber(13)?"Automorphic":"Not Automorphic");

    }

}
