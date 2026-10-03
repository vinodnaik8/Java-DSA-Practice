package Arrays;

public class check_arr_sorted {
    public static Boolean isSorted() {
    int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length - 1; i++)
        {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
}
}