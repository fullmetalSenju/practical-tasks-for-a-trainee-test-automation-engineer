package inheritance.people;

public class Cook extends Person {
    private String favouriteMeal;
    private int workDays;

    public Cook(String name, String address, String gender, String favouriteMeal, int workDays) {
        super(name, address, gender);
        this.favouriteMeal = favouriteMeal;
        this.workDays = workDays;
    }

    public String getFavouriteMeal() {
        return favouriteMeal;
    }

    public void setFavouriteMeal(String favouriteMeal) {
        this.favouriteMeal = favouriteMeal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }
    
    public String makeMenu(){
       return  "Ratatouille for dinner";
    }
    
    @Override
    public void work() {
        System.out.println("Cook the meals");
    }
}
