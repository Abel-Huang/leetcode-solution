package cn.abelib.solution.seven;

import org.junit.Test;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 23:54
 */
public class FindSmallestLetterGreaterThanTarget744 {
    public char nextGreatestLetter(char[] letters, char target) {
        int len = letters.length;
        if (target >= letters[len - 1] || target < letters[0]) {
            return letters[0];
        }
        for (char letter : letters) {
            if (letter > target) {
                return letter;
            }
        }
        return letters[0];
    }

    @Test
    public void nextGreatestLetterTest() {
        char[] letters1 = {'c', 'f', 'j'};
        char target1 = 'd';
        System.err.println(nextGreatestLetter(letters1, target1));

        char[] letters2 = {'c', 'f', 'j'};
        char target2 = 'g';
        System.err.println(nextGreatestLetter(letters2, target2));


        char[] letters3 = {'c', 'k', 'j'};
        char target3 = 'c';
        System.err.println(nextGreatestLetter(letters3, target3));
    }
}
