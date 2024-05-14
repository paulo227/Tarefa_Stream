package br.com.pPaulo;

import java.util.List;
import java.util.Objects;

public class RegisterPeople {

    String name;
    Integer years;
    String gender;

    public RegisterPeople(String name, Integer years, String gender) {
        this.name = name;
        this.years = years;
        this.gender = gender;
    }

    public RegisterPeople() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getYears() {
        return years;
    }

    public void setYears(Integer years) {
        this.years = years;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<RegisterPeople> cadastreUser(){
        RegisterPeople user1 = new RegisterPeople("Paulo", 26, "m".toUpperCase());
        RegisterPeople user2 = new RegisterPeople("Joana", 32, "f".toUpperCase());
        RegisterPeople user3 = new RegisterPeople("Allan", 3, "m".toUpperCase());
        RegisterPeople user4 = new RegisterPeople("Patricia", 35, "f".toUpperCase());
        RegisterPeople user5 = new RegisterPeople("Adriana", 12, "f".toUpperCase());
        RegisterPeople user6 = new RegisterPeople("Cecilia", 45, "f".toUpperCase());

        return List.of(user1, user2, user3, user4, user5, user6);
    }

    @Override
    public String toString() {
        return "" +
                "name='" + name + '\'' +
                ", years=" + years +
                ", gender='" + gender + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterPeople that = (RegisterPeople) o;
        return Objects.equals(name, that.name) && Objects.equals(years, that.years) && Objects.equals(gender, that.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, years, gender);
    }
}
