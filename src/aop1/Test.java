package aop1;


        import org.springframework.beans.factory.BeanFactory;
        import org.springframework.beans.factory.xml.XmlBeanFactory;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;
        import org.springframework.core.io.ClassPathResource;
        import org.springframework.core.io.Resource;
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop1\\applicationContext.xml");
        Operation e = (Operation) context.getBean("opBean");
        System.out.println("calling msg...");
        e.msg();
        System.out.println("calling m...");
        e.m();
        System.out.println("calling k...");
        e.k();
    }
}