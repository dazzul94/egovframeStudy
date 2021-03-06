package egovframework.example.sample.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import egovframework.example.sample.domain.Member;

public interface MemberService {
    int add(Member member);
    List<Member> list(int pageNo, int pageSize, Map<String,Object> options);
    int getTotalCount(HashMap<String, Object> options);
    Member get(int no);
    int update(Member member);
//    int delete(int no);
    int deleteAll(HashMap<String, Object> numbers);
}
