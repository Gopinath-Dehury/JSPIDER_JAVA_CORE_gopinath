class Zero1stAndOneLast {
    public static void main(String[] args) {
        int[] a = { 1, 0, 1, 1, 0, 1, 1, 0 };
        int[] b = new int[a.length];
        int j = 0, k = a.length - 1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                b[j++] = a[i];
            } else {
                b[k--] = a[i];
            }
        }

        for (int i : b) {
            System.out.println(i);
        }
    }
}