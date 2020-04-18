package chapter7;

import chapter2.AskUserForInput;

import java.util.ArrayList;

public class GradeBook {
    public ArrayList<String> names;
    public double[] student1Scores;
    public double[] student2Scores;
    public double[] student3Scores;
    public double[] student4Scores;
    public double[] student5Scores;
    public char[] grades;

    public GradeBook() {
        inputNames();
        inputScores();
        System.out.println(getGrades());
    }

    public String getGrades() {
        StringBuilder str = new StringBuilder();
        double totalPoints = 0;
        for (int i = 0; i < names.size(); i++) {
            str.append((names.get(i)) + " average test score = ");
            totalPoints = 0;
            if (i == 0) {
                for (int j = 0; j < student1Scores.length; j++) {
                    totalPoints = totalPoints + student1Scores[j];
                }
                str.append(calculateLetter(totalPoints / 4) + "\n");
            }
            if (i == 1) {
                for (int j = 0; j < student2Scores.length; j++) {
                    totalPoints = totalPoints + student2Scores[j];
                }
                str.append(calculateLetter(totalPoints / 4) + "\n");
            }
            if (i == 2) {
                for (int j = 0; j < student3Scores.length; j++) {
                    totalPoints = totalPoints + student3Scores[j];
                }
                str.append(calculateLetter(totalPoints / 4) + "\n");
            }
            if (i == 3) {
                for (int j = 0; j < student4Scores.length; j++) {
                    totalPoints = totalPoints + student4Scores[j];
                }
                str.append(calculateLetter(totalPoints / 4) + "\n");
            }
            if (i == 4) {
                for (int j = 0; j < student5Scores.length; j++) {
                    totalPoints = totalPoints + student5Scores[j];
                }
                str.append(calculateLetter(totalPoints / 4) + "\n");
            }
        }
        return str.toString();
    }

    public char calculateLetter(double average) {
        char grade = 0;
        if (average < 60) {
            grade = 'F';
        } else if (average < 70) {
            grade = 'D';
        } else if (average < 80) {
            grade = 'C';
        } else if (average < 90) {
            grade = 'B';
        } else if (average <= 100) {
            grade = 'A';
        }
        return grade;
    }

    public void inputScores() {
        int numOfTests = 4;
        student1Scores = new double[numOfTests];
        student2Scores = new double[numOfTests];
        student3Scores = new double[numOfTests];
        student4Scores = new double[numOfTests];
        student5Scores = new double[numOfTests];
        for (int i = 0; i < names.size(); i++) {
            System.out.println("For student " + names.get(i) + " : ");

            if (i == 0) {
                for (int j = 0; j < numOfTests; j++) {
                    student1Scores[j] = askForTestScore(
                            " Enter test " + (j + 1) + " score: ");

                }
            } else if (i == 1) {
                for (int j = 0; j < numOfTests; j++) {
                    student2Scores[j] = askForTestScore(
                            " Enter test " + (j + 1) + " score: ");

                }
            } else if (i == 2) {
                for (int j = 0; j < numOfTests; j++) {
                    student3Scores[j] = askForTestScore(
                            " Enter test " + (j + 1) + " score: ");
                }
            } else if (i == 3) {
                for (int j = 0; j < numOfTests; j++) {
                    student4Scores[j] = askForTestScore(
                            " Enter test " + (j + 1) + " score: ");

                }
            } else if (i == 4) {
                for (int j = 0; j < numOfTests; j++) {
                    student5Scores[j] = askForTestScore(
                            " Enter test " + (j + 1) + " score: ");
                }
            }
        }
    }

    public int askForTestScore(String prompt) {
        return AskUserForInput.askUserForInteger(
                0, 100, prompt);
    }

    public void inputNames() {
        names = new ArrayList<>();
        int numOfStudents = 5;
        for (int i = 0; i < numOfStudents; i++) {
            names.add(AskUserForInput.askUserForString(
                    "Enter the name of student " +
                            (i + 1) + " : "
            ));
        }
    }
}
