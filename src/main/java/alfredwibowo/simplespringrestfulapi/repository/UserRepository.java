package alfredwibowo.simplespringrestfulapi.repository;

import alfredwibowo.simplespringrestfulapi.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, String > {

    Optional<User> findFirstByToken(String token);
}
