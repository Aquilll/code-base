import java.util.ArrayList;
import java.util.Random;



public class bullyImplementation{
    public static void main(String[] args) {
        ArrayList<bully> list = new ArrayList<>();


        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            list.add(new bully(rand.nextInt(15)+10,rand.nextInt(100)+10 ));
            list.sort(new bully(rand.nextInt(15)+10,rand.nextInt(100)+10));
        }

        System.out.println(list);

        int maxPriority = Integer.MIN_VALUE;
        int Id = 0;

        for(int i = 0; i < list.size(); i++){
            maxPriority = Math.max(maxPriority,list.get(i).getPriority());
//            if(maxPriority > list.get(i).getPriority());
                if(maxPriority > list.get(i).getPriority())
                    continue;
                Id = list.get(i).getProcessId();
        }
        System.out.println("Id of leader process " + Id +" :-> "+" Priority "+maxPriority);

        bully crashed = crash(list,maxPriority,Id);
        /*//crash
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getPriority() == maxPriority && list.get(i).getProcessId() == Id){
                list.remove(i);
            }
        }*/
       // System.out.println();
        //System.out.println(list);
        //System.out.println();
        election(list);

        long rejoinn = Math.round(Math.random());
        boolean rejoin;
        if(rejoinn == 0.0)
            rejoin = false;
        else
            rejoin = true;

        if(rejoin);
        rejoin(list,crashed);
    }

    private static void rejoin(ArrayList<bully> list, bully crashed) {
        list.add(crashed);
        System.out.println("new leadre node after rejoin is "+ crashed);
    }

    private static bully crash(ArrayList<bully> list, int maxPriority, int Id) {
        bully max = null;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getPriority() == maxPriority && list.get(i).getProcessId() == Id){
                max = list.remove(i);
            }
        }
        System.out.println("The leader node is crashed");
        return max;
    }

    private static void election(ArrayList<bully> list) {
        Random rand = new Random();
        System.out.println("node that detected failure "+list.get(rand.nextInt(list.size())));
        System.out.println("new election message has been sent");
        int maxPriority = Integer.MIN_VALUE;
        int Id = 0;
        for(int i = 0; i < list.size(); i++){
            maxPriority = Math.max(maxPriority,list.get(i).getPriority());
//            if(maxPriority > list.get(i).getPriority());
            if(maxPriority > list.get(i).getPriority())
                continue;
            Id = list.get(i).getProcessId();
        }
        System.out.println("Id of new leader " + Id +" :-> "+" Priority "+maxPriority);
    }
}
