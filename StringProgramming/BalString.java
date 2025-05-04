import java.util.Stack;

class BalString{
    public static void main(String[] args) {
        String s="[{[]}{()}{()}{()}{()()}]";
        System.out.println(isBalancedString(s));
    }

    public static boolean isBalancedString(String s) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[') {
                stack.push(c);
            }else if(c==')'||c==']'||c=='}'){
                if(stack.isEmpty()||!pair(stack.pop(),c)){
                    return false;
                }
            }
        }
        return stack.isEmpty();
        


    }

    public static boolean pair(char pop, char c) {
        if(pop=='('&& c==')') return true;
        if(pop=='{'&& c=='}') return true;
        if(pop=='['&& c==']') return true;
        return false;

    }
}