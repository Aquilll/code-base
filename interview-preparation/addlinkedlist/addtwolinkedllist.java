// @author Aquil Hussain
//create self node class and required functions for better understanding
public class addtwolinkedllist {
    static node head1, head2, result, curr;
    static int carry;

    public static void main(String[] args) {
        addtwolinkedllist list = new addtwolinkedllist();
        list.head1 = null;
        list.head2 = null;
        list.result = null;
        list.carry = 0;
        int[] arr1 = {9,9,9};
        int[] arr2 = {1,8};
        for(int i =arr1.length-1; i >=0 ; i--){
            list.push(arr1[i],1);
        }
        for(int i =arr2.length-1; i >=0 ; i--){
            list.push(arr2[i], 2);
        }

        list.listAdd();
        printList(result);
    }

    private static void printList(node result) {
        while(result != null){
            System.out.print(result.val);
            result = result.next;
        }
    }

    void push(int value, int list) {
        node newNode = new node(value);
        if(list == 1){
            newNode.next = head1;
            head1 = newNode;
        }
        else if(list == 2){
            newNode.next = head2;
            head2 = newNode;
        }
        else{
            newNode.next = result;
            result = newNode;
        }
    }

     void listAdd() {
        if(head1 == null){
            result = head2;
            return;
        }
        if(head2 == null){
            result = head1;
            return;
        }

        int size1 = getSize(head1);
        int size2 = getSize(head2);

        if(size1 == size2){
            addSame(head1,head2);
        }

        if(size1 < size2){
            node temp = head1;
            head1 = head2;
            head2 = temp;
        }

        int diff = Math.abs(size1 - size2);
         node temp = head1;
        while(diff-- >= 0){
            curr = temp;
            temp = temp.next;
        }

        addSame(curr,head2);

        propogaterCarryAdd(head1);

        //if carry != 0
        if(carry > 0){
            push(carry,3);
        }

    }

     void propogaterCarryAdd(node head1) {
        if(head1 != curr){
            propogaterCarryAdd(head1.next);
            int sum = carry + head1.val;
            carry = sum / 10;
            sum %= 10;

            push(sum,3);
        }
    }

    private static int getSize(node head) {
        int count = 0;
        while (head != null)
        {
            count++;
            head = head.next;
        }
        return count;
    }

     void addSame(node list1, node list2) {
        if(list1 == null)
            return;
        addSame(list1.next, list2.next);
        int sum = list1.val + list2.val +carry;
        carry = sum/10;
        sum = sum % 10;
        push(sum,3);
    }
}
