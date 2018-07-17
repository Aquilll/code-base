import java.util.ArrayList;

/*
Find all the hero and super hero in an array. Hero – Elements which are greater than all
the elements on its right side. Super Hero – Elements which are greater than all the elements
 on its left and right side (Largest Element of the array which should only occur once).
  Expected Complexity – O(1) space and O(n) time in single traversal.
*/
public class heroandsuperhero {
    public static void main(String[] args) {
        int arr[] = new int[]{5, 1, 4, 3, 6, 8, 10, 7, 9};
        int n = arr.length;
        ArrayList<Integer> heroes = getHeroes(arr, n);

        System.out.print("heroes: ");
        for(int i = 0; i< heroes.size(); i++){
            System.out.print(heroes.get(i)+" ");
        }

        int superHeroIndex = getSuperHero(arr,n);
        if(superHeroIndex == -1){
            System.out.println();
            System.out.println("there is no super hero");
        }
        else{
            System.out.println();
            System.out.print("SuperHero: "+arr[superHeroIndex]);
        }

    }

    private static int getSuperHero(int[] arr, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = Integer.MIN_VALUE;
        for(int i = 1; i < n; i++){
            leftMax[i] = Math.max(leftMax[i-1], arr[i-1]);
        }

        int rightMin = Integer.MAX_VALUE;

        for (int i=n-1; i>=0; i--)
        {
            if (leftMax[i] < arr[i] && rightMin > arr[i])
                return i;

            rightMin = Math.min(rightMin, arr[i]);
        }

        return -1;
    }

    private static ArrayList<Integer> getHeroes(int[] arr, int size) {
        int max_from_right =  arr[size-1];
        ArrayList<Integer> list = new ArrayList<>();
        list.add(max_from_right);

        for (int i = size-2; i >= 0; i--)
        {
            if (max_from_right < arr[i])
            {
                max_from_right = arr[i];
                list.add(max_from_right);
            }
        }
        return list;
    }
}
