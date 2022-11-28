package backend.service;

import entity.Userss;

import java.sql.SQLException;
import java.util.List;

public interface IUserService {

    List<Userss> getUserByProjectId(int projectId) throws SQLException;

    List<Userss> getAllManager() throws SQLException;

    boolean login(String email, String password) throws SQLException;

}
