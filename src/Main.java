public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tyrone", "Jakarta");
        Student student = new Student("Richard", "Kuala Lumpur");
        Teacher teacher = new Teacher("Michael", "Australia");
        System.out.println(person.toString());
        System.out.println(student.toString());
        student.addCourseGrade("OOP", 100);
        student.addCourseGrade("MATH", 50);
        student.printGrades();
        System.out.println(student.getAverageGrade());
        System.out.println(teacher.addCourse("OOP"));
    }
}