package doty.service.apis.dotybackendservice.repository;

import doty.service.apis.dotybackendservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {


    public User findUserByUserId(String userId);

}
