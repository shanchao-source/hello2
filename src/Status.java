public enum Status {
    HELLO(100),
    WORD(200),
    WELCOME(300),
    NOTFIND(404),
    INNERERROR(500),
    ZHANGQING(500);
    private int code;

    public static void main(String[] args){
        System.out.println("hello,zhangs");
    }
    Status(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
