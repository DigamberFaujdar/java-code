//static keyboard use with variable , method, class
//static keyword is for memory management because static belongs to Class rather than object so It takes memory only once
public class StaticKeyword {
     static String name="Digamber Faujdar";

    static void display()
    {
        System.out.println("Hello ! Welcome back "+name);
    }
    void setName()
    {
        name="Tiger";
        System.out.println(name);
    }
    public static void main (String [] args)
    {
        StaticKeyword.display();
        StaticKeyword staticKeyword=new StaticKeyword();
        staticKeyword.setName();
        System.out.println(staticKeyword.name);

    }
}
