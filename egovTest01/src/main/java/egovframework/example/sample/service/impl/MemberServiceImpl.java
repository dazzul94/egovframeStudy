package egovframework.example.sample.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.sample.dao.MemberDao;
import egovframework.example.sample.domain.Member;
import egovframework.example.sample.service.MemberService;

@Service("memberService")
public class MemberServiceImpl implements MemberService {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl.class);
    
    @Resource(name="memberMapper")
    private MemberDao memberDao;
    
    @Override
    public int add(Member member) {
        return memberDao.insert(member);
    }
    @Override
    public List<Member> list(int pageNo, int pageSize, Map<String, Object> options) {
        
        HashMap<String,Object> params = new HashMap<>();
        params.put("startIndex", (pageNo - 1) * pageSize);
        params.put("size", pageSize);
        
        if (options != null) {
            params.putAll(options);
        }
        
        return memberDao.findAll(params);
    }
    @Override
    public int getTotalCount(HashMap<String, Object> options) {
        return memberDao.countAll(options);
    }
    @Override
    public Member get(int no) {
        return memberDao.findByNo(no);
    }

    @Override
    public int update(Member member) {
        return memberDao.update(member);
    }

    /*@Override
    public int delete(int no) {
        return memberDao.delete(no);
    }*/
    @Override
    public int deleteAll(HashMap<String, Object> numbers) {
        return memberDao.deleteAll(numbers);
    }
    

}
