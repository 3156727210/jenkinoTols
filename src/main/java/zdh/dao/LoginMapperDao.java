package zdh.dao;

import org.apache.ibatis.annotations.Param;
import zdh.entity.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginMapperDao {

    Login findLoginByName(@Param("username")String username, @Param("password")String password);
}
