import java.util.Arrays;

public class PairWithGivenDifference {
    public static void main(String[] args){
        int[] arr={5, 10, 3, 2, 50, 80};
        int diff=78;
        pairWithGivenDifference(arr,diff);

    }

    private static void pairWithGivenDifference(int[] arr,int difference) {
        int i=0;
        int j=arr.length-1;
        Arrays.sort(arr);
        while(i<j){
            if(arr[j]-arr[i]==difference){
                System.out.println("Pairs are :"+arr[i]+" "+arr[j]);
                break;
            }
            else if(arr[j]-arr[i]>difference){
                i++;
            }
            else{
                j--;
            }
        }
    }
}
