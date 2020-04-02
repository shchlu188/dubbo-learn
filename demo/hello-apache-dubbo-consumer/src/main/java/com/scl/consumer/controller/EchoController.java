package com.scl.consumer.controller;

import com.scl.service.EchoService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 *
 * @version v1.0.0
 * Description:
 * @package: com.scl.consumer.controller
 * @author: chenglu
 * @create: 2020/4/2
 */
@RestController
public class EchoController {
    @Reference(version = "1.0.0")
    private EchoService echoService;
    @GetMapping("/consumer/{str}")
    public String echo(@PathVariable("str") String msg){

        return echoService.echo(msg);

    }
}
