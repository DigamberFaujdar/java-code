public class ArmStrongNumber {
    void armStrongNumber(int num)
    {
        int temp=num;
        int dupArmStrong=num;
        int len=0;
        int armstrongNumber=0;
        while(temp>0)
        {
            temp=temp/10;
            len++;
        }
          while (num>0)
         {
             int rem=num%10;
             int rev=1;
             for (int j=0;j<len;j++)
             {
                 rev=rev*rem;
              }

             armstrongNumber+=rev;
             rem=0;
             num=num/10;
         }
          if (armstrongNumber==dupArmStrong)
         {
             System.out.println("Number is armstrong "+armstrongNumber);
         }
         else
         {
             System.out.println("Number is not armStrong "+armstrongNumber);
         }
    }
    public static void main(String[] args) {
        ArmStrongNumber armStrongNumber=new ArmStrongNumber();
        armStrongNumber.armStrongNumber(407);

    }
}
