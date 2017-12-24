package eleven.test.service;

import eleven.test.domain.User;

import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
public interface TestService {
    Integer testQuery();

    List<User> testQueryUser(User param);
}
