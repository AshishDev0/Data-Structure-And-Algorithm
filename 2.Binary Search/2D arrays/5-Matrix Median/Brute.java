class Solution {
    public int findMedian(int[][] matrix) {
        List<Integer> flattened = new ArrayList<>();

        for (int[] row: matrix) {
            for (int val: row) {
                flattened.add(val);
            }
        }

        Collections.sort(flattened);

        return flattened.get(flattened.size() / 2);
    }
}