package lib;

import java.util.List;
import java.util.LinkedList;

public class Family extends Employee {
    private String FamilyName;
	private String FamilyIdNumber;
    private List<String> childNames;
	private List<String> TotalChildrens;
    
    public Family(Employee worker){
        super(worker.getFirstName(), worker.getLastName(), worker.getEmployeeId(), 
        worker.getAddress(), worker.getForeigner());

        childNames = new LinkedList<String>();
		TotalChildrens = new LinkedList<String>();
    }

    public void setFamilyName(String FamilyName){ // Setn Name of Family
        this.FamilyName = FamilyName;
    }
    public void setFamilyNumber(String FamilyIdNumber){ // set Family
        this.FamilyIdNumber = super.getEmployeeId();
    }


    public void addChild(String childName, String childIdNumber){ // add child
        childNames.add(childName);
    }

    public String getFamilyName(){ // Get Family Name
        return FamilyName;
    }
    public String getFamilyNumber(){ //get fam number
        return FamilyIdNumber;
    }

    public List<String> getChildIdNumber(){ // Geth child number
        return TotalChildrens;
    }
}
