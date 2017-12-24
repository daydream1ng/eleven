package eleven.test.web.controller;

import eleven.test.domain.Result;
import eleven.test.domain.User;
import eleven.test.service.TestService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * Created by Administrator on 2017/12/24.
 */
@Controller
public class TestController {
    private final Logger LOG = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TestService testService;

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    @ResponseBody
    public Result test(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        result.setSuccess(true);
        return result;
    }

    @RequestMapping(value = "/testQuery",method = RequestMethod.GET)
    @ResponseBody
    public Result testQuery(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        Integer count = testService.testQuery();
        result.setData(count);
        result.setSuccess(true);
        return result;
    }

    @RequestMapping(value = "/testQueryUser",method = RequestMethod.GET)
    @ResponseBody
    public Result testQueryUser(HttpServletRequest request, HttpServletResponse response) {
        Result result = new Result();
        User param = new User();
        param.setId(2L);
        List<User> users = testService.testQueryUser(param);
        result.setData(users);
        result.setSuccess(true);
        return result;
    }
}
