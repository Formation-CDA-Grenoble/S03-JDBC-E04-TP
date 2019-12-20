package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet orders = DBManager.sendQuery(
            "SELECT * FROM `_order` WHERE `user_id` = 5"
        );

        while (orders.next()) {
            System.out.println(
                "Order #" + orders.getString(1) +
                ": " + orders.getString(2)
            );
        }
    }
}