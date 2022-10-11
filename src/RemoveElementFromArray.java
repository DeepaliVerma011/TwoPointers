public class RemoveElementFromArray {
    public static void main(String[] args){
        int[] arr={3,2,2,3};
        int val=3;
        removeElement(arr,val);
    }

    private static void removeElement(int[] arr, int val) {

        int i=0;
        for(int j=1;j<arr.length;j++)
        {
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }

        System.out.println(i);
        for(i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
