import java.util.LinkedList;

public class Student extends Person {
    private int numCourses;
    private LinkedList<String> courses = new LinkedList<>();
    private LinkedList<Integer> grades = new LinkedList<>();

    public Student(){
    }
    
    public Student(String name, String address) {
        super(name, address);
    }

    public boolean addCourseGrade(String course, int grade) {
        if (courses.contains(course)) {
            System.out.println(super.getName() + " already has course " + course);
            return false;
        }
        courses.add(course);
        grades.add(grade);
        numCourses += 1;
        return true;
    }

    public void printGrades() {
        System.out.println(grades);
    }

    public int getAverageGrade() {
        int sum = 0;
        for (int g:grades) {
            sum += g;
        }
        return (sum / grades.size());
    }

    @Override
    public String toString() {
       return ("Student: " + super.getName() + " (" + super.getAddress() + ")");
    }
}
