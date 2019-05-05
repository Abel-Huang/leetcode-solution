package cn.abelib.util.enums;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 02:37
 */
public enum TopicEnum {
    /**
     * 数组
     */
    ARRAY(0, "AC"),
    /**
     * 动态规划
     */
    DYNAMIC_PROGRAMMING(1, "dynamic programming"),
    /**
     * 数学
     */
    MATH(2, "math"),
    /**
     * 字符串
     */
    STRING(3, "string"),
    /**
     * 树
     */
    TREE(4, "tree"),
    /**
     * 哈希表
     */
    HASHTABLE(5, "hash table"),
    /**
     * 深度优先搜索
     */
    DFS(6, "depth-first search"),
    /**
     * 二分搜索
     */
    BINARY_SEARCH(7, "binary search"),
    /**
     * 双指针
     */
    TWO_POINTERS(8, "two pointers"),
    /**
     * 贪心算法
     */
    GREEDY(9, "greedy"),
    /**
     * 广度优先搜索
     */
    BFS(10, "breath-first search"),
    /**
     *  栈
     */
    STACK(11, "stack"),
    /**
     * 队列
     */
    QUEUE(12, "queue"),
    /**
     * 设计
     */
    DESIGN(13, "design"),
    /**
     * 回溯算法
     */
    BACKTRACKING(14, "backtracking"),
    /**
     * 链表
     */
    LINKED_LIST(15, "linked list"),
    /**
     * 堆
     */
    HEAP(16, "heap"),
    /**
     * 排序
     */
    SORT(17, "sort"),
    /**
     * 图
     */
    GRAPH(18, "graph"),
    /**
     * 并查集
     */
    UNION_FIND(19, "union find"),
    /**
     * 分治算法
     */
    DIVIDE_CONQUER(20, "divide and conquer"),
    /**
     * 位运算
     */
    BIT_MANIPULATION(21, "bit manipulation"),
    /**
     * 字典树
     */
    TRIE(22, "trie"),
    /**
     * 递归
     */
    RECURSION(23,"recursion"),
    /**
     *  滑动窗口
     */
    SLIDING_WINDOW(24,"sliding window"),
    /**
     * 有序map
     */
    ORDERED_MAP(25,"ordered map"),
    /**
     *  线段树
     */
    SEGMENT_TREE(26, "segment tree"),
    /**
     * 最大最小值
     */
    MINIMAX(27, "minmax"),
    /**
     * 二叉索引树
     */
    BINARY_INDEXED_TREE(28, "binary indexed tree"),
    /**
     * 随机
     */
    RANDOM(29, "random"),
    /**
     * 拓扑排序
     */
    TOPOLOGICAL_SORT(30, "topological sort"),
    /**
     *  脑经急转弯
     */
    BRAIN_TEASER(31, "brain teaser"),
    /**
     *  几何
     */
    GEOMETRY(32, "geometry"),
    /**
     * 扫描线算法
     */
    LINE_SWEEP(33, "line sweep"),
    /**
     *  拒绝抽样
     */
    REJECTION_SAMPLING(34, "rejection sampling"),
    /**
     *  蓄水池抽样
     */
    RESERVOIR_SAMPLING(35, "reservoir sampling"),
    /**
     *  记忆化
     */
    MEMOIZATION(36, "memoization");

    private int code;
    private String desc;

    TopicEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
