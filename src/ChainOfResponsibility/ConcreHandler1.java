package ChainOfResponsibility;

// 具体处理者
public class ConcreHandler1 extends Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE1) {
            System.out.println("ConcreteHandler1 handles the request.");
        } else {
            passRequestToNextHandler(request);
        }
    }
}
