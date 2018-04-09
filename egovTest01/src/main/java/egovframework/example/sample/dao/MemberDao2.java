package egovframework.example.sample.dao;

import java.util.HashMap;

import java.util.List;
import java.util.Map;

import egovframework.example.sample.domain.Member;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper("memberMapper2")
public interface MemberDao2 {
//참고 src77
    int insert(Member member);
   /* List<Member> findAll(Map<String,Object> params);
    int countAll(HashMap<String, Object> options);
    Member findByNo(int no);
    int update(Member member);
//    int delete(int no);
    int deleteAll(HashMap<String, Object> numbers);*/
}
