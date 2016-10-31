package rabbitmq.demo3;

import rabbitmq.demo2.Recv;
import rabbitmq.demo2.Send;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Nikolai Tarasevich
 */
public class Demo {

    public static void main(String args[]) throws Exception {
        String[] messages = {"First message.", "Second message.", "Third message.", "Fourth message.", "Fifth message."};
        ReceiveLogs.main(args);
        ReceiveLogs.main(args);
        for (String message : messages) {
            EmitLog.main(new String[]{message});
        }
    }
}
