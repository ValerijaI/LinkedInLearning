package designPatterns.behavior.chainOfResponsibility.challenge;

public class Client {

  public static void main(String[] args) {

    AuthenticationHandler authenticationHandler = new BasicAuthenticationHandler(new ClientCertificateAuthenticationHandler(new DigestAuthenticationHandler(null)));

    authenticationHandler.handleRequest("digest");

    authenticationHandler.handleRequest("certificate");
  }

}
