package cn.abelib.solution.zero;

/**
 * Created by abel-huang on 2016/8/14.
 * �����������и����ʣ�������ߵ������ȸ�С��
 * �ұߵ������ȸ������⣬��Ŀ˵���������Ľڵ��Ǵ�1��n��
 * ����������ȷ�������Ϊk�������ߵ�����1��k-1��
 * ���ұߵ�����k+1��n������һ�㼼���ǣ�
 * ����ͨ��һ������˵��Ψһ����������������������������������������������
 * ���Ǽ򵥵ĳ˷�ԭ�����ң�������������̬�����Ǹ���������޹صģ�
 * ֻ����������ж��ٽڵ��йء���������ѡ���1��n�����������
 * Ψһ�����������������Ǹ�Ϊ1��n������ӡ����Ը����⻯��Ϊ��kΪ����
 * ��Ψһ�����������������ж��٣�����Ǹ���̬�滮�������ˡ�
 * ���ǽ���һ������dp[i]������ڵ���Ϊi��Ψһ�����ж��ٸ���
 * ��Ȼdp[0]=dp[1]=1��
 */
public class LeetCode_96 {
    public static void main(String args[]) {
        int n = 4;
        System.out.print(numTrees(3));
    }

    public static int numTrees(int n) {
        int result[] = new int[n + 1];
        result[0] = 1;
        result[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < i; j++)
                result[i] += result[j] * result[i - j - 1];
        }
        return result[n];
    }
}