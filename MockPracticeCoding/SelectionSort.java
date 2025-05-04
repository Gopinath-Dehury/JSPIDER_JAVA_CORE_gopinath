public class SelectionSort {

    static void sort(int[] a){
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
        int[] a = { 8, 9, 6, 4, 3, 7, 1 };
        System.out.print("[");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("]");
        sort(a);
        System.out.print("[");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("]");
    }
}