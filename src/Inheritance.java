public class Inheritance {
    int num1,num2;
    void add(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
        int sum =this.num1+this.num2;
        System.out.println("addition is :"+sum);
    }
    void minus(int num1,int num2)
    {
        this.num1=num1;
        this.num2=num2;
        if (this.num1>this.num2)
        {

            int subs=this.num1-this.num2;
        System.out.println("Substraction is "+subs);
    }
        else {
            int subs=this.num2-this.num1;
            System.out.println("Substraction is "+subs);
        }


}
static void def()
{
    System.out.println("This class will always RUN");
}

    public static void main()
    {
        Inherit inherit=new Inherit();
        Java_concept java_concept=new Java_concept();
        java_concept.Java_concept(9);
        inherit.devision(90,90);
        inherit.multiply(9,9);
        System.out.println("value of the id is :"+java_concept.id);
        Inheritance.def();
        Inheritance.def();



    }
}
class Inherit extends Inheritance implements Interface_Class{
      @Override
      public void multiply(int n1,int n2)
    {
        System.out.println("multiply is "+n1*n2);

    }
    @Override
    public void devision(int n1,int n2)
    {
        System.out.println("Devision is "+ n1/n2);


    }
public static void main(String args[])
{

    Inherit inherit=new Inherit();

    inherit.add(89,89);
    Inheritance.main();

}
}