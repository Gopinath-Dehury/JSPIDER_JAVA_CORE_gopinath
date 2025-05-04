import java.util.Arrays;

public class BubbleSort {
    static void bubbleSort(int[] a,int start,int end){
        for(int i=start;i<end;i++){
            for(int j=start;j<end-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] a={91,8,16,5,14,3,2};
        System.out.println(Arrays.toString(a));
        bubbleSort(a, 0, 6);
        System.out.println(Arrays.toString(a));

    }
}
