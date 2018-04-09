package egovframework.example.sample.service.impl;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import egovframework.example.sample.dao.MemberDao2;
import egovframework.example.sample.domain.Member;
import egovframework.example.sample.service.MemberService2;

@Service("memberService2")
public class MemberServiceImpl2 implements MemberService2 {
    private static final Logger LOGGER = LoggerFactory.getLogger(MemberServiceImpl2.class);
    
    @Resource(name="memberMapper2")
    private MemberDao2 memberDao;
    
    @Override
    public int add(Member member) {
        return memberDao.insert(member);
    }
    /*@Override
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

    @Override
    public int delete(int no) {
        return memberDao.delete(no);
    }
    @Override
    public int deleteAll(HashMap<String, Object> numbers) {
        return memberDao.deleteAll(numbers);
    }*/
    

}
