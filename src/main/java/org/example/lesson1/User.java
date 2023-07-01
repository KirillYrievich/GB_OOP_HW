package org.example.lesson1;


public class User {
    private String login;
    private String password;
    private Basket mybasket;

    public User(String login, String password, Basket mybasket) {
        this.login = login;
        this.password = password;
        this.mybasket = mybasket;
    }

    public User() {
        this.login = "Unknown";
        this.password = "";
        this.mybasket = new Basket();
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Basket getMybasket() {
        return mybasket;
    }

    public void setMybasket(Basket mybasket) {
        this.mybasket = mybasket;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", mybasket=" + mybasket +
                '}';
    }
}
