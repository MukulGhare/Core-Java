import RateLimiter.RateLimiterService;
import org.junit.Test;
import static org.junit.Assert.*;

public class RateLimiterTest {

    @Test
    public void shouldAllowRequestsUptoLimit(){
        RateLimiterService service = new RateLimiterService(5);
        int userID = 101;

        for (int i=0; i<5;i++){
            assertTrue("Should allow request no " + 1,service.allowRequest(userID));
        }

    }


    @Test
    public void shouldRejectRequestWhenLimitExceeded(){
        RateLimiterService service = new RateLimiterService(5);
        int userID = 101;

        for (int i=0; i<5;i++){
            assertTrue(service.allowRequest(userID));
        }

        assertFalse("6th request not allowed",service.allowRequest(userID));
    }
}
