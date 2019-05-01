package cn.abelib.solution.three;

import java.util.*;

/**
 *
 * @author abel-huang
 * @date 2016/7/10
 */
public class IntersectionOfTwoArrays349 {
    public static void main(String[] args) {
        int[] a = {};
        int[] b = {};
        int[] c = intersection(a, b);
        for (int i1 : c) {
            System.out.println(i1);
        }
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer, Integer> hashMap = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            if (!hashMap.containsKey(nums1[i])) {
                hashMap.put(nums1[i], i);
            }
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i])) {
                list.add(nums2[i]);
                hashMap.remove(nums2[i]);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    public int[] intersection2(int[] nums1, int[] nums2) {
        if (nums1.length == 0 || nums2.length == 0) {
            return new int[Math.min(nums1.length, nums2.length)];
        }
        Set<Integer> set = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i : nums2) {
            if (set.contains(i)) {
                set2.add(i);
            }
        }
        int[] nums = new int[set2.size()];
        Iterator<Integer> iterator = set2.iterator();
        for (int i = 0; i < set2.size(); i ++){
            nums[i] = iterator.next();
        }
        return nums;
    }
}
