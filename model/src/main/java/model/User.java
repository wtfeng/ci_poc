package model;

public class User {
    String name;
    Enum sex;
    public User(){}

    public User(String userName) {
        name = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enum getSex() {
        return sex;
    }

    public void setSex(Enum sex) {
        this.sex = sex;
    }
}
