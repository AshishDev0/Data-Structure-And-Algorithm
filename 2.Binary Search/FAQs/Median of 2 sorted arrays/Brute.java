class Solution {
    private int[] mergeArray(int[] arr1, int m, int[] arr2, int n) {
        int[] temp = new int[m + n];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (arr1[i] <= arr2[j])
                temp[k++] = arr1[i++];
            else
                temp[k++] = arr2[j++];
        }

        while (i < m)
            temp[k++] = arr1[i++];
        while (j < n)
            temp[k++] = arr2[j++];

        return temp;
    }

    public double median(int[] arr1, int[] arr2) {
        int[] mergedArray = mergeArray(arr1, arr1.length, arr2, arr2.length);

        int n = mergedArray.length;

        if (n % 2 == 1)
            return mergedArray[n / 2];

        return ((double) mergedArray[n / 2 - 1] + mergedArray[n / 2]) / 2;
    }
}
