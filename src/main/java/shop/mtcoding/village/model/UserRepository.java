package shop.mtcoding.village.model;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User, Long>{
    
    // 복사한거임 수정필요
    @Query("select u from User u where u.username = :username")
    Optional<User> findbyUsername(@Param("username") String username);
}
