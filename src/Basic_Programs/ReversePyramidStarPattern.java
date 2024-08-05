package Basic_Programs;

public class ReversePyramidStarPattern {

    public static void main(String[] args) {

        int n = 5,i,j;

        for (i = n - 2; i >= 0; i--) {
            for (j = n - i; j > 1; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }

    }

}
