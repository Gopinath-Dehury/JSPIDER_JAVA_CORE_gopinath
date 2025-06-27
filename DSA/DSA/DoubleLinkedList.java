package DSA;

public class DoubleLinkedList {
   
    Node first=null;
    int index=0;

    class Node{
         Node prev;
         Object ele;
         Node next;

     Node( Object ele) {
            prev = null;
            this.ele = ele;
            next = null;
         }

     Node(Node prev, Object ele, Node next) {
            this.prev = prev;
            this.ele = ele;
            this.next = next;
         }



    }



    public void add(Object e){
            if(first==null){
                first=new Node(e);
                index++;
                return;
            }
            Node curr=first;
            while(curr.next!=null){
                curr=curr.next;
            }
            curr.next=new Node(curr,e,null);
            index++;
    }
    public int size(){
        return index;
    }

    public void add(int pos,Object e){
        if(pos<0||pos>size()){
            throw new IndexOutOfBoundsException();
        }
        if(pos==0){
            Node newNode=new Node(null,e,first);
          if(first!=null)  first.prev=newNode;
          first=newNode;
            index++;
            return;
        }
        Node curr=first;
        for(int i=1;i<pos;i++){
            curr=curr.next;
        }
        Node newNode=new Node(curr,e,curr.next);
        
        curr.next.prev=newNode;
        curr.next=newNode;
        index++; 
    }
}
