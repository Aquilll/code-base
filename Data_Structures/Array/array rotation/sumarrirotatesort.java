public class sumarrirotatesort {
    static int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static void main(String[] args) {
        System.out.println("Maximum sum is "+maxSum());
    }

    private static int maxSum() {
        int arrSum =0;
        int curValue =0;
        for(int i=0; i<arr.length; i++){
            arrSum = arrSum + arr[i];
            curValue = curValue + (i*arr[i]);
        }
        int maxVal = curValue;
        for(int j=1; j<arr.length; j++){
            curValue = curValue + arrSum-arr.length*arr[arr.length-j];
            if(curValue > maxVal)
                maxVal = curValue;
        }
        return maxVal;
    }
}
