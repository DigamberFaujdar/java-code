public class Loops {
   char s;



    public void Loops(){
        System.out.println("this is perameterizised constructor");
    }
    public Loops(char s){
        this.s=s;
        System.out.println(this.s);
        this.Loops();
        this.message();
        Loops.great();
    }

    static void great()
    {
        System.out.println("Hello Good Morning...");

    }
    public void message(){
        System.out.println("I am doing fine ");
        System.out.println(s);
    }
    static String display() {
        System.out.println("Hello Dost ");
        return "Yes static method can return ";
    }


    public static void main(String [] args)
    {
         //for loop
        //print even number b/w 1 to 100
        for(int i=0;i<101;i+=2)
        {
            System.out.print(i);
        }
        System.out.println("");

        //while loop
        int i=101;
        while (i>0){
            if (i%2==0){
                System.out.print(i);
            }
            i-=1;
        }

        //do while : in this code first code will execute then it will check condition
        int tem=1;
        do {
            System.out.println("you got 5 star !!");
            tem-=1;
        }
        while (tem>1);
        Loops loops=new Loops('n');
//        loops.message();
//        Loops.great();
//        System.out.println(Loops.display());
    }
}
