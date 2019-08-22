package suishen.kafka.consumer.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author liweiyuan
 * @description
 * @date 2019/8/16
 */
@Component
public class ConsumerListener {

    @KafkaListener(topics = "hello", containerFactory = "containerFactory")
    public void listen(ConsumerRecord<?, ?> records, Acknowledgment ack) {
        String value = (String) records.value();

        System.err.println(value);
        ack.acknowledge();
    }
}
