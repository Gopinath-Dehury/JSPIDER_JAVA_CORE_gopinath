public class SecondlargeInArray {
    public static void main(String[] args) {
        int[] a={6,7,8,92,7,2,9,23,13};
        int first=a[0];
        int second=a[0];
        for(int i=0;i<a.length;i++){
            
            if(a[i]<first){
                second=first;
                first=a[i];
            }
        else if(a[i]<second || first==second){
                second=a[i];
            }
        }
        System.out.println("First largest number is: "+first);
        System.out.println("Second largest number is: "+second);
    }
}
