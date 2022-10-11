public class RemoveDuplicateFromArray {
    public static void main(String[] args){
        int[] arr={1,2,2,3,3};

        removeDuplicates(arr);

    }

    private static void removeDuplicates(int[] arr) {
        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }

        for(int k=0;k<arr.length;k++){
            System.out.println(arr[k]);
        }
    }
}
