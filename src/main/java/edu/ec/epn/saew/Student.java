package edu.ec.epn.saew;

public class Student {
    
    private Integer id;
    private String name;
    private Float grade;

    public Student(Integer id, String name, Float grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Float getGrade() {
        return grade;
    }
    public void setGrade(Float grade) {
        this.grade = grade;
    }

    
}
