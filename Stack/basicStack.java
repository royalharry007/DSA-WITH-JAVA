 
 import java.util.Stack;
 public class basicStack{
    public static void main (String args[]){
     
        Stack<Integer> st = new Stack<>();
        Stack<Integer> st2 = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);

        // Inserting the elem at the bottom of the index 
        while( st.size() > 0){
            int elem = st.pop();
            st2.push(elem);

        }

       

        st.push(10);

        while( st2.size() > 0){
            int elem = st2.pop();
            st.push(elem);
        }

        System.out.println(st);
    }
}