package bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        Resource resource=new ClassPathResource("bean\\applicationContext.xml");
        BeanFactory factory=new XmlBeanFactory(resource);

       // Student student=(Student)factory.getBean("studentbean");
       // Student1 student1=(Student1)factory.getBean("studentbean1");
       // Address address=(Address) factory.getBean("addressbean");
       // student1.displayInfo();

        CollectionDemo collectionDemo=(CollectionDemo)factory.getBean("collection");
        collectionDemo.displayInfo();
    }
}