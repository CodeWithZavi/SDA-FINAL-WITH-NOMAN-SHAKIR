package presentation;

import business.Control;

public class User {
    private String name;
    private int id;

    public User(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void useControl(Control control) {
        System.out.println(name + " is interacting with the system.");
        control.manageServices();
    }
}
