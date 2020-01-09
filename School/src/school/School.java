package school;

import java.util.List;

public class School {

    String name;
    List<Student> students;
    List<Teacher> teachers;
    List<Subject> subjects;
    School school = null;

    private School(String name, List<Student> students, List<Teacher> teachers, List<Subject> subjects) {
        this.name = name;
        this.students = students;
        this.teachers = teachers;
        this.subjects = subjects;
    }

    public School schoolBuilder(String name, List<Student> students, List<Teacher> teachers, List<Subject> subjects) {
        if (school == null) {
            return school = new School(name, students, teachers, subjects);
        }

        return school;
    }

}
