import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginPage extends JFrame implements ActionListener {
  private JTextField usernameField;
  private JPasswordField passwordField;
  private JButton loginButton;

  public LoginPage() {
    super("Login Page");
    setSize(300, 150);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel(new GridLayout(3, 2));
    add(panel);

    panel.add(new JLabel("Username: "));
    usernameField = new JTextField();
    panel.add(usernameField);

    panel.add(new JLabel("Password: "));
    passwordField = new JPasswordField();
    panel.add(passwordField);

    loginButton = new JButton("Login");
    loginButton.addActionListener(this);
    panel.add(loginButton);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == loginButton) {
      String username = usernameField.getText();
      char[] password = passwordField.getPassword();

      if (username.equals("admin") && new String(password).equals("password")) {
        System.out.println("Login successful");
      } else {
        System.out.println("Login failed. Please try again.");
      }
    }
  }

  public static void main(String[] args) {
    LoginPage loginPage = new LoginPage();
    loginPage.setVisible(true);
  }
}
