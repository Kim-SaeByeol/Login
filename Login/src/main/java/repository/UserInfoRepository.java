package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import repository.entity.UserInfoEntity;

import java.util.Optional;

@Repository
public interface UserInfoRepository extends JpaRepository<UserInfoEntity, String> {


        //아이디 찾기
        Optional<UserInfoEntity> findByUserId(String userId);

        Optional<UserInfoEntity> findByEmail(String email);
        // 이메일 찾기

        Optional<UserInfoEntity> findByNickname(String nick);
        //별명 찾기


        // 아이디와 비밀번호 찾기
        Optional<UserInfoEntity> findByUserIdAndPassword(String userId, String password);

}
