package suishen.kafka.producer.service;

import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;

/**
 * @author liweiyuan
 * @description
 * @date 2019/8/16
 */
@Service
public class SenderService {


    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;


    public void send() {
        ListenableFuture<SendResult<String, String>> future = kafkaTemplate.send("hello", "hello");

        future.addCallback(new ListenableFutureCallback<SendResult<String,String>>(){

            @Override
            public void onSuccess(SendResult<String, String> stringStringSendResult) {
                RecordMetadata recordMetadata = stringStringSendResult.getRecordMetadata();

                System.out.println(recordMetadata.toString());
            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });


    }
}
