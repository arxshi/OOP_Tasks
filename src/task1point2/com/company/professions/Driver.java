package task1point2.com.company.professions;

import task1.Person;

public class Driver extends Person {

    String fullName;
    int yearsOfDrivingExp;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYearsOfDrivingExp() {
        return yearsOfDrivingExp;
    }

    public void setYearsOfDrivingExp(int yearsOfDrivingExp) {
        this.yearsOfDrivingExp = yearsOfDrivingExp;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "fullName='" + fullName + '\'' +
                ", yearsOfDrivingExp=" + yearsOfDrivingExp +
                '}';
    }
}
