package ProjectBackend.data.users;

import ProjectBackend.Model.users.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {
    List<User> findByUsername(String username);
}
