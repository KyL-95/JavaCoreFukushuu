package exception;

public class AgeException extends  Exception {

    private String mess;

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    public AgeException(String mess) {
        super(mess);
        this.mess = mess;

    }
}
