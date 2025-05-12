import java.awt.*;
import java.awt.event.*;

public class LoginFormAWT extends Frame implements ActionListener {

    // declare GUI components
    TextField userField, passField;
    // for usename and password input

    Label message;
    // to display login status

    // constructor -setd up the GUI
    LoginFormAWT() {
        // sets the title of the Frame window
        setTitle("AWT Login Form");

        // use FlowLayout to arrange components in a row
        setLayout(new FlowLayout());

        // Add a label and text field for username
        add(new Label("username: "));
        userField = new TextField(20);
        add(userField);
        // Label component
        // 20-character wide input field
        // Add to the frame

        // Add a label and text field for password
        add(new Label("Password:"));
        passField = new TextField(20);
        passField.setEchoChar('*');
        // Hides password input with '*'
        add(passField);

        // Create and add a login button
        Button loginBtn = new Button("Login");
        loginBtn.addActionListener(this);
        // Register current class for button click
        add(loginBtn);

        // Create and add a message label to show result
        message = new Label("");
        add(message);

        // Set window size and make it visible
        setSize(300, 200);
        setVisible(true);
    }

    // This method is called when the login button is clicked
    public void actionPerformed(ActionEvent e) {
        // Get text entered in fields
        String user = userField.getText();
        String pass = passField.getText();

        // Check if credentials match hardcoded values
        if (user.equals("admin") && pass.equals("1234"))
            message.setText("Login Successful!");
        else
            message.setText("Invalid credentials.");
    }

    // Main method - entry point of the program
    public static void main(String[] args) {
        new LoginFormAWT(); // Create an object to run the GUI

    }
}
