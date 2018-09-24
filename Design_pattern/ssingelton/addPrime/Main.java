public class Main {
    public static void main(String[] args) {
        int[] arrs = {7,6,5,9,9,3,2,8};
        int[] arrs2 = {1,2,3,4};
        addPrimePositions p = addPrimePositions.getInstance(arrs);
        System.out.println(p.getaddNum());
        addPrimePositions q = addPrimePositions.getInstance(arrs2);
        if(q == null)
        System.out.println("cant create because one instance is already created");
    }
}
