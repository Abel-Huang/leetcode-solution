package cn.abelib.solution.zero;

/**
 * Created by abel-huang on 2016/8/14.
 */
public class UniqueBinarySearchTrees96 {
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
