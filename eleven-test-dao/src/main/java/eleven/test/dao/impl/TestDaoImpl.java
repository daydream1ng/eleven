package eleven.test.dao.impl;

import eleven.test.dao.TestDao;
import eleven.test.domain.User;
import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
@Repository
public class TestDaoImpl implements TestDao {
    private final Logger LOG = LoggerFactory.getLogger(TestDaoImpl.class);

    @Autowired
    private SqlSessionTemplate sqlSession;

    public Integer testQuery() {
        return sqlSession.selectOne("Test.testQuery");
    }

    public List<User> testQueryUser(User param) {
        return sqlSession.selectList("Test.testQueryUser", param);
    }
}
