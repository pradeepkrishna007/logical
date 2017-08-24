
public class Employee implements Comparable<Employee>{
	private int eid;
	private String name;
	private String city;

	public Employee(int eid, String name, String city) {
		super();
		this.eid = eid;
		this.name = name;
		this.city = city;
	}

	
	
	public int getEid() {
		return eid;
	}



	public String getName() {
		return name;
	}



	public String getCity() {
		return city;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + eid;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (eid != other.eid)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Employee obj) {
		if (this == obj)
			return 0;
		if (obj == null)
			return -1;
		if (getClass() != obj.getClass())
			return 1;
		Employee other = (Employee) obj;

		if (eid != other.eid)
			return 1;
		if (name == null) {
			if (other.name != null)
				return 1;
		} else if (!name.equals(other.name))
			return 1;
		return 0;
	}



}
