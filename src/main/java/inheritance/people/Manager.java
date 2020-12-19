package inheritance.people;

public class Manager extends Person{
    private String task;
    private int dayOff;


    public Manager(String name, String address, String gender, String task, int dayOff) {
        super(name, address, gender);
        this.task = task;
        this.dayOff = dayOff;
    }
    
    public String getTask() {
        return task;
    }

    public void setTask(String task) {
        this.task = task;
    }

    public int getDayOff() {
        return dayOff;
    }

    public void setDayOff(int dayOff) {
        this.dayOff = dayOff;
    }

    @Override
    public void work() {
        System.out.println("Make tasks");
    }

    @Override
    public String toString() {
        return "Manager{" +
            "task='" + task + '\'' +
            ", dayOff=" + dayOff +
            '}';
    }
    
}
