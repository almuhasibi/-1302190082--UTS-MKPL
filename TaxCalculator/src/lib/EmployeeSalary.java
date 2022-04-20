package lib;

public class EmployeeSalary extends Employee{

    private int monthSalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

    public EmployeeSalary(Employee worker){
        super(worker.getFirstName(), worker.getLastName(), worker.getEmployeeId(), 
        worker.getAddress(), worker.getForeigner(), worker.getGender());
    }

    public void setmonthSalary(int grade) {	 // method Sett Month Sallary
		if (grade == 1) {
			monthSalary = 3000000;
			foreignerSalary(monthSalary);
		}else if (grade == 2) {
			monthSalary = 5000000;
			foreignerSalary(monthSalary);
		}else if (grade == 3) {
			monthSalary = 7000000;
			foreignerSalary(monthSalary);
		}
        
	}

    public int getMonthSalary(){  //Getter month Sallary
        return monthSalary;
    }
 
    public void foreignerSalary(int monthSalary){  
        if (!super.isForeigner()) {
            monthSalary = (int) (monthSalary + (monthSalary * 0.5));
        }
    }
	
	public void setAnnualDeductible(int deductible) { //Setter Anual Deductible
		this.annualDeductible = deductible;
	}
	
	public void setAdditionalIncome(int income) {	 //Set Income Adds 
		this.otherMonthlyIncome = income;
	}

    public int getAnnualDeductible(){  //Getter Anual Deductible
        return annualDeductible;
    }

    public int getAddtionalIncome(){ //Getter Income Adds
        return otherMonthlyIncome;
    }
}
