package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String arg[]) {

    Resource resource = new ClassPathResource("main\\applicationContext.xml");
    BeanFactory factory = new XmlBeanFactory(resource);
    Question question = (Question) factory.getBean("collection");
    question.display();
}

}
