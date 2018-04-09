package egovframework.example.sample.dao;

import java.util.Map;

import egovframework.example.sample.domain.Login;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("loginMapper")
public interface LoginDao {
//참고 src77
    Login findByEmailAndPassword(Map<String,Object> params);
}
