import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FindUniqueWithMap {

	public static void main(String[] args) {

		Employee e1=new Employee(10, "Pradeep","HYD");
		Employee e2=new Employee(20, "Pradeep Kumar","DHN");
		Employee e3=new Employee(30, "RAVI","DHN");
		Employee e4=new Employee(10, "Pradeep","DHN");
		Employee e5=new Employee(20, "Pradeep Kumar","HYD");
		Employee e6=new Employee(40, "Anindhya","LKO");
		Employee e7=new Employee(40, "Anindhya","LKO");
		Employee e8=new Employee(10, "Pradeep","SBC");
		
		List<Employee> arryList = new ArrayList<>();
		arryList.add(e1);
		arryList.add(e2);
		arryList.add(e3);
		arryList.add(e4);
		arryList.add(e5);
		arryList.add(e6);
		arryList.add(e7);
		arryList.add(e8);

		Map<Employee,Integer> map = new HashMap<>();
		for (Employee employee : arryList) {
			if(map.size()==0){
				map.put(employee, 1);
			}else{
				if(map.containsKey(employee)){
					map.put(employee, map.get(employee)+1);
				}else{
					map.put(employee, 1);
				}
			}
		}//forEach loop

		for (Map.Entry<Employee, Integer> mapEmployee : map.entrySet()) {
			if(mapEmployee.getValue()>1){
				System.out.println((mapEmployee.getKey()).getEid()+" - "+(mapEmployee.getKey()).getName()+" :: "+mapEmployee.getValue());
			}
		}
	}
}