import java.util.Stack;

public class ReverseStack {

    public static void RevStack(Stack<Integer>st){

        while(st.size()==1)
        {
            return;
        }

        int top = st.pop();
        RevStack(st);
        pushBottom(st, top);

    }
    public static void pushBottom(Stack<Integer>st ,int elem)
    {
        while(st.size()==0){
            st.push(elem);
            return;
        }
        int top = st.pop();
        pushBottom(st,elem);
        st.push(top);

    }
    
    
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

      System.out.println(st);
      RevStack(st);
      System.out.println(st);

        
    }
}
