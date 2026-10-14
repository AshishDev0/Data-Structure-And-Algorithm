class Solution {
    public List<List<Integer>> merge(List<List<Integer>> intervals) {
        // Your code goes here

        intervals.sort((a, b) -> Integer.compare(a.get(0), b.get(0)));
        List<List<Integer>> merged = new ArrayList<>();

        for (List<Integer> interval : intervals) {
            if (merged.isEmpty() || merged.get(merged.size() - 1).get(1) < interval.get(0)) {
                merged.add(new ArrayList<>(interval));
            } else {
                List<Integer> last = merged.get(merged.size() - 1);
                last.set(1, Math.max(last.get(1), interval.get(1)));
            }
        }

        return merged;
    }
}