class Solution {
    public int maxMeetings(int[] start, int[] end) {
        //your code goes here

        List<int[]> meetings = new ArrayList<>();

        for (int i = 0; i < start.length; i++) {
            meetings.add(new int[]{ start[i], end[i] });
        }

        Collections.sort(meetings,
                (a, b) -> Integer.compare(a[1], b[1])
        );

        int count = 1;
        int endsAt = meetings.get(0)[1];

        for (int i = 1; i < meetings.size(); i++) {
            if (meetings.get(i)[0] > endsAt) {
                count++;
                endsAt = meetings.get(i)[1];
            }
        }

        return count;
    }
}