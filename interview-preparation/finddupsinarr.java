public class finddupsinarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,3,6,6};
        finddups(arr);
    }

    private static void finddups(int[] arr) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < arr.length; i++)
        {
            if (arr[Math.abs(arr[i])] >= 0)
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            else
                System.out.print(Math.abs(arr[i]) + " ");
        }
    }
}
