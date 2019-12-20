package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet order = DBManager.sendQuery(
            "SELECT * FROM `_order` ORDER BY `date` DESC LIMIT 1"
        );

        while (order.next()) {
            System.out.println(
                "Order #" + order.getString(1) +
                ": " + order.getString(2)
            );
        }
    }
}