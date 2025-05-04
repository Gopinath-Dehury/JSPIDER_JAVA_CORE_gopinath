package Array;

public class SmallestEleInArray {
    public static void main(String[] args) {
        int[] a={3,6,8,4,5,7,2};
        int smallest = a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest) smallest=a[i];
        }
        System.out.println(smallest);
    }
}
