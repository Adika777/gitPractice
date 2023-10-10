package org.example.utils;

import com.github.javafaker.Faker;
import org.example.models.Student;

public class FakeDataProvider {
    Faker faker = new Faker();

    public String generateFakeFullName() {
        return faker.name().fullName();
    }

    public String generateFakeFirstName(){
        return faker.name().firstName();
    }
    public String generateFakeLastName() {
        return faker.name().lastName();
    }

    public String generationPhoneNUmber() {
        return faker.number().digits(10);
    }

    public String generateFakeEmail() {
        return faker.internet().emailAddress();
    }

    public String generateFakeCurrentAddress() {
        return faker.address().fullAddress();
    }

    public String generateFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }


    public String generationFakePermanentAddress() {
        return faker.address().streetName() + " " + faker.address().streetAddressNumber();
    }



    public Student createFakeStudent() {
        Student student = new Student();
        student.setFirstName(generateFakeFirstName());
        student.setLastName(generateFakeLastName());
        student.setEmail(generateFakeEmail());
        student.setEmail(generateFakeEmail());
        student.setPhoneNumber(generationPhoneNUmber());
        student.setCurrentAddress(generateFakeCurrentAddress());

        return student;
    }

}
