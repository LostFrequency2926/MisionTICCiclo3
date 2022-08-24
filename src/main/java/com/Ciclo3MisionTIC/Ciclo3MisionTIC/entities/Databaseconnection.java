package com.Ciclo3MisionTIC.Ciclo3MisionTIC.entities;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Databaseconnection {

    public static void main(String args[]) {
        Connection c = null;
        Statement stmt = null;

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dtf.format(LocalDateTime.now()));

        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://db.onrbanpvjewudjphemvw.supabase.co:5432/postgres",
                            "postgres", "Znj1m2926+--92v4a342%&");
            c.setAutoCommit(false);
            System.out.println("Opened database successfully");

            String test = "2022/08/23 22:21:02";
 /*
            stmt = c.createStatement();
            String sql = "SELECT table_name FROM information_schema.tables WHERE table_schema='public' AND table_type='BASE TABLE'";

            test = String.valueOf(stmt.executeUpdate(sql));

            System.out.println(test);

  */


            stmt = c.createStatement();
            String sql = "INSERT INTO Profile FROM information_schema.tables WHERE table_schema='public' AND table_type='BASE TABLE'(id,image,phone,users, createdAt, updatedAt) "
                    + "VALUES ('1', 'imagen perfil 1', '5537866', 'enterprise', test, test );";
            stmt.executeUpdate(sql);

/*
            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (2, 'Allen', 25, 'Texas', 15000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (3, 'Teddy', 23, 'Norway', 20000.00 );";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) "
                    + "VALUES (4, 'Mark', 25, 'Rich-Mond ', 65000.00 );";
            stmt.executeUpdate(sql);

            stmt.close();
            c.commit();
            c.close();

             */

        } catch (Exception e) {
            System.err.println( e.getClass().getName()+": "+ e.getMessage() );
            System.exit(0);
        }
        System.out.println("Records created successfully");
    }

}
