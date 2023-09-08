package Circularly_Linked_Listl;
class Circuraly_LL{
    Node Head;
    class Node{
        int data;
        Node next,prv;
        Node(int n){
            this.data=n;
            this.prv=null;
            this.next=null;
        }
    }
    public void Insertion(int n){
        Node newNode=new Node(n);
        if(Head==null){
            Head=newNode;
            newNode.next=Head;
        }else{
            Node temp=Head;
            while(temp.next!=Head){
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.next=Head;
            newNode.prv=temp;
        }
    }
public void Display(){
        Node t=Head;
        while(t.next!=Head){
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.print(t.data+" ");
    }
    public static void main(String [] args){
        Circuraly_LL obj=new Circuraly_LL();
        obj.Insertion(1);
        obj.Insertion(2);
        obj.Insertion(3);
        obj.Insertion(4);
        obj.Display();
        
    }
}