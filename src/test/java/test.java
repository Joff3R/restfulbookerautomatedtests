import api.BookingApi;
import org.testng.annotations.Test;

import static api.AuthenticationApi.*;
import static org.assertj.core.api.Assertions.assertThat;

@Test
public class test {

    private final BookingApi bookingApi = new BookingApi();

    public void bla(){
        var list = bookingApi.getBookingIds();
        list.stream()
                .map(e -> e.getBookingid())
                .forEach(System.out::println);

//        var item = bookingApi.getBookingById(4);
//        System.out.println(item);
    }

    public void alb(){
        String token = getToken();
        System.out.println(token);
    }
}
