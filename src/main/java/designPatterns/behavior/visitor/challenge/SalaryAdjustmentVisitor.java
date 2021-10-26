package designPatterns.behavior.visitor.challenge;

public class SalaryAdjustmentVisitor implements Visitor{
    @Override
    public void visit(Manager manager) {
        manager.setSalary(145);
    }

    @Override
    public void visit(SalesPerson salesPerson) {
        salesPerson.setSalary(100);
    }

    @Override
    public void visit(StaffList staffList) {
        System.out.println("Applied");
    }
}
