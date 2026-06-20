public class LargestNumber
{
    public static void main(String[] args) {
        int[] a = {99,10,20,30,20,34,53};

        int big=a[0];

        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]> big)
            {
                big=a[i];
            }
        }
        System.out.println("Biggest element in an array is: "+ big);
    }
}