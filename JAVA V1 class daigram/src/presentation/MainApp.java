package presentation;

import business.Control;

public class MainApp {
    public static void main(String[] args) {
        // Create user
        User user = new User("noman shakir", 1);

        // Initialize control system
        Control control = new Control();

        // User interacts with the control system
        user.useControl(control);
    }
}
