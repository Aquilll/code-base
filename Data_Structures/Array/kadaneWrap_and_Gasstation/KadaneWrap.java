public class KadaneWrap {
    public static void main(String[] args) {
        KadaneWrap kda = new KadaneWrap();
        int[] input = {8, -8, 9, -9, 10, -11, 12};
        System.out.println(kda.kadaneWrap(input));
    }

    public triplet kadaneWrap(int[] input) {
        triplet straightkadane = kadane(input);
        int sum = 0;

        for(int i = 0 ; i < input.length; i++){
            sum += input[i];
            input[i] = -input[i];
        }

        triplet negativeKadane = kadane(input);
        for(int i = 0; i < input.length; i++){
            input[i] = -input[i];
        }

        if(straightkadane.getSum() < sum + negativeKadane.getSum()){
            straightkadane.setSum(sum + negativeKadane.getSum());
            straightkadane.setStart(negativeKadane.getEnd()+1);
            straightkadane.setEnd(negativeKadane.getStart()-1);
        }
        return straightkadane;
    }

    public triplet kadane(int[] input) {
        int max_so_far = Integer.MIN_VALUE;
        int current_max = 0;
        int start = 0 , end = 0, s = 0;
        for(int i=0; i<input.length; i++){
            current_max = current_max + input[i];
            if(max_so_far < current_max){
                max_so_far = current_max;
                start = s;
                end = i;
            }
            if(current_max < 0){
                current_max = 0;
                s = 1 + i;
            }
        }

        /*int sum =0;
        int cStart = 0;
        int mStart = 0;
        int end = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0; i < input.length; i++){
            sum += input[i];
            if(sum <= 0){
                sum = 0;
                cStart = i+1;
            }else{
                if(sum > maxSum){
                    maxSum = sum;
                    mStart = cStart;
                    end = i;
                }
            }
        }*/

        triplet p = new triplet();
        p.setStart(start);
        p.setEnd(end);
        p.setSum(max_so_far);

        return p;
    }

}

