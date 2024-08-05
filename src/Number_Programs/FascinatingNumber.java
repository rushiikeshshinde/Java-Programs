package Number_Programs;

import java.util.Scanner;

public class FascinatingNumber {

    static void isFascinatingNumber(int num){

        int n2,n3;
        boolean found = true;

        n2 = num * 2;
        n3 = num * 3;

        String concatStr = num + ""+n2+n3;

        for (char c ='1'; c<='9';c++){
            int count = 0;
            for(int i = 0;i<concatStr.length();i++){
                char ch = concatStr.charAt(i);

                if(ch==c){
                    count++;
                }
            }
            if(count > 1 || count == 0){
                found = false;
                break;
            }
        }
        if(found){
            System.out.println(num+ " is a Fascinating Number.");
        }
        else {
            System.out.println(num+ " is not a Fascinating Number.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        isFascinatingNumber(number);
        sc.close();

    }

}
