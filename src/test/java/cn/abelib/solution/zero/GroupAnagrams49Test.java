package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 15:23
 */
public class GroupAnagrams49Test {
    private GroupAnagrams49 groupAnagrams49;

    @Before
    public void init() {
        groupAnagrams49 = new GroupAnagrams49();
    }

    @Test
    public void groupAnagrams() {
        String[] s = {"eat", "tea", "tan", "ate", "nat", "bat"};
        System.out.print(groupAnagrams49.groupAnagrams(s));
    }
}