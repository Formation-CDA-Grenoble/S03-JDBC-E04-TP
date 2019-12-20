package app;

import java.sql.*;

class Order {
    public int id;
    public String reference;
    public Date date;
    public int status;

    static public Order find(int id) throws SQLException {
        ResultSet resultSet = DBManager.sendQuery(
            "SELECT * FROM `_order` WHERE `id` = " + id
        );

        resultSet.next();

        return new Order(
            resultSet.getInt(1),
            resultSet.getString(2),
            resultSet.getDate(3),
            resultSet.getInt(4)
        );
    }

    Order(int id, String reference, Date date, int status) {
        this.id = id;
        this.reference = reference;
        this.date = date;
        this.status = status;
    }
}