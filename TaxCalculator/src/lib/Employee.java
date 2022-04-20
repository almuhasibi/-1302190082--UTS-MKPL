package lib;

public class Employee {

	private String employeeId;
	private String firstName;
	private String lastName;
	private String idNumber;
	private String address;
	private boolean isForeigner;



	public  enum Gender { // Primitive Obsession Bad Smell convert to enumerasi 
		laki_laki,
		perempuan,
	}


	public Employee(
			String employeeId,
			String firstName,
			String lastName,
			String idNumber,
			String address,
			boolean isForeigner, // Primitive Obsession Bad Smell convert with enumerasi 
			Gender Gender // Primitive Obsession Bad Smell convert with enumerasi 
		) {
			this.employeeId = employeeId;
			this.firstName = firstName;
			this.lastName = lastName;
			this.idNumber = idNumber;
			this.address = address;
			this.isForeigner = isForeigner;
		}
	public Gender getGender() {
		return null;		
	}
	public Employee(String firstName2, String lastName2, String employeeId2, String address2, String foreigner, Gender gender2) {
    }

    public Employee(String firstName2, String lastName2, String employeeId2, String address2, String foreigner) {
    }
	public Employee(boolean isForeigner) {
		this.isForeigner = isForeigner;
	}
	public String getEmployeeId() { // Getter For id Employe
		return employeeId;
	}

	public String getFirstName() { // Getter FristNamr
		return firstName;
	}

	public String getLastName() { // Getter Last Name
		return lastName;
	}

	public String getIdNumber() { // Getter Id Number
		return idNumber;
	}

	public String getAddress() { //getter Address 
		return address;
	}

	public boolean isForeigner() { // Gett is Foreign
		return isForeigner;
	}
	public String getForeigner() { //Getter For Foreigner
		return null;
	}
}
	