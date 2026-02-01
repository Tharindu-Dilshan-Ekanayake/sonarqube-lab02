package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    private static final String DB_URL = "jdbc:mysql://localhost/db";

    /**
     * Finds a user by username using parameterized query to prevent SQL injection.
     * @param username the username to search for
     * @param dbUser database username (from environment/config)
     * @param dbPassword database password (from environment/config)
     * @return ResultSet containing user data
     * @throws SQLException if database error occurs
     */
    public ResultSet findUser(String username, String dbUser, String dbPassword) throws SQLException {
        Connection conn = DriverManager.getConnection(DB_URL, dbUser, dbPassword);
        String query = "SELECT * FROM users WHERE name = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        return pstmt.executeQuery();
    }
}
