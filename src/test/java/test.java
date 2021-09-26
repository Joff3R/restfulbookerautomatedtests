import api.AuthenticationApi;
import api.BookingApi;
import common.UrlHelper;
import org.testng.annotations.Test;

import static common.UrlHelper.BOOKING_IDS;

@Test
public class test {

    private final BookingApi bookingApi = new BookingApi();

    public void bla(){


        var list = bookingApi.getBookingIdsResponse();
//        list.forEach(System.out::println);




    }
}
