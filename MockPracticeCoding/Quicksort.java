public class Quicksort {
    public static void sort(int[] a, int start, int end) {
        if (start >= end)
            return;

        int i = start, j = end, pivot = a[(start + end) / 2];
        while (i <= j) {
            while (a[i] < pivot)
                i++;
            while (a[j] > pivot)
                j--;
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        sort(a, start, j);
        sort(a, i, end);

    }

    public static void main(String[] args) {
        int[] a = { 8, 9, 6, 4, 3, 7, 1 };
        System.out.print("[");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println("]");

        sort(a, 0, a.length - 1);
        System.out.print("[");
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.print("]");

    }
}
