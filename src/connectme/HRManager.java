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
public class HRManager extends User {
    public HRManager(String username, String password) {
        super(username, password);
    }

    @Override
    public void login() {
        // Implement login for HR Manager
        JOptionPane.showMessageDialog(null, "Login successful as HR Manager!");
        new Dashboard("HR Manager").setVisible(true);
    }
}
