package useAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunShark {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("useAnnotation.xml");

        Swimming bean = context.getBean("sharkBean", Shark.class);

        bean.sail();

        context.close();
    }
}
