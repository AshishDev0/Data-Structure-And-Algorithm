class Solution {
    private int[] getMergedArray(int[] nums1, int n1, int[] nums2, int n2) {
        int[] temp = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j])
                temp[k++] = nums1[i++];
            else
                temp[k++] = nums2[j++];
        }

        while (i < n1) temp[k++] = nums1[i++];
        while (j < n2) temp[k++] = nums2[j++];

        return temp;
    }

    public int kthElement(int[] a, int[] b, int k) {
        int[] mergedArray = getMergedArray(a, a.length, b, b.length);

        return mergedArray[k - 1];
    }
}