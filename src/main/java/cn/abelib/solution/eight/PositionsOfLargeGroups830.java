package cn.abelib.solution.eight;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-01-09 22:01
 */
public class PositionsOfLargeGroups830 {
    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> lists = new ArrayList<>();
        if (S.length() < 3) {
            return lists;
        }
        for (int i = 0; i < S.length() - 1; i ++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                continue;
            }
            for (int j = i + 1; j < S.length(); j ++) {
                if (S.charAt(i) != S.charAt(j)) {
                    if (j - i > 2){
                        List<Integer> items = new ArrayList<>();
                        items.add(i);
                        items.add(j - 1);
                        lists.add(items);
                    }
                    i = j - 1;
                    break;
                }
                if (j - i >= 2 && j == S.length() - 1){
                    List<Integer> items = new ArrayList<>();
                    items.add(i);
                    items.add(j);
                    lists.add(items);
                    return lists;
                }
            }
        }
        return lists;
    }
}
