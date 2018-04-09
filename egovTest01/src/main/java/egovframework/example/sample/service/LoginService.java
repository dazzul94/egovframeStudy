package egovframework.example.sample.service;

import egovframework.example.sample.domain.Login;

public interface LoginService {
    Login get(String email, String password);  
}
