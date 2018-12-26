/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proses;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author junaidi
 */
public class proses_login {
    private String username;
    private String password;
    
    koneksi kon = new koneksi();
    
    public proses_login() {
    }

    public proses_login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean validasiLogin(String username, String password) {
        try {
            String sql = "SELECT * FROM admin WHERE "
                + "username= '" + username + "' and " + " password='" + password + "'";
            kon.res = kon.stat.executeQuery(sql);
            if (kon.res.next()) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(proses_login.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return false;
    }
    
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
