package model;

public class Question {
    String question;
    String answer;

    //constructor
    public Question(String question) {
        this.question = question;
    }

    //getter setter
    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
