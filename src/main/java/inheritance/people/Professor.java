package inheritance.people;

// Uncomment, fix and expand the class
public class Professor extends Person {
    private String universityName;
    private String degree;
    private String course;
    
    public Professor(String universityName,  String degree, String course, String name, String gender, String  address ){
        super(name, address,  gender);
        this.universityName = universityName;
        this.degree  = degree;
        this.course = course;
    }

    public String getUniversityName(){
        return universityName;
    }

    public String getDegree(){
        return degree;
    }
    
    public String getCourse(){
        return course;
    }
    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    
    public void setDegree(String degree) {
        this.degree = degree;
    }
    
    public void setCourse(String course) {
        this.course = course;
    }
    
    @Override
    public void work() {
        System.out.println("Teach students");
    }

    @Override
    public String toString() {
        return "Professor{" +
            "universityName='" + universityName + '\'' +
            ", degree='" + degree + '\'' +
            ", course='" + course + '\'' +
            '}';
    }
}