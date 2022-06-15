package spring.core.person;

import spring.core.Person;

public class Roza implements Person {
    @Override
    public void name() {
        System.out.println("Клиент Роза");
    }

    @Override
    public void credit() {
        System.out.println("Обнаружен кредит 60000 рублей");
    }

    @Override
    public void deposit() {
        System.out.println("Депозит 1000000 рублей");
    }

    @Override
    public void num() {
        System.out.println("Номер счета 883322");
    }
}
