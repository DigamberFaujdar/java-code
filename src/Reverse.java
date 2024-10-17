public class Reverse {
    int num;
    void reverse(int num)
    {
        this.num=num;
        int rev=0;
        int rm;
        while(num>0)
        {
            rm=num%10;
            rev=rev*10+rm;
            num=num/10;

        }
        System.out.printf("rev is "+rev);

    }
    public static void main(String[] args) {
        Reverse reverse=new Reverse();
        reverse.reverse(176908);

        //
        int num=90;
        for(int i=2;i<(num/2)+1;i++){
            if (num%i==0){
                System.out.println("number is prime number"+i);
            }
        }
    }
}
