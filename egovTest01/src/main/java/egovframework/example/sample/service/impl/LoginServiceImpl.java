package egovframework.example.sample.service.impl;

import java.util.HashMap;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import egovframework.example.sample.dao.LoginDao;
import egovframework.example.sample.domain.Login;
import egovframework.example.sample.service.LoginService;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    @Resource(name="loginMapper")
    private LoginDao loginDao;
    
    @Override
    public Login get(String id, String password) {
        HashMap<String,Object> params = new HashMap<>();
        params.put("id", id);
        params.put("password", password);
        
        return loginDao.findByEmailAndPassword(params);   
        }

}
