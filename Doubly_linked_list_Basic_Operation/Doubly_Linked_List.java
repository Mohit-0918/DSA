package Doubly_linked_list_Basic_Operation;

class Doubly_Linked_List{
    Node Head;
    Node Tail;
    public class Node{
        int data;
        Node prv,nex;
        Node (int n){
            this.data=n;
            this.prv=null;
            this.nex=null;
        }
    }
    public void Insertion(int n){
        Node temp = new Node(n);
        if(Head==null)
        {
            Head=temp;
            temp.prv=Head;
            Tail=temp;
        }else{
            Node trav=Head;
            while(trav.nex!=null)
            trav=trav.nex;
            trav.nex=temp;
            temp.prv=trav;
            temp.nex=null;
            Tail=temp;
        }
    }
    public void Display(){
        Node t=Tail;
        while(t!=Head){
            System.out.print(t.data+" ");
            t=t.prv;
        }
        System.out.print(t.data);
    }
    public static void main(String [] args){
        Doubly_Linked_List obj=new Doubly_Linked_List();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Insertion(4);
        obj.Display();
        
    }
}