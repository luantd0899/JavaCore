package backend.repository;

import entity.Roles;
import entity.Userss;
import util.JDBCUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserReprositoryImpl{


    public List<Userss> getUserByProjectId(int projectId) throws SQLException {
        Connection connection = JDBCUtil.getConnect();

        List<Userss> userssList = new ArrayList<>();

        String sql = "SELECT * FROM `userss` WHERE projectId = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setInt(1, projectId);

        ResultSet rs = preparedStatement.executeQuery();

        while (rs.next()){
            Userss userss = new Userss();
            userss.setId(rs.getInt("id"));
            userss.setEmail(rs.getString("email"));
            userss.setFullName(rs.getString("fullName"));

            String role = rs.getString("role");
            if (role.toUpperCase().equals(Roles.EMPLOYEE.toString())){
                userss.setRole(Roles.EMPLOYEE);
            }else {
                userss.setRole(Roles.MANAGER);
            }
            userssList.add(userss);
        }
        JDBCUtil.closeConnection();

        return userssList;
    }

    public List<Userss> getAllManager() throws SQLException {
        Connection connection = JDBCUtil.getConnect();

        List<Userss> userssList = new ArrayList<>();

        String sql = "SELECT * FROM `userss` WHERE `role` = 'MANAGER'";

        Statement statement = connection.createStatement();

        ResultSet rs = statement.executeQuery(sql);
        while (rs.next()){
            Userss userss = new Userss();
            userss.setId(rs.getInt("id"));
            userss.setEmail(rs.getString("email"));
            userss.setFullName(rs.getString("fullName"));
            userss.setRole(Roles.MANAGER);
            userssList.add(userss);
        }

        JDBCUtil.closeConnection();

        return userssList;
    }

    public boolean login(String email, String password) throws SQLException {
        Connection connection = JDBCUtil.getConnect();

        String sql = "SELECT * FROM `userss` WHERE email = ? AND `password` = ?";

        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1, email);
        preparedStatement.setString(2, password);

        ResultSet rs = preparedStatement.executeQuery();
        if (rs.next()){
            JDBCUtil.closeConnection();
            return true;
        }
        JDBCUtil.closeConnection();
        return false;
    }


}
