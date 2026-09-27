class Solution {
    private String convertToBinary(int n) {
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 2);
            n /= 2;
        }

        return sb.reverse().toString();
    }

    public boolean checkIthBit(int n, int i) {
        // Your code goes here

        String binary = convertToBinary(n);

        if (i >= binary.length())
            return false;

        return binary.charAt(binary.length() - 1 - i) == '1';
    }
}