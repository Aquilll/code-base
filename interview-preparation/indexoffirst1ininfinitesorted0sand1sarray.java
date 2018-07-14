public class indexoffirst1ininfinitesorted0sand1sarray {
    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 1, 1, 1};
        int index = findIndex(arr);
        System.out.println(index);
    }

    private static int findIndex(int[] arr) {
        int l = 0, h = 1;
        while(arr[h] == 0){
            l =  h;
            h = 2 * h;
        }
        return indexGiver(arr,l,h);
    }

    private static int indexGiver(int[] arr, int l, int h) {
        int mid = 0;
        while(l <= h){
            mid = (l + h)/2;
            if(arr[mid] == 1 && (mid == 0 || arr[mid - 1] == 0))
                break;
            else if(arr[mid] == 1)
                h = mid - 1;
            else
                l = l + mid;
        }
        return mid;
    }
}
