/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connectme;

import javax.swing.JOptionPane;

/**
 *
 * @author sachitha
 */
public class HRAssistant extends User {
    public HRAssistant(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        // Implement login for HR Assistant
        JOptionPane.showMessageDialog(null, "Login successful as HR Assistant!");
        new Dashboard("HR Assistant").setVisible(true);
    }
}
