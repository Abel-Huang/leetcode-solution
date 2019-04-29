package cn.abelib.ten;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 01:31
 */
public class TotalDurationsDivisibleBy601010 {
    /**
     * time limit
     * @param time
     * @return
     */
    public int numPairsDivisibleBy601(int[] time) {
        if (time.length < 2) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < time.length - 1; i ++) {
            for (int j = i + 1; j < time.length; j ++) {
                if ((time[i] + time[j]) % 60 == 0) {
                    count ++;
                }
            }
        }
        return count;
    }

    /**
     * SUCCESS
     * @param time
     * @return
     */
    public int numPairsDivisibleBy60(int[] time) {
        if (time.length < 2) {
            return 0;
        }
        int[] mods = new int[60];
        for (int t : time) {
            mods[t % 60] ++;
        }
        int count = 0;
        for (int i = 1; i < 30; i ++) {
            count += mods[i] * mods[60 - i];
        }
        count += (mods[0] * (mods[0] - 1)) / 2;
        count += (mods[30] * (mods[30] - 1)) / 2;
        return count;
    }
}
