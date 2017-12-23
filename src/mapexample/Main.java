package mapexample;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
public static void main(String arg[]) {

    Resource resource = new ClassPathResource("mapexample\\applicationContext.xml");
    BeanFactory factory = new XmlBeanFactory(resource);
    Question question = (Question) factory.getBean("q");
    question.displayInfo();
}

}
