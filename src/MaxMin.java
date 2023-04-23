public class MaxMin {

    void maxMin(int ...a)
    {
        int max=0;
        int min=a[0];
        for (int i=0;i<a.length;i++)
        {
            if (min>a[i])
            {
                min=a[i];
            }
            else if (max<a[i])
            {
                max=a[i];
            }
        }
        System.out.printf("Max is "+max +" min is "+min);

    }
    public static void main(String[] args) {
        MaxMin maxMin=new MaxMin();
        maxMin.maxMin(8,39,56,6,4,208);

    }
}
