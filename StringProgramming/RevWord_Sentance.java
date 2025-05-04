class Revword_Sentence{
    static String reverseWord(String s){
        char[] a=s.toCharArray();
        int i=a.length-1;
        int j=a.length-1;
        String s1="";
        while(i>=0){
            while(i>=0 && a[i]!=' ') i--;
            String temp="";
            int k=i+1;
            while(k<=j) temp+=a[k++];
            
            s1+=temp;
            if(i>0) s1+=" ";
            j=i--;
           
        }
        return s1;
    }
    public static void main(String[] args) {
        System.out.println(reverseWord("archana das"));
    }
}