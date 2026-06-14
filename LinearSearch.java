public class LinearSearch {
    public static void main(String[] args) {
        int[] a= {10,40,50,440,60};
        int searchElement= 440;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==searchElement)
            {
                System.out.println("Element found at index "+i);
                return;
            }
        }
        System.out.println("Element not found");
    }
}
