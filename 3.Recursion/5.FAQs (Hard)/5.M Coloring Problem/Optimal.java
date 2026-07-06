class Solution {
    private boolean isSafe(int paint, int node, List<List<Integer>> adj, int[] color) {
        for (int neighbour : adj.get(node)) {
            if (color[neighbour] == paint)  {
                return false;
            }
        }

        return true;
    }

    private boolean backTrack(int node, int n, int m, List<List<Integer>> adj, int[] color) {
        if (node == n) {
            return true;
        }

        for (int i = 1; i <= m; i++) {
            if (isSafe(i, node, adj, color)) {
                color[node] = i;
                boolean result = backTrack(node + 1, n, m, adj, color);
                if (result) {
                    return true;
                }
                color[node] = 0;
            }
        }

        return false;
    }

    boolean graphColoring(int[][] edges, int m, int n) {
        List<List<Integer>> adj = new ArrayList<>();
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        return backTrack(0, n, m, adj, color);
    }
}