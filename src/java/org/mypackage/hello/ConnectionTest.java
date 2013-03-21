/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mypackage.hello;

import java.security.AuthProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.security.auth.Subject;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.login.LoginException;
import javax.sql.DataSource;

/**
 *
 * @author llybeck
 */
public class ConnectionTest {

    static Connection connection;
    
    public static void main(String[] args) throws SQLException, ClassNotFoundException, NamingException {
        Class.forName("org.postgresql.Driver");
        
        connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost/llybeck", "llybeck", "7efa67a6d7dd527f");

        querySelect("*", "users");
        
        connection.close();

    }

    private static void querySelect(String what, String fromWhere) throws SQLException {
        String stm = "SELECT " + what + " FROM " + fromWhere;
        PreparedStatement pst = connection.prepareStatement(stm);
        ResultSet result = pst.executeQuery();
        while (result.next()) {
            System.out.println("Result:");
            for (int i = 1; i <= 4; i++) {
                System.out.println("  " + result.getString(i));
            }
            System.out.println("  " + result.getBoolean(5));
        }
    }
}
