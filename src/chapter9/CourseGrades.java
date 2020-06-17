package chapter9;

public class CourseGrades {
    GradedActivity[] grades;

    public void setLab(GradedActivity lab) {
        grades[0] = lab;
    }

    public void setPassFailExam(GradedActivity passFailExam) {
        grades[1] = passFailExam;
    }

    public void setEssay(GradedActivity essay) {
        grades[2] = essay;
    }

    public void setFinalExam(GradedActivity finalExam) {
        grades[3] = finalExam;
    }

    public String toString() {
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < grades.length; i++) {
            str.append("Graded activity score " + (i+1) + " = ");
            str.append(grades[i].getScore() + "\n");
            str.append("Graded activity grade " + (i+1) + " = ");
            str.append(grades[i].getGrade() + "\n");
        }

        return str.toString();
    }
}
