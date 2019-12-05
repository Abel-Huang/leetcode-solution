package cn.abelib.solution.four;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-12-05 22:52
 */
public class FizzBuzz412 {
    public List<String> fizzBuzz(int n) {
        if (n < 1) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    result.add("FizzBuzz");
                } else {
                    result.add("Fizz");
                }
            } else {
                if (i % 5 == 0) {
                    result.add("Buzz");
                } else {
                    result.add(String.valueOf(i));
                }
            }
        }
        return result;
    }

    @Test
    public void fizzBuzzTest() {
        int n1 = 15;
        System.err.println(fizzBuzz(n1));

        int n2 = 20;
        System.err.println(fizzBuzz(n2));
    }
}
