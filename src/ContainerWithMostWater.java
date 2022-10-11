public class ContainerWithMostWater {
    public static void main(String[] args){
        int[] height={1,8,6,2,5,4,8,3,7};
        int water=findMaxWater(height);
        System.out.println(water);
    }

    private static int findMaxWater(int[] height) {
        int i=0;
        int j=height.length-1;
        int water=Integer.MIN_VALUE;
        while(i<j){
            int width=j-i;
            int height1=Math.min(height[i],height[j]);

            water=Math.max(water,height1*width);

            if(height[i]<height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return water;
    }
}
