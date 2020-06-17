package chapter9;

public class CourseGradesDemo {
    public static void main(String[] args) {
        demonstration();
    }

    public static void demonstration() {
        CourseGrades example = new CourseGrades();
        example.grades = new GradedActivity[4];

        GradedActivity lab = new GradedActivity();
        lab.setScore(80);
        example.setLab(lab);

         // We need a modified GradedActivity object to be referenced by example[1]
        // we allow grade[1] to reference an instance of an anonymous inner class
        // The alternative would be to create another entire class that inherits from
        // GradedActivity and override setScore and getGrade.
        // The anonymous inner class provides a shortcut to overriding those methods
        // without creating an entire separate class that inherits from GradedActivity
        example.setPassFailExam(
                new GradedActivity() {
                    @Override
                    public void setScore(double incorrect) {
                        int totalQuestions = 10;
                        super.setScore((totalQuestions - incorrect) * 10);
                    }

                    @Override
                    public char getGrade() {
                        if (getScore() < 70) {
                            return 'F';
                        } else return 'P';
                    }
                }
        );

        // The setScore and getGrade methods belonging to the object referenced by
        // grades[1] has been re-written.
        // The setScore method now takes the number of questions missed out of a
        // 10 question exam and calculates, the score and passes that score
        // to the super classes 'score' field via the super class' setScore method.
        example.grades[1].setScore(3);

        // create an Essay object and pass values to it's constructor
        Essay essay = new Essay(20, 20, 10, 20);
        // allow grades[2] to reference the newly created Essay object.
        example.setEssay(essay);

        // We now need to allow example.grades[3] to reference on object
        // meant to grade a final exam.
        // Once again we must modify a method in a GradedActivity object.
        // Instead of writing an entirely new class that inherits from GradedActivity,
        // we can create an instance of a modified class that inherits from GradedActivity
        // with a different overridden method.
        GradedActivity finalExam = new GradedActivity() {
            @Override
            public void setScore(double missed) {
                int totalQuestions = 50;
                super.setScore((totalQuestions - missed) * 2);
            }
        };
        finalExam.setScore(1);
        example.setFinalExam(finalExam);

        System.out.println(example.toString());
    }
}
