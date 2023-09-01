class linked_lis_Insertion{
    
    public static void main(String [] args){
        Linked_list ob1 = new Linked_list();
        ob1.Insert(ob1.new Node(9), 0);
        ob1.Insert(ob1.new Node(9), 1);
        ob1.Insert(ob1.new Node(9), 2);
        ob1.Insert(ob1.new Node(9), 3);
        Display(ob1.head);
    }
    public static void Display(Linked_list.Node head) {
        Linked_list.Node point=head;
        while(point !=null){
            System.out.print(" "+point.data);
            point=point.next;
        }
    }
}