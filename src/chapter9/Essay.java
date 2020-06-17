package chapter9;

public class Essay extends GradedActivity {
    public Essay(double grammar,
                 double spelling,
                 double length,
                 double content) {
        double essayScore = grammar + spelling + length + content;
        super.setScore(essayScore);
    }
}
