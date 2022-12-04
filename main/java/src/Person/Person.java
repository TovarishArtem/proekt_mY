package src.Person;

import java.time.LocalDate;

enum Gender{
    MALE,
    FEMALE
}

public class Person {
    private String fullName;
    private Gender gender;
    private String homeAddress;
    private LocalDate birthDate;

    // public Person(String firstName, String lastName,String gender, String homeAddress, String birthDate) {
        public Person(String fullname) {


        this.fullName = fullname;
        //this.gender = getGender(gender);
        //this.homeAddress = homeAddress;
        //this.birthDate = LocalDate.parse(birthDate);
    }

    public String getFullName() {return this.fullName;}
    public Gender getGender() {return this.gender;}
    public String getHomeAddress() {return this.homeAddress;}
    public LocalDate getBirthDate() {return this.birthDate;}
    public Gender getGender(String gender) {
        gender = gender.toLowerCase();
        return (gender == "male") ? Gender.MALE : Gender.FEMALE;
    }
    public String addGender(Gender gender) {
        return gender.toString().toLowerCase();
    }
}