package cn.abelib.point;

import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @Author: abel.huang
 * @Date: 2020-04-13 22:39
 */
public class PointToOffer45 {

    public String minNumber(int[] nums) {
        List<String> numList = Arrays.stream(nums).boxed().map(i -> i + "").sorted((o1, o2) -> (o1 + o2).compareTo(o2 + o1)).collect(Collectors.toList());
        return String.join("", numList);
    }

    @Test
    public void test() {

    }
}
