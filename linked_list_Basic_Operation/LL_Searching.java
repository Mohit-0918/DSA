public class LL_Searching {
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
        if(Head==null){
            Head=obj;
        }
        else{
            Node temp=Head;
            while(temp.next!=null)
            {
                temp=temp.next;
            }
            temp.next=obj;
        }
    }
    public void Searching(int a){
        Node temp=Head;
        while(temp!=null){
            if(temp.data==a){
                System.out.println("Value Found");
                return;
            }
            temp=temp.next;
        }
        System.out.println("value not found");
    }
    public void Display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static void main(String [] args){
        LL_Searching obj=new LL_Searching();
        obj.insert(9);
        obj.insert(8);
        obj.insert(7);
        obj.Display();
        obj.Searching(99);
        
    }
}
