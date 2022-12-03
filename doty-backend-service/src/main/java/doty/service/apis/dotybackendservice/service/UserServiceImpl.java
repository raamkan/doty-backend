package doty.service.apis.dotybackendservice.service;

import doty.service.apis.dotybackendservice.model.User;
import doty.service.apis.dotybackendservice.repository.UserRepository;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> allUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserInfo(String userId)  {
        return userRepository.findUserByUserId(userId);
    }

    @Override
    public User userInfo(User user) {
        return userRepository.save(user);
    }
}
