package designPatterns.behavior.chainOfResponsibility.challenge;

public class BasicAuthenticationHandler extends AuthenticationHandler {

    public BasicAuthenticationHandler(AuthenticationHandler next) {
        super(next);
    }

    void handleRequest(String requestType) {
        if (requestType == "basic") {
            System.out.println("BASIC!");
        } else {
            super.handleRequest(requestType);
        }
    }

}
