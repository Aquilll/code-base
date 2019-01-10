public class FirstSecondMin {
    public static void main(String[] args) {
        int[] arr = {5,6,-2,-1,-1};
        print2smallest(arr);
    }

    private static void print2smallest(int[] arr) {
        if(arr.length < 2){
            System.out.println("invalid input");
            return;
        }
        int first,second ;
        first = second = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < first){
                second = first;
                first = arr[i];
            }
            else if(arr[i] < second && arr[i] != first){
                second = arr[i];
            }
        }
        if(second == Integer.MAX_VALUE){
            System.out.println("there is no second min value");
        }else{
            System.out.println("the min value is "+first+" and second min value is "+second);
        }
    }
}
