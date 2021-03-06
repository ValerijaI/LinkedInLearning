package designPatterns.behavior.visitor.challenge;

public interface Visitor {

    void visit(Manager manager);

    void visit(SalesPerson salesPerson);

    void visit(StaffList staffList);
}
