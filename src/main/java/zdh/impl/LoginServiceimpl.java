package zdh.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import zdh.dao.LoginMapperDao;
import zdh.entity.Login;
import zdh.service.Logingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@Service
public class LoginServiceimpl implements Logingservice {

    @Autowired
    private LoginMapperDao mLoginMapperDao;


    @Override
    public void LoginUserPwd(HttpServletRequest request, HttpServletResponse response) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        Login mLogin  = mLoginMapperDao.findLoginByName(username,password);

        // 返回给前端

        ObjectMapper mapper = new ObjectMapper();
        try {

            response.getWriter().write(mapper.writeValueAsString(mLogin));
            response.getWriter().close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
