package app;

import java.sql.*;

class User {
    public int id;
    public String email;
    public String password;
    public String username;

    static public User find(int id) throws SQLException {
        ResultSet resultSet = DBManager.sendQuery(
            "SELECT * FROM `user` WHERE `id` = " + id
        );

        resultSet.last();
        if (resultSet.getRow() == 0) {
            throw new RuntimeException("Id " + id + " doesn't exist in table `user`");
        }

        resultSet.first();

        return new User(
            resultSet.getInt(1),
            resultSet.getString(2),
            resultSet.getString(3),
            resultSet.getString(4)
        );
    }

    User(int id, String email, String password, String username) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.username = username;
    }

    public void inspect() {
        System.out.println("User Object");
        System.out.println("id: " + id);
        System.out.println("email: " + email);
        System.out.println("password: " + password);
        System.out.println("username: " + username);
    }
}