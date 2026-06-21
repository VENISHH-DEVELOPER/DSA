public class SecondLargestElement {
    public static void main(String[] args) {
        
        int[] a={1,1};

        int m1=Integer.MIN_VALUE;
        int m2= Integer.MIN_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>m1)
            {
                m2=m1;
                m1=a[i];
            }
            else if (a[i]>m2 && a[i]!=m1)
            {
                m2=a[i];
            }
            
        }
        if(m2==Integer.MIN_VALUE)
        {
            System.out.println("No second largest element");
        }
        else
        {
            System.out.println("Second largest element is: "+ m2);
        }


    }
}
