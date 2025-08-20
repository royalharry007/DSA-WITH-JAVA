public class linkedListUsingArray {

    public static class Node
    {
            int val;
            Node next;
            Node( int val)
            {
                this.val= val;
                
            }
    }
    public static class Stack{
        Node head=null;
        int size=0;


     void push(int data)
     {
            if(size <= 0){
            
                Node currNode = new Node(data);
                currNode.next=head;
                 head= currNode;
                size++;
            }
            else{
                
                Node currNode = new Node(data);
                currNode.next=head;
                head = currNode;
                size++;


            }

     }

     int pop(){
        
        if(head == null)
        {
            System.out.println("stack is empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;

     }
     void peek(){

        System.out.println(head.val);
        
     }
     void display(){
        
        Node temp = head;
        while(temp!= null){

            System.out.println(temp.val);
            temp = temp.next;
        }
     }

    }
    public static void main(String[] args) {
        

        Stack LL = new Stack();

        LL.push(10);
        LL.push(20);
        LL.push(30);
        LL.push(40);
        LL.push(50);
        LL.display();

        System.out.println("aftter pop ");

        LL.pop();
        LL.pop();

        LL.display();

        LL.peek();

        LL.display();
      

    }
    
}
