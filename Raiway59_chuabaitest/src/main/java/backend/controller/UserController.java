package backend.controller;

import backend.service.IUserService;
import backend.service.UserServiceImpl;
import entity.Userss;

import java.sql.SQLException;
import java.util.List;

public class UserController {

    private IUserService userService = new UserServiceImpl();

    public List<Userss> getUserByProjectId(int projectId) throws SQLException {
        return userService.getUserByProjectId(projectId);
    }

    public List<Userss> getAllManager() throws SQLException {
        return userService.getAllManager();
    }

    public boolean login(String email, String password) throws SQLException {
        return userService.login(email, password);
    }

}
