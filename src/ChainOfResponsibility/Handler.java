package ChainOfResponsibility;

// 抽象处理着
public abstract class Handler {
    private  Handler nextHandler;
    public  void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    public abstract  void handleRequest(Request request);

    protected void passRequestToNextHandler(Request request){
        if(nextHandler != null){
            nextHandler.handleRequest(request);
        }else {
            System.out.println("NO handler can handle this request");
        }
    }
}
