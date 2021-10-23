package designPatterns.behavior.chainOfResponsibility.challenge;

public abstract class AuthenticationHandler {

  private AuthenticationHandler next;

  public AuthenticationHandler(AuthenticationHandler next) {
    this.next = next;
  }

  void handleRequest(String requestType) {
    if (next != null) {
      next.handleRequest(requestType);
    }
  }

}
