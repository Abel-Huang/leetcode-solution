package cn.abelib.solution.six;

import java.util.*;

/**
 * @Author: abel.huang
 * @Date: 2019-04-28 00:54
 */
public class EmployeeImportance690 {
    static class Employee {
        // It's the unique id of each node;
        // unique id of this employee
        public int id;
        // the importance value of this employee
        public int importance;
        // the id of direct subordinates
        public List<Integer> subordinates;
    }

    public int getImportance(List<Employee> employees, int id) {
        if (employees.size() < 1) {
            return 0;
        }
        int importances = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (Employee employee : employees) {
            if (employee.id == id) {
                map.put(employee.id, employee.importance);
                for (Integer iid : employee.subordinates) {
                    map.put(iid, 0);
                }
                break;
            }
        }
        while (true) {
            int size = map.size();
            for (Employee employee : employees) {
                if (map.containsKey(employee.id)) {
                    map.put(employee.id, employee.importance);
                    for (Integer iid : employee.subordinates) {
                        if (!map.containsKey(iid)) {
                            map.put(iid, 0);
                        }
                    }
                }
            }
            if (map.size() == size) {
                break;
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            importances += entry.getValue();
        }
        return importances;
    }
}
