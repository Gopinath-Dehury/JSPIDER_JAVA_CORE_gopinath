 public class BubbleSort {
    static void bubbleSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-1-i;j++){
                if(a[j+1]<a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            
            }
        }
    }

    public static void main(String[] args) {
        int [] a={3,6,8,9,5,4};
        bubbleSort(a);
        for(int e:a){
            System.out.println(e);
        }
    }
}
