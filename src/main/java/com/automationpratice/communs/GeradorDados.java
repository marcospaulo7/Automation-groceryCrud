package com.automationpratice.communs;

import com.github.javafaker.Faker;

import java.util.Locale;

public class GeradorDados {

    static Faker faker = new Faker(new Locale("pt-BR"));

    public static String getPrimeiroNome() {
        return faker.name().firstName();
    }

    public static String getSobrenome() {
        return faker.name().lastName();
    }

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getEndereco(){
        return faker.address().streetAddress();
    }

}
