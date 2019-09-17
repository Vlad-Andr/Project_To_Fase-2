package cursor.edu.p2.repo;

import cursor.edu.p2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
}
