package com.xworkz.wildlife.repository;

import com.xworkz.wildlife.dto.AnimalDetails;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AnimalsRepository implements WildlifeRepository{
    @Override
    public void insertData(String name,int age,int weight) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn=null;
        PreparedStatement pst=null;

        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wildlife","root","San@23022001");
            System.out.println("connection success!");
           pst= conn.prepareStatement("insert into animal(name,age,weight) values(?,?,?);");
           pst.setString(1,name);
           pst.setInt(2,age);
           pst.setInt(3,weight);
           pst.execute();
            System.out.println("data inserted success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                    System.out.println("statement closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public void updateAgeByName(String name, int age) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn=null;
        PreparedStatement pst=null;

        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wildlife","root","San@23022001");
            System.out.println("connection success!");
            pst= conn.prepareStatement("update animal set age=? where name=?;");
            pst.setInt(1,age);
            pst.setString(2,name);
            pst.execute();
            System.out.println("data updated success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                    System.out.println("statement closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public  void deleteByName(String name) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn=null;
        PreparedStatement pst=null;

        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wildlife","root","San@23022001");
            System.out.println("connection success!");
            pst= conn.prepareStatement("delete from animal  where name=?;");
            pst.setString(1,name);
           pst.execute();
           System.out.println("data deleted  success!");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                    System.out.println("statement closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public List<AnimalDetails> getAllDetails() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn=null;
        PreparedStatement pst=null;

        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wildlife","root","San@23022001");
            System.out.println("connection success!");
            pst= conn.prepareStatement("select* from animal;");
            ResultSet rs=pst.executeQuery();
            List<AnimalDetails> list=new ArrayList<>();
            while (rs.next()){
                AnimalDetails animalDetails=new AnimalDetails();
                animalDetails.setId(rs.getInt(1));
                animalDetails.setName(rs.getString(2));
                animalDetails.setAge(rs.getInt(3));
                animalDetails.setWeight(rs.getInt(4));
                list.add(animalDetails);
            }
            System.out.println("data fetched  success!");
            return list;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                    System.out.println("statement closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    @Override
    public AnimalDetails getDetailsByName(String name) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("class loaded!");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Connection conn=null;
        PreparedStatement pst=null;

        try {
            conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/wildlife","root","San@23022001");
            System.out.println("connection success!");
            pst= conn.prepareStatement("select* from animal where name=?;");
            pst.setString(1,name);
            ResultSet rs=pst.executeQuery();
            AnimalDetails animalDetails=new AnimalDetails();
            if (rs.next()){
                animalDetails.setId(rs.getInt(1));
                animalDetails.setName(rs.getString(2));
                animalDetails.setAge(rs.getInt(3));
                animalDetails.setWeight(rs.getInt(4));
            }
            System.out.println("data fetched  success!");
           return animalDetails;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("connection closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
            if (pst!=null){
                try {
                    pst.close();
                    System.out.println("statement closed!");
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }
        }

    }
}
