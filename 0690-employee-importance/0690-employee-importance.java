/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer, Employee> map = new HashMap<>();
        for (Employee emp : employees) {
            map.put(emp.id, emp);
        }
        
        // Use DFS to calculate total importance
        return dfs(map, id);
    }
    
    private int dfs(Map<Integer, Employee> map, int id) {
        Employee emp = map.get(id);
        int totalImportance = emp.importance;
        for (int subId : emp.subordinates) {
            totalImportance += dfs(map, subId);
        }
        return totalImportance;
    }
}