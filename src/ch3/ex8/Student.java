package ch3.ex8;

public class Student {
    private String name;
    private int totalScore=0;
    private int counterQuiz=0;

    public int getTotalScore() {
        return totalScore;
    }

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public void addQuiz(int score)
    {
        totalScore+=score;
        counterQuiz++;
    }

    public double getAverageScore(){
        return 1.0*totalScore/counterQuiz;
    }

}
