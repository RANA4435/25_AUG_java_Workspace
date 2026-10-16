package com.loop1;

public class Driver {

    public static void main(String args[]) {

        

        Student pp1 = new Student("kamdev", 24, 566, 1200, "Maths", "B");
        Student pp2 = new Student("Salman", 23, 567, 1200, "Science", "A");
        Student pp3 = new Student("Sonu", 25, 568, 1200, "Biology", "C");
        Student pp4 = new Student("Rahul", 26, 560, 1200, "Chemistry", "D");
        
        Student pp[] = new Student[4];

        pp[0] = pp1;
        pp[1] = pp2;
        pp[2] = pp3;
        pp[3] = pp4;

        for (int i = 0; i < pp.length; i++) {

            if (pp[i].marks < 567) {
            	if(pp[i].age<24) {
            	
                System.out.println("Print the Marks = " + pp[i].marks);
                System.out.println("Print the Marks = " + pp[i].name);
                System.out.println("print the age="+pp[i].age);
            	}

            }
        }
    }
}