package logic;

import java.util.ArrayList;

public class Database {
	private static ArrayList<Employee> employees;
	
	public Database() {
		employees = new ArrayList<Employee>();
	}
	
	public Employee getEmployeeById(int id) {
		for(Employee e: employees) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	
	public Employee getEmployeeByIndex(int index) {
		return employees.get(index);
	}
	
	public boolean addEmployee(Employee e) {
		if(getEmployeeById(e.getId())==null) {
		employees.add(e);
		return true;
		}
		return false;
	}
	
	
	public boolean removeEmployeeById(int id) {
		Employee e = getEmployeeById(id);
		if(e!=null) {
			employees.remove(e);
			return true;
		}
		return false;
	}
	
	public ArrayList<String> getAllEmployeeDescriptions(){
		ArrayList allEmployeeDescriptions=new ArrayList<String>();
		for(Employee employee:employees){
				allEmployeeDescriptions.add(employee.getDescription());
			}
		return allEmployeeDescriptions;
		}

	
	public int calculateAllSalary() {
		int allSalary=0;
		for(Employee employee:employees){
			allSalary+=employee.computeSalary();
		}
		return allSalary;
	}
	
	public int getTotalEmployeeCount() {
		return employees.size();
	}
}
