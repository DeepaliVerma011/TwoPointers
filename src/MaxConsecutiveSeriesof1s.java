public class MaxConsecutiveSeriesof1s {
    public static void main(String[] args){
        int[] arr={0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1};
        int k=3;

        int ans=longestOnes(arr,k);
        System.out.println(ans);
    }

    private static int longestOnes(int[] arr, int k) {
        int i=0;
        int j=0;
        int cntofflipsShouldNotExceedK=0;
        int maxLength=Integer.MIN_VALUE;
        while(j<arr.length){
            if(arr[j]==1){
                j++;
            }
            else if(arr[j]==0) {
                j++;
                cntofflipsShouldNotExceedK++;
            }

            while(cntofflipsShouldNotExceedK>k){
                if(arr[i]==0){
                    cntofflipsShouldNotExceedK--;
                }
                i++;
            }

           maxLength=Math.max(maxLength,j-i);
        }


        return maxLength;
    }
}
