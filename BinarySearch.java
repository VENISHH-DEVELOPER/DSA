public class BinarySearch {
    public static void main(String[] args) {
        int[] a= {10,20,30,40,50};
        int searchElement= 50;

        int low=0;
        int high= a.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(a[mid]<searchElement)
            {
                low= mid+1;
            }
            else if(a[mid]==searchElement)
            {
                System.out.println("Element found at index "+mid);
                return;
            }
            else
            {
                high= mid-1;
            }
        }
        System.out.println("Element not found");




    }
}
