package model;

public class Person {
    private String last_name;
    private String first_name;
    private String phone_number;
    private String e_mail;

    public Person(String last_name, String first_name, String phone_number, String e_mail) {
        this.last_name = last_name;
        this.first_name = first_name;
        this.phone_number = phone_number;
        this.e_mail = e_mail;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getE_mail() {
        return e_mail;
    }

    public void setE_mail(String e_mail) {
        this.e_mail = e_mail;
    }

    @Override
    public String toString() {
        return "Person{" +
                "last_name='" + last_name + '\'' +
                ", first_name='" + first_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", e_mail='" + e_mail + '\'' +
                '}';
    }
}
