package Task3;

import java.util.ArrayList;

public class Teacher extends Person {

    ArrayList<String> canTeach;
    ArrayList<String> currentCourses;
    public Teacher( String name, ArrayList<String> canTeach, ArrayList<String> currentCourses ){
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String Course) {
        if(canTeach.contains(Course) && !currentCourses.contains(Course)) {
            currentCourses.add(Course);
            return true;
        }
        return false;
    }
}
