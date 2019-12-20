package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        ResultSet products = DBManager.sendQuery(
            "SELECT COUNT(`id`) FROM `product` WHERE `brand_id` = 1"
        );

        while (products.next()) {
            System.out.println(products.getInt(1));
        }
    }
}