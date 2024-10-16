public class Star_Pattern {

    void pattern() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
        void reverseString()
        {
            String str="Hello";
            System.out.println("hs");
            for (int i=str.length()-1;i>=0;i--)
            {
                System.out.print(str.charAt(i));
            }


        }
    public static void main(String [] args)
    {
        Star_Pattern starPattern=new Star_Pattern();
//        starPattern.pattern();
        starPattern.reverseString();

    }
}
