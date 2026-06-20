public class SmallestNumberInAnArray {
    public static void main(String[] args) {
        int[] a = {99,10,20,30,20,5,34,53};

        int small=a[0];

        for(int i=1;i<=a.length-1;i++)
        {
            if(a[i]<small)
            {
                small=a[i];
            }
        }
        System.out.println("Smallest element in an array is: "+ small);
    }
}
