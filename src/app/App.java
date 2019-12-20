package app;

import java.sql.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        User myUser = User.find(4);
        myUser.inspect();

        //Order myOrder = Order.find(2);
        //myOrder.inspect();
        //myOrder.getUser().inspect();
    }
}