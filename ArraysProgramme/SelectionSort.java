public class SelectionSort {
    static void selectionSort(int[] a){
        for(int i=0;i<a.length-1;i++){
            int min=i;
            for(int j=i+1;j<a.length;j++){
                if(a[j]<a[min]) min=j;
            }

            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;
        }
    }
public static void main(String[] args) {
    int [] a={3,6,8,9,5,4};
        selectionSort(a);
        for(int e:a){
            System.out.println(e);
        }
}
    
}
