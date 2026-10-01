class Solution {
    public String mergeAlternately(String word1, String word2) {
        int left1 = 0;
        int left2 = 0;

        int right1 = word1.length() - 1;
        int right2 = word2.length() - 1;

        StringBuilder ans = new StringBuilder();

        while (left1 <= right1 && left2 <= right2) {
            ans.append(word1.charAt(left1));
            ans.append(word2.charAt(left2));

            left1++;
            left2++;
        }

        while (left1 <= right1) {
            ans.append(word1.charAt(left1));
            left1++;
        }

        while (left2 <= right2) {
            ans.append(word2.charAt(left2));
            left2++;
        }

        return ans.toString();
    }
}