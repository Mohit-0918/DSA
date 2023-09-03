public class LL_Reversing {
    Node Head;
    
    class Node{
        int data;
        Node next;

        Node(int a){
            this.data=a;
            this.next=null;
        }
    }
    public void insert(int a){
        Node obj=new Node(a);
        if(Head==null)
        Head=obj;
        else{
            Node temp=Head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=obj;
        }
    }
    public void Reverse(){
        Node prv=null;
        Node curr=Head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prv;
            prv=curr;
            curr=next;
        }
        Head=prv;
    }
    public void Display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
    public static void main(String [] arg){
        LL_Reversing l1 = new LL_Reversing ();
        l1.insert (5);
        l1.insert (6);
        l1.insert(7);
        l1.insert(8);
        l1.Display();
        l1.Reverse();
        l1.Display();
    }
}
