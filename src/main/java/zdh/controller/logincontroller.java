package zdh.controller;

import com.fasterxml.jackson.core.JsonProcessingException;

import zdh.service.Logingservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping(value = "/user")
public class logincontroller {
    @Autowired
  private Logingservice mLoginService;
    @RequestMapping(value = "login",method = RequestMethod.POST)
    public void LoginUserPwd(HttpServletRequest request, HttpServletResponse response)  {



        mLoginService.LoginUserPwd(request,response);

    }

}
