package cn.abelib.solution.six;


/**
 * @Author: abel.huang
 * @Date: 2019-04-29 22:26
 *   points[] 用来表示每轮(只算有效轮数)得到的分数，total表示总分数
 */
public class BaseballGame682 {
    public int calPoints(String[] ops) {
        if (ops.length < 1) {
            return 0;
        }
        if (ops.length == 1) {
            return Integer.parseInt(ops[0]);
        }
        int[] points = new int[ops.length];
        int total = 0;
        int index = 0;
        points[0] = Integer.parseInt(ops[0]);
        total += points[0];
        for (int i = 1; i < ops.length; i ++) {
            if ("D".equals(ops[i])) {
                index++;
                points[index] = points[index - 1] * 2;
                total += points[index];
            } else if ("C".equals(ops[i])) {
                total -= points[index];
                index--;
            } else if ("+".equals(ops[i])) {
                index++;
                points[index] = points[index - 1] + points[index - 2];
                total += points[index];
            } else {
                index++;
                points[index] =  Integer.parseInt(ops[i]);
                total += points[index];

            }
        }
        return total;
    }
}
