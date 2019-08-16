package suishen.kafka.producer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import suishen.kafka.producer.service.SenderService;

/**
 * @author liweiyuan
 * @description
 * @date 2019/8/16
 */
@RestController
public class ProducerController {

    @Autowired
    private SenderService senderService;

    @GetMapping("/sender")
    public void sender() {
        senderService.send();
    }
}
