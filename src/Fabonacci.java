public class Fabonacci{
    void  fabonacci(int num)
    {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        for (int i=0;i<num-2;i++)
        {
            int sum=a+b;
            System.out.println(sum);
            a=b;
            b=sum;

        }

    }
    public static void main(String [] args)
    {
        Fabonacci obj=new Fabonacci();
        obj.fabonacci(10);

    }
}
