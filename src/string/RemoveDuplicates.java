package string;

public class RemoveDuplicates {
    public static void main(String[] args) {

        String str = "programming";

        boolean[] visited = new boolean[256];

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (!visited[ch]) {
                result = result + ch;
                visited[ch] = true;
            }
        }

        System.out.println(result);
    }
}
