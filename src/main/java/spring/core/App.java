package spring.core;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Получение bean
        //Если бы мы указали Dog/Cat.class то в случае изменения конфига
        //пришлось бы менять и код. В случае с Pet.class такой необходимости нет.
        //Мы получаем объект имплементирующий интерфейс Pet
        Person person = context.getBean("Person", Person.class);
        person.name();
        person.credit();
        person.deposit();
        person.num();

        context.close();
    }
}
