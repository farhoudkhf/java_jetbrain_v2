package c02_objectsAndAPIs.ch03_Abstraction;

// Java code below
/***************************************************
 Write your answer here, and then test your code.
 Count the number of each type of employee.
 ****************************************************/

class Answer02_ch03 {

    /***************************************************
     Change these boolean values to control whether you see
     the expected result and/or hints.
     ****************************************************/
    static boolean showExpectedResult = false;
    static boolean showHints = false;

    static EmployeeReport generateReport(Employee[] employees) {

        int managerCount = 0;
        int engineerCount = 0;
        int internCount = 0;

        for(int i=0; i<employees.length; i++){
            /*
                TODO: Determine the employee's role
                and increase the count appropriately
             */
            if (employees[i] instanceof Manager) {
                managerCount++;
            } else if (employees[i] instanceof Engineer) {
                engineerCount++;
            } else if (employees[i] instanceof Intern) {
                internCount++;
            }
        }

        return new EmployeeReport(managerCount, engineerCount, internCount);
    }
}

/***************************************************
 Do not change any of the classes below
 ****************************************************/

class Employee {}

class Manager extends Employee {}

class Engineer extends Employee {}

class Intern extends Employee {}

class EmployeeReport {
    private int numberOfManagers;
    private int numberOfEngineers;
    private int numberOfInterns;

    public EmployeeReport() {
        setNumberOfManagers(0);
        setNumberOfEngineers(0);
        setNumberOfInterns(0);
    }

    public EmployeeReport(int numberOfManagers, int numberOfEngineers, int numberOfInterns){
        setNumberOfManagers(numberOfManagers);
        setNumberOfEngineers(numberOfEngineers);
        setNumberOfInterns(numberOfInterns);
    }

    public int getNumberOfManagers() {
        return numberOfManagers;
    }

    public void setNumberOfManagers(int numberOfManagers) {
        this.numberOfManagers = numberOfManagers;
    }

    public int getNumberOfEngineers() {
        return numberOfEngineers;
    }

    public void setNumberOfEngineers(int numberOfEngineers) {
        this.numberOfEngineers = numberOfEngineers;
    }

    public int getNumberOfInterns() {
        return numberOfInterns;
    }

    public void setNumberOfInterns(int numberOfInterns) {
        this.numberOfInterns = numberOfInterns;
    }

    public static void main(String[] args) {
        /*************************************************************
         This is how your code will be called.
         Your answer should be a report with the correct count
         for each type of employee.
         You can edit this code to try different testing cases.
         *************************************************************/
        Employee[] employees = {
                new Manager(),
                new Engineer(),
                new Manager(),
                new Intern(),
                new Intern(),
                new Manager(),
                new Engineer(),
                new Engineer(),
                new Engineer(),
                new Engineer()
        };
        EmployeeReport report = Answer02_ch03.generateReport(employees);
    }
}

