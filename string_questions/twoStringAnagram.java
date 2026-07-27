package string_questions;

public class twoStringAnagram {

    public static void Anagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            System.out.println("Strings are not anagram");
            return;
        }

        boolean anagram = true;
        boolean[] visited = new boolean[str2.length()];

        for (int i = 0; i < str1.length(); i++) {

            anagram = false;   // use it every character

            for (int j = 0; j < str2.length(); j++) {

                if (str1.charAt(i) == str2.charAt(j) && !visited[j]) {
                    visited[j] = true;
                    anagram = true;
                    break;
                }
            }

            if (!anagram) {
                System.out.println("Strings are not anagram");
                return;
            }
        }

        System.out.println("Both strings are anagram");
    }

    public static void main(String[] args) {

        String str1 = "silent";
        String str2 = "listen";

        Anagram(str1, str2);
    }
}