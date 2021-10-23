package designPatterns.behavior.chainOfResponsibility.challenge;

public class DigestAuthenticationHandler extends AuthenticationHandler {

  public DigestAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  void handleRequest(String requestType) {
    if (requestType == "digest") {
      System.out.println("DIGEST!");
    } else {
      super.handleRequest(requestType);
    }

  }

}
