package bean;

import java.util.List;

public class CollectionDemo {
    int eid;
    String question;
    List<String> answer;

    public CollectionDemo(int eid, String question, List<String> answer) {
        this.eid = eid;
        this.question = question;
        this.answer = answer;
    }
    public  void displayInfo(){
        System.out.println("Exam id is "+eid);
        System.out.println("Exam question"+question);
        answer.forEach(System.out::println);
    }
}
