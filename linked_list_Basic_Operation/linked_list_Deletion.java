public class linked_list_Deletion {
    Node Head;
    class Node{
        int data;
        Node next;
    
    Node(int a){
        data=a;next = null;}
}
    public void insert(int a){
        Node obj=new Node(a);
        if(Head==null){
            Head=obj;
        }
        else{
            Node temp=Head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=obj;
        }
    }
    public void Display(){
        Node temp=Head;
        while(temp!=null){
            System.out.print(" "+temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void Delete(int a){
        if(Head.data==a)
        {
            Head=Head.next;
            return;
        }
        Node temp=Head;
        Node prv_node=null;
        while(temp!=null){
            if(temp.data==a)
            {
                prv_node.next=temp.next;
                break;
            }
            prv_node=temp;
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("\nElement not found");return ;}
    }
    public static void main (String []args){
        linked_list_Deletion obj=new linked_list_Deletion();
        obj.insert(9);
        obj.insert(8);
        obj.insert(7);
        obj.Display();
        obj.Delete(7);
        obj.Display();
    }
}
