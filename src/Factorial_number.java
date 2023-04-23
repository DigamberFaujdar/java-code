public class Factorial_number {

    int factorial(int num)
    {
        int fact =1;
        for (int i=num;i>0;i--)
        {
            fact*=i;
        }
        return fact;

    }
    public static void main(String [] args)
    {
        Factorial_number factorialNumber=new Factorial_number();
        int result =factorialNumber.factorial(6);
        System.out.println("factorial is : "+result);
    }
}
