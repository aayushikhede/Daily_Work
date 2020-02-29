
	public class Employee {

		int id;
		String name;
		String address;
		String designation;
		int age;
		long phone;
		double salary;
		

		public Employee() {
		}

		public Employee(int id, String name, String address, String designation, int age, int salary, int phone) {
			super();
			this.id = id;
			this.name = name;
			this.address = address;
			this.designation = designation;
			this.age = age;
			this.phone = phone;
			this.salary = salary;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

		public String getDesignation() {
			return designation;
		}

		public void setDesignation(String designation) {
			this.designation = designation;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public long getPhone() {
			return phone;
		}

		public void setPhone(long phone) {
			this.phone = phone;
		}

		public double getSalary() {
			return salary;
		}

		public void setSalary(double salary) {
			this.salary = salary;
		}

		@Override
		public String toString() {
			return id + " : " + name + " : " + address + " :" + designation + " : " + age  + " : " + phone + " : "+salary;

		}

	}


