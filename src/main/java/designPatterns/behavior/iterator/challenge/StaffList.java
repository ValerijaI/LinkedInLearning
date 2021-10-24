package designPatterns.behavior.iterator.challenge;

import java.util.Iterator;

public class StaffList implements Iterable{

    Employee [] employees;

    public StaffList(Employee... employees) {
        this.employees = employees;
    }

    public Employee[] getEmployees() {
        return employees;
    }

    @Override
    public Iterator iterator() {
        return new StaffListIterator(this);
    }
}
