package com.creation1;

public class Student1 {

    private String name;
    private int rollNo;
    private int section;

    public Student1(String name, int rollNo, int section) {
        super();
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

    // Setter method
    public void doChange(String name) {
        this.name = name;
    }

    public String doName() {
        return name;
    }

    public static void main(String[] args) {

        Student1 st = new Student1("Kamdev", 1, 4);

        st.doChange("Ram");

        String result = st.doName();
        
        System.out.println("The name of the Student now is = " + result);
    }
}