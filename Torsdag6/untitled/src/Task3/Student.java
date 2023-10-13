package Task3;

import java.util.ArrayList;


public class Student extends Person{

    ArrayList<String>passedCourses;
    ArrayList<String>currentCourses;
    public Student(String name, ArrayList<String>passedCourses, ArrayList<String>currentCourses){
        super(name);
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    public boolean addCourse(String Course){
        return true;
    }


}
