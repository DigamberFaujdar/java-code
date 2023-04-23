public class PrimeNumber {
    public void primeNumber(byte number)
    {
        int num =number;
        int count=0;
        if (num>2)
        {
            for (int i=2;i<(num/2)+1;i++)
            {
                if (num%i==0)
                {
                    System.out.println("Number is Not Prime");
                    count=1;
                    break;
                }

            }
            if (count==0){
                System.out.print("numbre is Prime");
            }

        }
        else {
            System.out.println("Number should be larger than 1");
        }


    }
    public static void main(String [] args)
    {
        PrimeNumber primeNumber=new PrimeNumber();
        primeNumber.primeNumber((byte) 7);
    }
}
