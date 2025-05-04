package practice;

public class SumOfNnaturalnum {
    static int count;

    static int sum(int start,int end){
        if(start>=end) return end;
        count++;
        return start+sum(start+1,end);
    }
    public static void main(String[] args) {
        System.out.println(sum(1,10));
        System.out.println(count);
    }
}
