import java.util.Stack;

class Reverse
{
 
    void reverseWords(String str)
    {
        Stack<Character> st=new Stack<Character>();

        for (int i = 0; i < str.length(); ++i) 
            {
            if (str.charAt(i) != ' ')
            {
                st.push(str.charAt(i));
            }
            else
            {
                while (st.empty() == false)
                {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }

        while (st.empty() == false)
        {
            System.out.print(st.pop());         
        }
    }

    public static void main(String[] args)
    {
        Reverse o1 = new Reverse();
        String str = "Hello World";
        o1.reverseWords(str);
    }
}