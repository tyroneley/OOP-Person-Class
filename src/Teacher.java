import java.util.LinkedList;

public class Teacher extends Person {
    private int numCourses;
    private LinkedList<String> courses = new LinkedList<>();

    public Teacher(){
    }
    
    public Teacher(String name, String address) {
        super(name, address);
    }

    public boolean addCourse(String course) {
        if (courses.contains(course)) {
            return false;
        }
        courses.add(course);
        numCourses += 1;
        return true;
    }

    public boolean removeCourse(String course) {
        if (courses.contains(course)) {
            courses.remove(course);
            numCourses -= 1;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
       return ("Teacher: " + super.getName() + " (" + super.getAddress() + ")");
    }
}
