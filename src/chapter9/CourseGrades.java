package chapter9;

public class CourseGrades implements Analyzable {
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

    public double getAverage() {
        double total = 0;
        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i].getScore();
        }

        return total / grades.length;
    }

    public GradedActivity getHighest() {
        double highestScore = grades[0].getScore();
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() > highestScore) {
                highestScore = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
    }

    public GradedActivity getLowest() {
        double lowestScore = grades[0].getScore();
        int index = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i].getScore() < lowestScore) {
                lowestScore = grades[i].getScore();
                index = i;
            }
        }
        return grades[index];
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
