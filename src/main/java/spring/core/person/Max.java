package spring.core.person;


import spring.core.Person;

public class Max implements Person {
    @Override
    public void name(){
        System.out.println("Клиент Макс");
    }

    @Override
    public void credit() {
        System.out.println("Кредита нет");
    }

    @Override
    public void deposit() {
        System.out.println("Депозит 30000 рублей");
    }

    @Override
    public void num() {
        System.out.println("Номер счета 667788");
    }
}
