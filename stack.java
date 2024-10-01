import java.util.Stack;

public class Main
{
    public static void main(String [] args)
    {
        Stack<Integer>st = new Stack<>();
        
        st.push(20);
        st.push(10);
        st.push(50);
        st.push(60);
        
        if(st.isEmpty())
        {
            System.out.println("Stack is empty");
        }
        else{
            System.out.println("Stack is not empty");
        }
        
        System.out.println(st);
    }
}
