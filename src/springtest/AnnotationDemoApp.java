package springtest;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

    public static void main(String[] args){

        // read spring config file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // get the bean from spring container (here the default bean id is used = classname)
        Coach theCoach = context.getBean("tennisCoach", Coach.class);
        Coach theYogaCoach = context.getBean("yogaCoach", Coach.class);

        // call a method on the bean
        System.out.println(theCoach.getDailyWorkout());

        System.out.println(theYogaCoach.getDailyWorkout());

        // close the context
        context.close();
    }
}
