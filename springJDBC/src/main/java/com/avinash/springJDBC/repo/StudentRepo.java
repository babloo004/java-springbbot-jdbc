package com.avinash.springJDBC.repo;

import com.avinash.springJDBC.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    //JDBC Template object

    private JdbcTemplate jdbc;

    //setters

    //setJdbc
    @Autowired
    public void setJdbc(JdbcTemplate jdbc){
        this.jdbc = jdbc;
    }

    //getters

    //getJdbc
    public JdbcTemplate getJdbc(){
        return this.jdbc;
    }
    //methods

    //save
    public void save(Student s){

        //when we are using JDBC Template, there is no need to create a connection, statement etc
        //they all will be managed by the JDBC Template
        String sql = "insert into students values(?,?,?)";

        //we are using update method, which return "int" which indicates the number of rows effected
        int rowsEffected = jdbc.update(sql,s.getRoll(),s.getName(),s.getMarks());
        System.out.println(rowsEffected+" effected!");
    }

//    findAll
    public List<Student> findAll(){
        //we will use jdbc.query() method to return all the rows in the table
        //query() method accepts two parameters, 1. sql 2. RowMapper object
        //RowMapper is a functional interface, which is having mapRow() method
        //mapRow() method accepts ResultSet as parameter and returns us the single row from table

        String sql = "select * from students";

        RowMapper<Student> mapper = new RowMapper<Student>() {
            @Override
            public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
                Student s = new Student();
                s.setRoll(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setMarks(rs.getInt(3));
                return s;
            }
        };

        //query() returns the List of  Wrapper class objects
        return jdbc.query(sql,mapper);
    }
}
