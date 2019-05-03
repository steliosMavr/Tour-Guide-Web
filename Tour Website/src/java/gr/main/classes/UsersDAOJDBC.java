package gr.database.classes;

import gr.database.interfaces.Users;
import gr.databaseConfig.classes.DataAccessObject;
import gr.javabeans.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UsersDAOJDBC extends DataAccessObject implements Users {

    private static String INSERT = "INSERT INTO users(username,lastname,email,password) VALUES (?,?,?,?)";

    private Connection conn;
    private PreparedStatement statement;

    @Override
    public void userSave(User user) {

        try {
            conn = getConnection();
            statement = conn.prepareStatement(INSERT);

            statement.setString(1, user.getName());
            statement.setString(2, user.getLastName());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getPassword());
            statement.executeUpdate();
            statement.close();
            conn.close();

        } catch (SQLException ex) {
            Logger.getLogger(UsersDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public boolean authentication(String email, String password) {

        conn = getConnection();
        try {

            statement = conn.prepareStatement("SELECT email,password FROM users");

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {

                if (email.equals(rs.getString("email")) && password.equals(rs.getString("password"))) {
                    return true;
                }

            }

        } catch (SQLException ex) {
            Logger.getLogger(UsersDAOJDBC.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;

    }

}
