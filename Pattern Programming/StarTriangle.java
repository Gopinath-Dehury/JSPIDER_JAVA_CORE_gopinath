public class StarTriangle {
    public static void main(String[] args) {
        int n = 7, star = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= star; j++) {
                if(j==1||j==star||i==n)
                System.out.print("*"+" ");
                else
                System.out.print("  ");
            }
            star += 2;
            System.out.println();
        }
    }
}
