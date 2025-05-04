class SecHIghelementInArray1{
    public static void main(String[]args){
        int[] a={9,7,6,5,4,3,2,8,1,10,11,12};
        int l1,l2;
        if(a[0]>a[1]){
            l1=a[0];
            l2=a[1];
        }else{
            l1=a[1];
            l2=a[0];
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