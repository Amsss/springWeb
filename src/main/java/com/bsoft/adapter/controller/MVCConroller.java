package com.bsoft.adapter.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


/**
 * @author zhuzz
 * @类功能说明:
 * @创建时间:2018-2-25 上午9:15:12
 */
@Controller
public class MVCConroller {
    private static final Log LOGGER = LogFactory.getLog(MVCConroller.class);

    @Resource
    private SayHello acc;

    @RequestMapping(value = "/xmlOrJson", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> xmlOrJson() {
        /*try {
            String resource = "org/mybatis/example/mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        acc.sayHello();
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("list", new String("1111"));
        return map;
    }
}
