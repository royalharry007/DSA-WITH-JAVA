public class stackUsingArray {

public static class Stack{

  int arr[] = new int[5];
  private int idx=-1;

  void push(int elem) {

    if(idx > arr.length)
    {
        System.out.println("stack is full ");
    }
     idx++;
     arr[idx]=elem;   
  }
  
  void pop(){
    int temp = arr[idx];
    idx--;
      
  }

  boolean isEmpty(){
        if(idx < 0) return true;
       else return false;
  }

  boolean isFull(){
        if( idx == arr.length) return true;
        else return false;

  }

  void display(){

for( int i=0; i<=idx; i++){
    System.out.print(arr[i] +" ");
}

  }

   void size(){
   
   System.out.println(idx);
}

}    
    public static void main(String[] args) {
        
       Stack st = new Stack();

        st.push(10);
        st.push(20);
        st.push(30);
        st.pop();
        System.out.println(st.isEmpty());
        st.display();
        st.size();
       

    }
}
