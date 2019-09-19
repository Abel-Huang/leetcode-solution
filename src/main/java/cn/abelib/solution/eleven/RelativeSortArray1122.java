package cn.abelib.solution.eleven;

import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Author: abel.huang
 * @Date: 2019-09-15 19:09
 */
public class RelativeSortArray1122 {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        if (arr1.length < 1) {
            return arr1;
        }

        Map<Integer, Integer> map = new LinkedHashMap<>();
        for (int i : arr2) {
            map.put(i, 0);
        }
        int[] result = new int[arr1.length];
        int idx = 0;
        Arrays.sort(arr1);
        for (int i = arr1.length - 1; i >= 0; i --) {
            if (map.containsKey(arr1[i])) {
                map.put(arr1[i], map.get(arr1[i]) + 1);
            } else {
                result[arr1.length - 1 -idx] = arr1[i];
                idx ++;
            }
        }
        idx = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int times = entry.getValue();
            while (times > 0) {
                result[idx] = entry.getKey();
                idx ++;
                times --;
            }
        }
        return result;
    }

    @Test
    public void relativeSortArrayTest() {
        int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
        int[] arr2 = {2,1,4,3,9,6};
       // System.err.println(Arrays.toString(relativeSortArray(arr1, arr2)));
        int[] arr3 = {28, 6, 22, 8, 44, 17};
        int[] arr4 = {22, 28, 8, 6};
        System.err.println(Arrays.toString(relativeSortArray(arr3, arr4)));
    }
}
