package com.scl.service;

import org.apache.dubbo.config.annotation.Service;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * Description:
 * @package: com.scl.service
 * @author: chenglu
 * @create: 2020/4/2
 */
@Service(version = "1.0.0")
public class EchoServiceImpl implements EchoService  {
    /**
     * 测试方法
     *
     * @param string
     * @return
     */
    @Override
    public String echo(String string) {

        return "hello dubbo:"+string;
    }
}
