package cn.abelib.solution.six;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 00:56
 */
public class RobotReturnToOrigin657 {
    public boolean judgeCircle(String moves) {
        int[] udlf = new int[4];
        if (moves.length() < 1) {
            return true;
        }
        if (moves.length() % 2 == 1) {
            return false;
        }
        for (int i = 0; i < moves.length(); i++) {
            switch (moves.charAt(i)) {
                case 'U':
                    udlf[0]++;
                    break;
                case 'D':
                    udlf[1]++;
                    break;
                case 'L':
                    udlf[2]++;
                    break;
                case 'R':
                    udlf[3]++;
                    break;
                default:
                    break;
            }
        }
        return udlf[0] == udlf[1] && udlf[2] == udlf[3];
    }
}
