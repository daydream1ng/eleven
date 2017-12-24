package eleven.test.dao;

import eleven.test.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
public interface TestDao {
    Integer testQuery();

    List<User> testQueryUser(User param);
}
