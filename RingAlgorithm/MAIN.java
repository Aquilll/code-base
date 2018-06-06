import java.util.ArrayList;
import java.util.Random;

public class MAIN {
    public static void main(String[] args) {
        ArrayList<RingDeclaration> list = new ArrayList<>();
        ArrayList<RingDeclaration> list_helper = new ArrayList<>();
        Random rand = new Random();

        for(int i = 0; i < 10; i++){
            list.add(new RingDeclaration(rand.nextInt(15)+10,rand.nextInt(100)+10 , Math.round(Math.random())));
            list.sort(new RingDeclaration(rand.nextInt(15)+10,rand.nextInt(100)+10, Math.round(Math.random())));
        }

        System.out.println(list);

        int maxPriority = Integer.MIN_VALUE;
        int Id = 0;

        for(int i = 0; i < list.size(); i++){
            maxPriority = Math.max(maxPriority,list.get(i).getPriority());
//            if(maxPriority > list.get(i).getPriority());
            Id = list.get(i).getProcessId();
        }

        System.out.println(/*Id +*/" :-> "+maxPriority);


        for(int i = 0; i < 10; i++){
            if(list.get(i).getStatus() == 1.0)
                list_helper.add(list.get(i));
        }

        System.out.println(list_helper);

        int maxPriority1 = Integer.MIN_VALUE;
        int Id1 = 0;

        for(int i = 0; i < list_helper.size(); i++){
            maxPriority1 = Math.max(maxPriority1,list_helper.get(i).getPriority());
//            if(maxPriority > list.get(i).getPriority());
            Id1 = list_helper.get(i).getProcessId();
        }

        System.out.println(/*Id1 +*/" :-> "+maxPriority1);

        for(int i = 0; i < list_helper.size(); i++){
            if(list_helper.get(i).getPriority() == maxPriority1){
                list_helper.remove(i);
            }
        }

        System.out.println("Sensed node: "+list_helper.get(rand.nextInt(list_helper.size()-1)+0).getProcessId());


    }
}
