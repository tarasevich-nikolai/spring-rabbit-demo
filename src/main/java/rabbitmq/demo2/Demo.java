package rabbitmq.demo2;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * @author Nikolai Tarasevich
 */
public class Demo {

    public static void main(String args[]) throws IOException, TimeoutException {
        String[] messages = {"First message.", "Second message.", "Third message.", "Fourth message.", "Fifth message."};
        for (String message : messages) {
            Send.main(new String[]{message});
        }
        //Recv.main(args);
    }
}
