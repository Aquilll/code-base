public class floorandceilinunsortedarray {
    public static void main(String[] args) {

        int arr[] = {5, 6, 8, 9, 6, 5, 5, 6};
        int x = 7;
        floorAndCeil(arr, x);

    }

    private static void floorAndCeil(int[] arr, int x) {
        int fInd = -1 , cInd = -1;
        int fDist = Integer.MAX_VALUE , cDist = Integer.MAX_VALUE;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= x && cDist > (arr[i] - x)){
                cInd = i;
                cDist = arr[i] - x;
            }
            if(arr[i] <= x && fDist > (x - arr[i])){
                fInd = i;
                fDist = x - arr[i];
            }
        }
        if(fDist == Integer.MAX_VALUE)
            System.out.println("Floor doesn't exist " );
        else
            System.out.println("Floor is " +  arr[fInd]);

        if(cDist == Integer.MAX_VALUE)
            System.out.println("Ceil doesn't exist ");
        else
            System.out.println("Ceil is  " + arr[cInd]);
    }
}
