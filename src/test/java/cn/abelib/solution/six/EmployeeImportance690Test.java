package cn.abelib.solution.six;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: abel.huang
 * @Date: 2019-04-28 01:39
 */
public class EmployeeImportance690Test {
    EmployeeImportance690 employeeImportance690;
    @Before
    public void init() {
        employeeImportance690 = new EmployeeImportance690();
    }

    @Test
    public void getImportance() {
        EmployeeImportance690.Employee employee = new EmployeeImportance690.Employee();
        employee.id = 2;
        employee.importance = 5;
        List<Integer> list = new ArrayList<>();
        list.add(101);
        employee.subordinates = list;
        EmployeeImportance690.Employee employee2 = new EmployeeImportance690.Employee();
        employee2.id = 101;
        employee2.importance = 3;
        employee2.subordinates = new ArrayList<>();
        List<EmployeeImportance690.Employee> employees = new ArrayList<>();
        employees.add(employee2);
        employees.add(employee);
        System.out.println(employeeImportance690.getImportance(employees, 2));

    }
}