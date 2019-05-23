package zdh.service;

import com.fasterxml.jackson.core.JsonProcessingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface Logingservice  {

    // 登陆方法
    void LoginUserPwd(HttpServletRequest request, HttpServletResponse response) ;
}
