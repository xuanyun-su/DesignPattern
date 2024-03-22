package ChainOfResponsibility;

public class ConcreteHandler2 extends  Handler{
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == RequestType.TYPE2) {
            System.out.println("ConcreteHandler2 handles the request.");
        } else {
            passRequestToNextHandler(request);
        }
    }
}
