package cn.abelib.explore.alg;


import cn.abelib.util.annotation.Status;
import cn.abelib.util.annotation.Topic;
import cn.abelib.util.enums.StatusEnum;
import cn.abelib.util.enums.TopicEnum;

/**
 * @Author: abel.huang
 * @Date: 2019-01-12 22:19
 */
public class DynamicProgramming1 {
    @Status(StatusEnum.ACCEPT)
    @Topic({TopicEnum.DYNAMIC_PROGRAMMING, TopicEnum.RECURSION})
    public int climbStairs(int n) {
        if (n <= 3) {
            return n;
        }
        return climbStairs(n - 1) + climbStairs(n - 2);
    }
}
