import java.util.Scanner;

public class Quick {
    public static void Swap(int i, int j, int arr[]) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int Partition(int l, int r, int arr[]) {
        int key = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= key) {
                i += 1;
                Swap(i, j, arr);
            }
        }
        Swap(i + 1, r, arr);
        return i + 1;
    }

    public static void QuickSort(int l, int r, int arr[]) {
        if (l > r) return;
        int q = Partition(l, r, arr);
        QuickSort(l, q - 1, arr);
        QuickSort(q + 1, r, arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        QuickSort(0, n - 1, arr);

        for (int x : arr) System.out.print(x + " ");
    }
}
