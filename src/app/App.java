package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet brands = DBManager.sendQuery(
            "SELECT * FROM `brand`"
        );

        while (brands.next()) {
            System.out.println(
                "Brand #" + brands.getString(1) +
                ": " + brands.getString(2)
            );
        }
    }
}