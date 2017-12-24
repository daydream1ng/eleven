package eleven.test.service.impl;

import eleven.test.dao.TestDao;
import eleven.test.domain.User;
import eleven.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
@Service
public class TestServiceImpl implements TestService {
    private final Logger LOG = LoggerFactory.getLogger(TestServiceImpl.class);

    @Autowired
    private TestDao testDao;

    public Integer testQuery() {
        return testDao.testQuery();
    }

    public List<User> testQueryUser(User param) {
        return testDao.testQueryUser(param);
    }
}
