package DSA;
import java.util.Stack;
public class A {
    public String infixToPrefix(String s) {
        DSA1 o = new DSA1();
        String prefix = "";
        Stack<Character> st = new Stack<Character>();
        char ch[] = s.toCharArray();
        for (char c : ch) {
            if (c != '+' && c != '-' && c != '*' && c != '/' && c != '(' && c != ')') {
                prefix = c+prefix ;
            } else if (c == '(') {
                st.push(c);
            } else if (c == ')') {
                while (!st.isEmpty()) {
                    char t = st.pop();
                    if (t != '(') {
                        prefix = t+prefix ;
                    } else {
                        break;
                        //it is a break statement
                    }
                }
                // it is a if-else statement
            } else if (c == '+' || c == '-' || c == '*' || c == '/') {
                if (st.isEmpty()) {
                    st.push(c);
                }
                else {
                    while (!st.isEmpty()) {
                        char t = st.pop();
                        if (t == '(') {
                            st.push(t);
                            break;
                        }
                        else if (c == '+' || c == '-' || c == '*' || c == '/') {
                            if (o.getPriority(t) < o.getPriority(c)){
                                st.push(t);
                                break;
                            }
                            else{
                                prefix = t+prefix;
                            }
                        }
                    }
                    st.push(c);
                }
            }

        }
        while (!st.isEmpty()){
            prefix = st.pop()+prefix;
        }
        return (prefix);
    }

}
// bye bye programming
