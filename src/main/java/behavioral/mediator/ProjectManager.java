package behavioral.mediator;

import java.util.LinkedList;
import java.util.List;

public class ProjectManager implements Mediator {

    private List<Employee> employees = new LinkedList<>();

    void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void notify(String message, Employee sender) {
        for (Employee employee : employees) {
            if (employee != sender) {
                employee.receive(message);
            }
        }
    }
}
