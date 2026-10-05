class Solution {
    public int findMaximumCookieStudents(int[] Student, int[] Cookie) {
        //your code goes here

        Arrays.sort(Student);
        Arrays.sort(Cookie);

        int i = 0;
        int j = 0;

        while (i < Student.length && j < Cookie.length) {
            if (Student[i] <= Cookie[j]) {
                i++;
            }

            j++;
        }

        return i;
    }
}