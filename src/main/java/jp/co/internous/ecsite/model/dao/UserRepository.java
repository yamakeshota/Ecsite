package jp.co.internous.ecsite.model.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import jp.co.internous.ecsite.model.entity.User;
public interface UserRepository extends JpaRepository<User, Long> {
List<User> findByUserNameAndPassword(String userName, String password);
// usernameを探すために追加
@Query(value="SELECT count(id) FROM user WHERE user_name = :userName",
		nativeQuery=true)
int findCountByUserName(@Param("userName") String userName);

@Query(value="INSERT INTO user (user_name, password, full_name) VALUES (?1, ?2, ?3)", nativeQuery=true)

@Transactional
@Modifying
int persist(@Param("userName") String userName,
			@Param("password") String password,
			@Param("fullName") String fullName);
}
