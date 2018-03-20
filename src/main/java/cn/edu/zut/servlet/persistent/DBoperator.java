package cn.edu.zut.servlet.persistent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBoperator {

    public void insert(String name){
        final String DRIVER ="com.mysql.jdbc.Driver";
        final String USER = "root";
        final String PWD ="980930";
        final String URL ="jdbc:mysql://localhost:3306/javaee";
        Connection connection;

            try {
                Class.forName(DRIVER);

                connection=DriverManager.getConnection(URL,USER,PWD);
                Statement statement =connection.createStatement();
                String sql ="insert into book (name) value('"+ name + "');";
                statement.executeUpdate(sql);
                connection.close();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

        }


