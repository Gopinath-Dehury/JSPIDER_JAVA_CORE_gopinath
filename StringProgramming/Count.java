public class Count {
    
    
    static void count(String s){
        while(s.length()>0){
            char c=s.charAt(0);
            String s2=s.replace(c+"", "");
            int count=s.length()-s2.length();
            System.out.println(c+" = "+count);
            s=s2;
        }

    }
    public static void main(String[] args) {
        count("hello");
    }
}
