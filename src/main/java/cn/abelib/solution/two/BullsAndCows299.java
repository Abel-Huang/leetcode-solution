package cn.abelib.solution.two;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author abel-huang
 * @date 2016/8/3
 */
public class BullsAndCows299 {
    public static void main(String args[]) {
        String secret = "1123";
        String guess = "0111";
        System.out.print(getHint(secret, guess));
    }

    public static String getHint(String secret, String guess) {
        if (secret.length() < 1 || secret.length() != guess.length()) {
            return 0 + "A" + 0 + "B";
        }
        int bulls = 0;
        int cows = 0;
        int length = guess.length();
        Map<Character, Integer> hashMap = new HashMap<>();
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                if (!hashMap.containsKey(secret.charAt(i))) {
                    hashMap.put(secret.charAt(i), 1);
                } else {
                    hashMap.put(secret.charAt(i), hashMap.get(secret.charAt(i)) + 1);

                }
                list.add(guess.charAt(i));
            }
        }
        for (int i = 0; i < list.size(); i++) {
            if (hashMap.containsKey(list.get(i))) {
                hashMap.put(list.get(i), hashMap.get(list.get(i)) - 1);
                if (hashMap.get(list.get(i)) < 1) {
                    hashMap.remove(list.get(i));
                }
                cows++;
            }
        }
        return bulls + "A" + cows + "B";

    }
}
