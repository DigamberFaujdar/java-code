public class TypeConversion {

    public static void main (String args[])
    {
        //convert byte into int & vice-versa

        byte a=125;
        int b=786;
        //below code int into byte error because of we are converting high size of value in into lower size
       // byte a=b;  this gives error
        int k=a; // this will not give error as int have large size than byte
        System.out.println(k);

        //switch statement
        int day=3;
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                    System.out.println("Wednesday");
                break;
            case 4:
                    System.out.println("Thursday");
                break;
            case 5:
                    System.out.println("Friday"+"Chill");
                break;
            case 6:
                    System.out.println("Saturday");
                break;
            case 7:
                    System.out.println("Sunday");
                break;
            default:
                System.out.println("Enter number 1 to 7");

        }
        int num=1;
        switch (num){
            case 1-> System.out.println("new syntext to do the things");
            case 2-> System.out.println("no need to add break statement ");
    }

    }
}
