import URLShortner.URLShortnerService;
import org.junit.*;

import static org.junit.Assert.*;

public class URLShortnerTest {

    @Test
    public void shouldShortenGivenURLS(){
        URLShortnerService service = new URLShortnerService();

        String video1 = new String("https://www.youtube.com/watch?v=Kn-vuSUkcyQ");
        String video2 = new String("https://www.youtube.com/playlist?list=PLMCXHnjXnTnvo6alSjVkgxV-VH6EPyvoX");

        String short1 = service.shorten(video1);
        String short2 = service.shorten(video2);


        assertNotEquals(short1,short2);

        String expanded1 = service.expand(short1);
        String expanded2 = service.expand(short2);

        assertEquals(expanded1,video1);
        assertEquals(expanded2,video2);


    }
}
