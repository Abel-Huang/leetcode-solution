package cn.abelib.solution.zero;

import org.junit.Before;
import org.junit.Test;


/**
 * @author abel.huang
 * @date 2019/4/30 15:49
 */
public class SearchInsertPosition35Test {
    private SearchInsertPosition35 searchInsertPosition35;
    @Before
    public void init() {
        searchInsertPosition35 = new SearchInsertPosition35();
    }

    @Test
    public void searchInsert() {
        int[] nums = {1, 3, 5, 6};
        System.out.println(searchInsertPosition35.searchInsert(nums, 5));
        System.out.println(searchInsertPosition35.searchInsert(nums, 2));
        System.out.println(searchInsertPosition35.searchInsert(nums, 7));
        System.out.println(searchInsertPosition35.searchInsert(nums, 0));
    }
}