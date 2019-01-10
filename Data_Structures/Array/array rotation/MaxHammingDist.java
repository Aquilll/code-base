public class MaxHammingDist {
    public static void main(String[] args) {
        int[] arr = {2,2,1,1};
        int[] tmp = new int[arr.length * 2];
        preprocess(arr,tmp);
        System.out.println(calcHamming(arr,tmp));
    }

    private static void preprocess(int[] arr, int[] tmp) {
        for(int i=0; i<arr.length; i++){
            tmp[i] = tmp[i+arr.length] = arr[i];
        }
    }

    private static int calcHamming(int[] arr, int[] tmp) {
        int MaxHam = 0;
        for(int i=1; i<arr.length; i++){
            int currHam = 0;
            for(int j=i, k=0; j<(i+arr.length); j++,k++){
                if(tmp[j] != arr[k])
                    currHam++;
            }
            if(currHam == arr.length)
                return arr.length;

            MaxHam = Math.max(currHam,MaxHam);
        }
        return MaxHam;
    }
}
