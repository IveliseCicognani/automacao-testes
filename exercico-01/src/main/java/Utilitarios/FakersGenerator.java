package Utilitarios;

import com.github.javafaker.Faker;

public class FakersGenerator {
    private Faker faker;

    public FakersGenerator(){
        faker = new Faker();

    }

    public String pegaPrimeiroNome(){
        return faker.name().firstName();
    }

    public String pegaUltimoNome(){
        return faker.name().lastName();
    }

    public String pegaCodigo

}
