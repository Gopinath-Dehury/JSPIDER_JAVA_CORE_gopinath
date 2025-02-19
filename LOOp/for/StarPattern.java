class StarPattern {
    public static void main(String[] args) {
        int n = 8; // You can adjust n to change the size of the pattern

        // Print the pattern using just two loops
        for (int i = 1; i <= 2 * n - 1; i++) {
            int stars = (i <= n) ? i : 2 * n - i; // Determine number of stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
