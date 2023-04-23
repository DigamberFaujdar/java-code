import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        int fact;
        int facto=1;
        System.out.printf("enter a number");
        Scanner scan=new Scanner(System.in);
        fact=scan.nextInt();
        for (int i=1;i<=fact;i++)
        {
            facto=facto*i;
        }
        System.out.printf("Factorial is "+facto);
    }
}
