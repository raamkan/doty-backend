package doty.service.apis.dotybackendservice.service;

import doty.service.apis.dotybackendservice.model.User;
import org.springframework.data.crossstore.ChangeSetPersister;

import java.util.List;

public interface UserService {

    public List<User> allUsers();

    public User getUserInfo(String userId);

    public User userInfo(User user);
}
