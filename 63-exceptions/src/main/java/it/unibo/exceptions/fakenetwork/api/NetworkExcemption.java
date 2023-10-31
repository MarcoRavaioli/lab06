package main.java.it.unibo.exceptions.fakenetwork.api;

import java.io.IOException;
import java.util.Objects;

/**
 * Marks a network error
 */
public class NetworkExcemption extends IOException {

    private static final long serialVersionUID = 1L;

    /**
     * COnstructor to be used when is a failure when sending message.
     * 
     * @param messageBeingSent the message being sent
     */
    public NetworkExcemption(final String messageBeingSent) {
        super("Network error while sending message " + messageBeingSent);
        Object.requireNonNull(messageBeingSent);
    }
    
    /**
     * 
     */
    public NetworkExcemption() {
        super("Network error: no response");
    }
}
