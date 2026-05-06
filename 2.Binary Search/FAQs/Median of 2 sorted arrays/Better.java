class Solution {
    public double median(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        int n = n1 + n2;

        int idx1 = n / 2 - 1;
        int idx2 = n / 2;
        int ele1 = Integer.MIN_VALUE;
        int ele2 = Integer.MIN_VALUE;

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (arr1[i] < arr2[j]) {
                if (k == idx1) ele1 = arr1[i];
                if (k == idx2) ele2 = arr1[i];
                k++;
                i++;
            } else {
                if (k == idx1) ele1 = arr2[j];
                if (k == idx2) ele2 = arr2[j];
                k++;
                j++;
            }

            if (k > idx2)
                break;
        }

        while (i < n1) {
            if (k == idx1) ele1 = arr1[i];
            if (k == idx2) ele2 = arr1[i];
            k++;
            i++;

            if (k > idx2)
                break;
        }

        while (j < n2) {
            if (k == idx1) ele1 = arr2[j];
            if (k == idx2) ele2 = arr2[j];
            k++;
            j++;

            if (k > idx2)
                break;
        }

        if (n % 2 == 1)
            return ele2;

        return ((double) ele1 + ele2) / 2;
    }
}