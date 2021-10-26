package designPatterns.behavior.visitor.challenge;

public interface Employee {

  int getSalary();

  void accept(Visitor visitor);

}
