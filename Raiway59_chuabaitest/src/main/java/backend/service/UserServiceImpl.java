package backend.service;

import backend.repository.UserReprositoryImpl;
import entity.Userss;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements IUserService{
    private UserReprositoryImpl userReprository = new UserReprositoryImpl();



    @Override
    public List<Userss> getUserByProjectId(int projectId) throws SQLException {
        return userReprository.getUserByProjectId(projectId);
    }

    @Override
    public List<Userss> getAllManager() throws SQLException {
        return userReprository.getAllManager();
    }

    @Override
    public boolean login(String email, String password) throws SQLException {
        return userReprository.login(email, password);
    }
}
