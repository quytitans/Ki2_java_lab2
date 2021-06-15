package lab2_exercise1.Entity;

public class Student {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    private int id;
    private String name;
    private Boolean gender;

    //contructor default;
    public Student() {
        this.id = -1;
        this.name = "no name";
        this.gender = true;
    }

    //Contructor với 3 đối số
    public Student(int id, String name, Boolean gender) {
        this.id = id;
        this.name = name;
        this.gender = gender;
    }
    public void printInfo(){
        System.out.println("-------------------------");
        System.out.println("| ID |      NAME      | Male |");
        System.out.printf("| %d |      %s      | %b |",this.id, this.name, this.gender);
    }
}
