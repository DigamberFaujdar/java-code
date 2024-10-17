public class Sum_Of_Digit {
    public static void main(String args[])
    {
        int num=121;
        int sum=0;
        double a= 90.8;
        String str=String.valueOf(num);
        for (int i=0;i<str.length();i++)
        {
            sum+=Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(sum);
    }
}

