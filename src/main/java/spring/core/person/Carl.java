package spring.core.person;

import spring.core.Person;

public class Carl implements Person {
    @Override
    public void name() {
        System.out.println("Клиент Карл");
    }

    @Override
    public void credit() {
        System.out.println("Обнаружен кредит 10000 рублей");
    }

    @Override
    public void deposit() {
        System.out.println("Депозит 50000 рублей");
    }

    @Override
    public void num() {
        System.out.println("Номер счета 334422");
    }
}
