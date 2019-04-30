package cn.abelib.solution.ten;

/**
 * @author abel.huang
 * @date 2019/4/30 10:30
 */
public class TwoCityScheduling1029 {
    public int twoCitySchedCost(int[][] costs) {
        int countA = 0;
        int countB = 0;
        int total = 0;
        for (int i = 0; i < costs.length; i++) {
            if (costs[i][0] > costs[i][1]) {
                if (countB < costs.length /2) {
                    countB++;
                    total +=  costs[i][1];
                } else {
                    countA++;
                    total +=  costs[i][0];
                }
            } else {
                if (countA < costs.length /2) {
                    countA++;
                    total +=  costs[i][0];
                } else {
                    countB++;
                    total +=  costs[i][1];
                }
            }
        }
        return total;
    }
}
