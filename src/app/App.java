package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet addresses = DBManager.sendQuery(
            "SELECT * FROM `shipping_address` WHERE `user_id` = 3"
        );

        while (addresses.next()) {
            System.out.println(
                "Address #" + addresses.getString(1) +
                ": " + addresses.getString(2)
            );
        }
    }
}