import java.util.Scanner;

public class Java_concept {
    int id;
    static String  name;
    public static void setName(String name) {
        Java_concept.name = name;
    }

    public static String getName() {
        return name;
    }
    public void Java_concept(int num)
    {
        //Constructor is used to initialize value of the instance variable or data members
            System.out.println("enter value ");
        Scanner scn=new Scanner(System.in);
        id=scn.nextInt();
        System.out.println("num is "+num);

    }
    private void Java_concept(int num1,int num2)
    {
        //this is the concept of constructor overloading
        System.out.println(num1+num2);

    }
    public static void main(String [] args)
    {

        Java_concept java_concept=new Java_concept();

        java_concept.Java_concept(89);
        java_concept.Java_concept(90,90);
        System.out.println("value of the id is :"+java_concept.id);
        Java_concept.setName("Digamber Singh");
        System.out.println(Java_concept.getName());

    }
}
