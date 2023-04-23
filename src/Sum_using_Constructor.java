public class Sum_using_Constructor {

    public Sum_using_Constructor(int a,int b)
    {
        int sum=a+b;
        System.out.println("Sum is : "+sum);
    }

    public static void main(String [] args)
    {
        Sum_using_Constructor obj=new Sum_using_Constructor(0,90);
    }

}
