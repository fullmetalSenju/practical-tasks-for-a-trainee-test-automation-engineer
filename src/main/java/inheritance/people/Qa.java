package inheritance.people;

public class Qa extends Person{
    

    private String bugReport;
    private int task;

    public Qa(String name, String address, String gender, String bugReport, int task) {
        super(name, address, gender);
        this.bugReport = bugReport;
        this.task = task;
    }

    public String getBugReport() {
        return bugReport;
    }

    public void setBugReport(String bugReport) {
        this.bugReport = bugReport;
    }

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    @Override
    public void work() {
        System.out.println("Suchen auf der bugs");
    }

    @Override
    public String toString() {
        return "Qa{" +
            "bugReport='" + bugReport + '\'' +
            ", task=" + task +
            '}';
    }
}
    
    

