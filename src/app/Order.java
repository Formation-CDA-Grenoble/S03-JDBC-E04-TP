package app;

import java.sql.*;

class Order {
    public int id;
    public String reference;
    public Date date;
    public int status;
    public int userId;

    static public Order find(int id) throws SQLException {
        ResultSet resultSet = DBManager.sendQuery(
            "SELECT * FROM `_order` WHERE `id` = " + id
        );

        resultSet.last();
        if (resultSet.getRow() == 0) {
            throw new RuntimeException("Id " + id + " doesn't exist in table `_order`");
        }

        resultSet.first();

        return new Order(
            resultSet.getInt(1),
            resultSet.getString(2),
            resultSet.getDate(3),
            resultSet.getInt(4),
            resultSet.getInt(5)
        );
    }

    Order(int id, String reference, Date date, int status, int userId) {
        this.id = id;
        this.reference = reference;
        this.date = date;
        this.status = status;
        this.userId = userId;
    }

    public User getUser() throws SQLException {
        return User.find(userId);
    }

    public void inspect() {
        System.out.println("Order Object");
        System.out.println("id: " + id);
        System.out.println("reference: " + reference);
        System.out.println("date: " + date);
        System.out.println("status: " + status);
    }
}