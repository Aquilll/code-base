import java.util.Arrays;

public class Test
{
    static int arr[] = new int[]{0, 0, 0, 1, 0, 0, 0};

    static void rotate()
    {
        int x = arr[arr.length-1], y = arr[arr.length-2], i;
        for (i = arr.length-1; i > 0; i--)
            arr[i] = arr[i-1];
        arr[0] = x^y;
    }

    public static void main(String[] args)
    {
        System.out.println("Given Array is");
        System.out.println(Arrays.toString(arr));

        for(int j = 1; j < 131; j++){
            rotate();
            System.out.println(j+") "+"Rotated Array is");
            System.out.println(Arrays.toString(arr));
        }

    }
}