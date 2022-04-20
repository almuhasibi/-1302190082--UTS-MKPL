package lib;

import java.time.LocalDate;

public class WorkingOnyear extends Employee {
    private static final int TotalChildrens = 0;
    private int join;
    private int onYear;
    private int dateYearJoin; // Primitive obsession
    private int dateMonthJoin; // Primitive obsession
    EmployeeSalary salary;
    Family Family;

    public WorkingOnyear(Employee employee, EmployeeSalary salary, Family Family, int dateYearJoin, int dateMonthJoin, int join)
    {
        super(
                employee.getFirstName(),
                employee.getLastName(),
                employee.getIdNumber(),
                employee.getEmployeeId(),
                employee.getAddress(),
                employee.isForeigner(),
                employee.getGender()
        );
        this.salary = salary;
        this.Family = Family;
        this.dateYearJoin = dateYearJoin;
        this.dateMonthJoin = dateMonthJoin;
        this.join = join;
    }
    public int getAnnualIncomeTax() { //fungsi untuk menghitung berapa lama pegawai bekerja dalam hitungan setahun, 

        LocalDate date = LocalDate.now();

        if (date.getYear() == dateYearJoin) {
            onYear = date.getMonthValue() - dateMonthJoin;
        }else {
            onYear = 12;
        }
        return TotalChildrens;
    }
}
