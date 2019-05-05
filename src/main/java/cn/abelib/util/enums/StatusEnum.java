package cn.abelib.util.enums;

/**
 * @Author: abel.huang
 * @Date: 2019-04-30 02:38
 */
public enum StatusEnum {
    /**
     * 成功AC
     */
    ACCEPT(0, "AC"),
    /**
     * 超时
     */
    TIME_LIMIT(1, "time limit"),
    /**
     * 答案错误
     */
    WRONG_ANSWER(2, "wrong answer"),
    /**
     * 执行错误
     */
    EXEC_ERROR(3, "execute error"),
    /**
     * 还有更好的解决方案
     */
    NOT_BEST(4, "not best solution"),
    /**
     * 未开始
     */
    TODO(5, "todo"),
    /**
     *  目前没有思路
     */
    NO_IDEA(6, "have no idea"),
    /**
     * 目前正在做
     */
    DOING_NOW(7, "doing now ");

    private int code;
    private String desc;

    StatusEnum(int code, String desc) {
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

