import javax.swing.*;
import java.awt.*;

public class LoginPanel extends JFrame {

    public LoginPanel() {
        // Frame setup
        setTitle("Login Panel");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 640);
        setResizable(false); // Fixed size
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Left panel with login form
        JPanel leftPanel = new JPanel();
        leftPanel.setBackground(Color.WHITE);
        leftPanel.setLayout(new BoxLayout(leftPanel, BoxLayout.Y_AXIS));
        leftPanel.setBorder(BorderFactory.createEmptyBorder(20, 40, 20, 40)); // Padding for form
        leftPanel.setAlignmentY(Component.TOP_ALIGNMENT);

        // Login box panel
        JPanel loginBox = new JPanel();
        loginBox.setBackground(Color.WHITE);
        loginBox.setLayout(new BoxLayout(loginBox, BoxLayout.Y_AXIS));
        loginBox.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(new Color(200, 200, 200), 0),
                BorderFactory.createEmptyBorder(50, 70, 20, 70))); // Outer and inner padding
        loginBox.setAlignmentX(Component.LEFT_ALIGNMENT);

        // Logo
        ImageIcon logoIcon = new ImageIcon("src/picture/logo.png"); // Replace with your logo
        Image logoImage = logoIcon.getImage().getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        JLabel logoLabel = new JLabel(new ImageIcon(logoImage));
        logoLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(logoLabel);
        //setIconImage(logoImage.getClass());

        loginBox.add(Box.createRigidArea(new Dimension(0, 10))); // Spacing

        // Welcome Text
        JLabel welcomeLabel = new JLabel("Welcome back!");
        welcomeLabel.setFont(new Font("Poppins", Font.BOLD, 28));
        welcomeLabel.setForeground(new Color(50, 50, 50));
        welcomeLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(welcomeLabel);

        JLabel subNoteLabel = new JLabel("<html>Enter to get unlimited access to data & information.</html>");
        subNoteLabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        subNoteLabel.setForeground(new Color(120, 120, 120));
        subNoteLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(subNoteLabel);

        loginBox.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        // Email Field
        JLabel emailLabel = new JLabel("Email :");
        emailLabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        emailLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(emailLabel);

        JTextField emailField = new JTextField();
        emailField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // Match box width
        emailField.setAlignmentX(Component.LEFT_ALIGNMENT);
        emailField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        loginBox.add(emailField);

        loginBox.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        // Password Field
        JLabel passwordLabel = new JLabel("Password :");
        passwordLabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        passwordLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(passwordLabel);

        JPasswordField passwordField = new JPasswordField();
        passwordField.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // Match box width
        passwordField.setAlignmentX(Component.LEFT_ALIGNMENT);
        passwordField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200), 1));
        loginBox.add(passwordField);

        loginBox.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        // Remember Me and Forgot Password on the same line
        JPanel rememberForgotPanel = new JPanel();
        rememberForgotPanel.setLayout(new BoxLayout(rememberForgotPanel, BoxLayout.X_AXIS));
        rememberForgotPanel.setBackground(Color.WHITE);
        rememberForgotPanel.setMaximumSize(new Dimension(Integer.MAX_VALUE, 30)); // Match box width

        JCheckBox rememberMeCheckBox = new JCheckBox("Remember me");
        rememberMeCheckBox.setBackground(Color.WHITE);
        rememberForgotPanel.add(rememberMeCheckBox);

        rememberForgotPanel.add(Box.createHorizontalGlue()); // Push the label to the right

        JLabel forgotPasswordLabel = new JLabel("<html><a href='#'>Forgot your password?</a></html>");
        forgotPasswordLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        rememberForgotPanel.add(forgotPasswordLabel);

//        loginBox.add(rememberForgotPanel);

        loginBox.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        // Login Button
        JButton loginButton = new JButton("Log In");
        loginButton.setBackground(new Color(85, 85, 255));
        loginButton.setForeground(Color.WHITE);
        loginButton.setFont(new Font("Poppins", Font.BOLD, 16));
        loginButton.setMaximumSize(new Dimension(Integer.MAX_VALUE, 40)); // Match box width
        loginButton.setBorder(BorderFactory.createEmptyBorder(10, 40, 10, 40)); // Wide button
        loginButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        loginButton.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(loginButton);

        loginBox.add(Box.createRigidArea(new Dimension(0, 20))); // Spacing

        JLabel registerLabel = new JLabel("<html>Don’t have an account? <a href='#'>Register here</a></html>");
        registerLabel.setFont(new Font("Poppins", Font.PLAIN, 14));
        registerLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        loginBox.add(registerLabel);

        leftPanel.add(loginBox); // Add login box to left panel

        // Right panel with pattern
        JLabel rightPanel = new JLabel();
        ImageIcon patternIcon = new ImageIcon("src/picture/pattern.jpg"); // Replace with your pattern
        Image patternImage = patternIcon.getImage().getScaledInstance(500, 600, Image.SCALE_SMOOTH);
        rightPanel.setIcon(new ImageIcon(patternImage));
        rightPanel.setHorizontalAlignment(JLabel.RIGHT);
        rightPanel.setVerticalAlignment(JLabel.TOP);

        // Split layout
        JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, leftPanel, rightPanel);
        splitPane.setDividerSize(0); // No border
        splitPane.setDividerLocation(500); // 50-50 split
        splitPane.setEnabled(false);

        add(splitPane, BorderLayout.CENTER);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginPanel frame = new LoginPanel();
            frame.setVisible(true);
        });
    }
}
