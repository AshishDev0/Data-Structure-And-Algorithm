class Solution {
    public int[] JobScheduling(int[][] Jobs) {
        //your code goes here

        Arrays.sort(Jobs,
                (a, b) -> Integer.compare(b[2], a[2])
        );

        int maxDeadline = -1;
        for (int[] it : Jobs) {
            maxDeadline = Math.max(maxDeadline, it[1]);
        }

        int[] hash = new int[maxDeadline];
        Arrays.fill(hash, -1);

        int count = 0;
        int totalProfit = 0;

        for (int i = 0; i < Jobs.length; i++) {
            for (int j = Jobs[i][1] - 1; j >= 0; j--) {
                if (hash[j] == -1) {
                    count++;
                    hash[j] = Jobs[i][0];
                    totalProfit += Jobs[i][2];

                    break;
                }
            }
        }

        return new int[]{ count, totalProfit };
    }
}