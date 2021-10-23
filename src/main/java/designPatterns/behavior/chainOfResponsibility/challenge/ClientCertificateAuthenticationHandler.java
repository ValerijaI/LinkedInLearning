package designPatterns.behavior.chainOfResponsibility.challenge;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler {

  public ClientCertificateAuthenticationHandler(AuthenticationHandler next) {
    super(next);
  }

  void handleRequest(String requestType) {
    if (requestType == "certificate") {
      System.out.println("CERTIFICATE!");
    } else {
      super.handleRequest(requestType);
    }
  }

}
