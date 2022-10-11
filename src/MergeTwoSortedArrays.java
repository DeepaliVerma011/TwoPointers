public class MergeTwoSortedArrays {
    public static void main(String[] args){
        int[] a={1,5,8};
        int[] b={6,9};

        int[] c=merge(a,b);
        for(int i=0;i<c.length;i++){
            System.out.println(c[i]);
        }
    }

    private static int[] merge(int[] a, int[] b) {

        int n=a.length;
        int m=b.length;
        int[] c=new int[a.length+b.length];

        int i=n-1;
        int j=m-1;
        int k=n+m-1;

        while(i>=0 && j>=0){
            if(a[i]>b[j]){
                c[k]=a[i];
                i--;
                k--;
            }
            else{
                c[k]=b[j];
                j--;
                k--;
            }
        }

        while(i>=0){
            c[k]=a[i];
            i--;
            k--;
        }
        while(j>=0){
            c[k]=b[j];
            k--;
            j--;
        }
        return c;
    }
}
