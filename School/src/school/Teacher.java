package school;

import java.util.List;
import java.util.Random;

public class Teacher {

    String name;
    boolean strict;
    boolean headTeacher;
    Subject teachedSubject;
    private List<Class> teachedClass;

    public Teacher(String name, boolean strict, boolean headTeacher,
            Subject teachedSubject) {
        this.name = name;
        this.strict = strict;
        this.headTeacher = headTeacher;
        this.teachedSubject = teachedSubject;

    }

    public String exam(Subject subject, Student student) {
        int strictness = 0;
        int multiplier = 0;
        Random rand = new Random();
        int knowledge = rand.nextInt(15) + 1;
        int difficulty = 0;
        int result = Integer.MAX_VALUE;

        if (subject == Math.mathematics) {
            difficulty = 40;
        } else {
            difficulty = 10;
        }

        if (strict == true) {
            strictness = 3;
        } else {
            strictness = 10;
        }
        if (student.favoriteSubjects.get(0) == subject
                || student.favoriteSubjects.get(1) == subject) {
            multiplier = 10;
        } else {
            multiplier = 5;
        }

        result = (multiplier * (strictness + knowledge) - difficulty);
        if (result > 150) {
            return student.name + " " + subject.name + " " + result + " Megfelelt!";
        } else {
            return student.name + " " + subject.name + " " + result + " Nem felelt meg!";
        }
    }

    public List<Class> getTeachedClass() {
        return teachedClass;
    }

    public void setTeachedClass(List<Class> teachedClass) {
        this.teachedClass = teachedClass;
    }

}
