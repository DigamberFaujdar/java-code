public class Practice {

    void swap()
    {
        int num1=10;
        int num2=20;

        num1+=num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println("value of num1 & num2 is : "+num1+" "+num2);
    }
    void graterNumber(int num1, int num2)
    {
        if (num1>num2)
        {
            System.out.println("num1 is grater : "+num1);
        } else if (num2>num1) {
            System.out.println("num2 is grater : "+num2);

        }
        else {
            System.out.println("Both are equal ");
        }
    }
    int factorial(int num)
    {
        int fact=1;
        for (int i=num;i>=1;i--)
        {
            fact=fact*i;

        }
        return fact;

    }
    void sum_three_number() {
        int arr[] = {1, 34, 56, 3, 4, 23, 45, 89};
        int sum = 0;
        int max = 0;
        int temp = 0;
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < arr.length; i++) {

                max = 0;
                System.out.println(arr[i]);
                if (arr[i] > max) {
                     max=arr[i];
                    temp = i;
                }
             }

            sum += max;
            arr[temp]=0;
       // System.out.println(sum+" "+arr[7]);
            System.out.println("first clear ");

        }
    //    System.out.println("sum is "+8);
    }
    void sum_of_array()
    {
        int arr[]={2,34,4,5,435,3,454,34};
        int sum=0;
        for (int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
         }
       System.out.println("sum is "+sum);
    }
    
    public static void main(String [] args)
    {
        System.out.println("This is practice java file");
        Practice practice =new Practice();
        //practice.swap();
        //practice.graterNumber(90,90);
        //System.out.println("factorial is "+practice.factorial(5));
        //practice.sum_three_number();
        practice.sum_of_array();
    }
}
