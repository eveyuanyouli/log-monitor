package com.tgpms.exception;

/**
 * @author May
 * <p>
 * 全局异常相关描述
 * 相关异常信息可在此依次补充
 */
public enum ExceptionExplain {

    // 成功相关信息描述
    SUCCESS_BY_INFOS(0, "操作成功"),
    SUCCESS_BY_INSERT(1, "增加成功"),
    SUCCESS_BY_UPDATE(2, "修改成功"),
    SUCCESS_BY_DELETE(3, "删除成功"),

    // 失败操作相关信息描述
    ERROR_BY_INSERT(-1, "增加失败"),
    ERROR_BY_UPDATE(-2, "修改失败"),
    ERROR_BY_DELETE(-3, "删除失败"),
    ERROR_BY_QUERY(-4, "查询异常"),
    

    // 空信息描述
    EMPTY_BY_DATA(-5, "数据为空"),

    // 解析失败描述
    ERROR_BY_PARSING(-6, "数据解析失败"),
    ERROR_BY_OVERDUE(-7, "会话过期"),

    // 其他异常信息描述
    ERROR_BY_INSERT_REPETITION(-8, "增加重复"),
    ERROR_BY_QUERY_ENPTY(-9, "查询结果为空"),
    
    //Vform错误
    ERROR_BY_VFORM_POST(-10,"同步请求失败"),

    // Token 为空
    ERROR_BY_TOKEN_EMPTY(-11, "Token 为空"),

    EMPTY_BY_LOCATION_OR_FILENAME(-12, "文件路径或文件名为空")
    ;

    /**
     * 异常相关状态
     */
    private Integer status;

    /**
     * 异常相关状态的描述
     */
    private String explain;

    /**
     * 构造异常状态与异常说明
     *
     * @param status
     * @param explain
     */
    ExceptionExplain(Integer status, String explain) {
        this.status = status;
        this.explain = explain;
    }



    /**
     * 构造异常说明
     *
     * @param explain
     */
    ExceptionExplain(String explain) {
        this.explain = explain;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public static ExceptionExplain exceptionExplain(int index) {
        for (ExceptionExplain exceptionExplain : values()) {
            if (exceptionExplain.getStatus().equals(index)) {
                return exceptionExplain;
            }
        }
        return null;
    }

}
