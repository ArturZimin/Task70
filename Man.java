package by.minsk.itakademy.arturzimin;

import java.util.Objects;

public class Man {

   public String name;
   public String surname;
   public int age;

    public Man(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }
    //public Man(){}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Man)) return false;
        Man man = (Man) o;
        return getAge() == man.getAge() && Objects.equals(getName(), man.getName()) && Objects.equals(getSurname(), man.getSurname());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSurname(), getAge());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Man{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", age=").append(age);
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
    Man man = new Man("Andrey","Ivanov",30);

}}
