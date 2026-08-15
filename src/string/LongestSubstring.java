package string;

public class LongestSubstring {
    public static void main(String[] args) {

        String str = "abcabcbb";

        int maxLength = 0;

        for (int i = 0; i < str.length(); i++) {

            boolean[] visited = new boolean[256];
            int count = 0;

            for (int j = i; j < str.length(); j++) {

                char ch = str.charAt(j);

                if (visited[ch]) {
                    break;
                }

                visited[ch] = true;
                count++;
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }

        System.out.println("Longest length = " + maxLength);
    }
}
