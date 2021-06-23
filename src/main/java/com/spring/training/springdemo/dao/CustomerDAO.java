package com.spring.training.springdemo.dao;

import com.spring.training.springdemo.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Component
public class CustomerDAO {


    @Autowired
    JdbcTemplate jdbcTemplate;


    public List<Customer> getCustomers() throws Exception {


//
//        jdbcTemplate.execute("Select * from customer", new PreparedStatementCallback<Customer>() {
//
//
//            @Override
//            public Customer doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
//                return null;
//            }
//        });


        List<Customer> customers = jdbcTemplate.query("Select * from customer", (rs, rowNumber) -> {


            int id = rs.getInt("id");
            String name = rs.getString("name");
            String address = rs.getString("address");
            return new Customer(id, name, address);

        });

        return customers;




//
////        Connection con = DriverManager
////                .getConnection("jdbc:mysql://localhost:3306/training",
////                        "root", "rps@12345");
//
//        Statement stmt = con.createStatement();
//
//        ResultSet rs = stmt.executeQuery("Select * from Customer");
//
//        List<Customer> customers = new ArrayList<>();
//        while (rs.next()) {
//
//            int id = rs.getInt("id");
//            String name = rs.getString("name");
//            String address = rs.getString("address");
//
//            Customer customer = new Customer(id, name, address);
//            customers.add(customer);
//
//        }
//
//        return customers;


    }
}
