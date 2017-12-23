package main;

import java.util.List;

public class Question {
    int qid;
    String name;
    List<Answer> answerList;

    public Question(int qid, String name, List<Answer> answerList) {
        this.qid = qid;
        this.name = name;
        this.answerList = answerList;
    }
    public void display(){
        System.out.println("question id   "+qid);
        System.out.println("question name is "+name);
        answerList.forEach(i->System.out.println(i.toString()));

    }
}
