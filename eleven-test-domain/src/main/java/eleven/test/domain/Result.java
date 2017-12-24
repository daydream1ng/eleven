package eleven.test.domain;

/**
 * Created by Administrator on 2017/12/24.
 */
public class Result {
    /**
     * 是否成功
     */
    private boolean success;
    /**
     * service返回的对象
     */
    private Object data;
    private String errorMsg;

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
