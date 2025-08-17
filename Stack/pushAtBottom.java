
import java.util.Stack;
public class pushAtBottom {

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
      pushBottom(st, 10);
      System.out.println(st);

        
    }
}
