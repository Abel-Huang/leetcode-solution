package cn.abelib.solution.three;

/**
 *
 * @author abel-huang
 * @date 2016/7/11
 */
public class ReverseVowelsOfAString345 {
    public static void main(String args[]) {
        String s = " ";
        System.out.println(reverseVowels(s).length());
    }

    public static String reverseVowels(String s) {
        int[] array = new int[s.length()];
        char[] resultC = new char[s.length()];
        String result;
        for (int i = 0; i < s.length(); i++) {
            array[i] = 0;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u' || s.charAt(i) == 'A' || s.charAt(i) == 'E' || s.charAt(i) == 'I' || s.charAt(i) == 'O' || s.charAt(i) == 'U') {
                array[i] = 1;
            }
        }
        int front = 0, end = s.length() - 1;
        while (front <= end) {
            if (array[front] == 1 && array[end] == 1) {
                resultC[front] = s.charAt(end);
                resultC[end] = s.charAt(front);
                front++;
                end--;
            } else if (array[front] != 1 && array[end] == 1) {
                resultC[front] = s.charAt(front);
                front++;
            } else if (array[front] == 1 && array[end] != 1) {
                resultC[end] = s.charAt(end);
                end--;
            } else {
                resultC[front] = s.charAt(front);
                resultC[end] = s.charAt(end);
                front++;
                end--;
            }
        }
        result = new String(resultC);
        return result;
    }
}
