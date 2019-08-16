package suishen.kafka.consumer.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author liweiyuan
 * @description
 * @date 2019/8/16
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "hello")
    public void onMessage(String message) {
        System.out.println(message);
    }
}
