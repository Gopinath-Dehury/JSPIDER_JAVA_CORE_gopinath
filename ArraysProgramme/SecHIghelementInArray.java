public class SecHIghelementInArray {
    public static void main(String[] args) {
        int[] a={37,5,66,9,101,203,4,7,89};
        int l1=0,l2=0;
        if(a[0]>a[1]){
            l1=a[0];
            l2=a[1];
        }else{
            l1=a[1];
            l2=a[2];
        }

        for(int i=2;i<a.length;i++){
            if(a[i]>l1){
                l2=l1;
                l1=a[i];
            }else if(a[i]>l2){
                l2=a[i];
            }
        }
        System.out.println(l2);

    }
}
