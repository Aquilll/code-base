public class GasStation {
    public static void main(String[] args) {
        int[] available = {4,4,6};
        int[] required = {5,6,1};

        if(tour(available,required) > 0)
        System.out.println("Trip should start from station no. "+tour(available,required));
        else
            System.out.println("there is not enough gas to start trip");
    }

    private static int tour(int[] available, int[] required) {
        int[] diff = new int[available.length];
        for(int i = 0; i < diff.length; i++){
            diff[i] = available[i]- required[i];
        }

        boolean allfalse = true;

        for(int i = 0; i < diff.length; i++){
            if(diff[i] > 0) {
                allfalse = false;
                break;
            }
        }

        if(allfalse)
            return -1;

        KadaneWrap kda = new KadaneWrap();
        triplet t = kda.kadaneWrap(diff);
        int i = t.getStart();
        int netGas = 0;
        do{
            netGas += diff[i];
            i = (i + 1)% diff.length;
            if(netGas < 0){
                return -1;
            }
        }while(i != t.getStart());

        return t.getStart();
    }
}
