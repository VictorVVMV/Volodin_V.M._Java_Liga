package com.Lesson4Service.ServiceL4.objects;

/*
    Класс Покупатель, содержит поля: имя, электронная почта.
 */
public class Customer {

    private String name;

    private String email;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    /*
    Переопределённый метод toString
     */
    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
