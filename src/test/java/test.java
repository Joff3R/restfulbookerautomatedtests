import api.BookingApi;
import dto.Booking;
import dto.BookingDates;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

@Test
public class test {

    public static final Booking BOOKING = Booking.builder()
            .firstname("James")
            .lastname("Bond")
            .totalprice(1000)
            .depositpaid(true)
            .bookingdates(
                    BookingDates.builder()
                            .checkin("2020-01-01")
                            .checkout("2020-02-02")
                            .build()
            )
            .build();
    private final BookingApi bookingApi = new BookingApi();

    public void bla() {
        var item = bookingApi.getBookingById(1);
        System.out.println(item.getBookingdates().getCheckin());
    }

    public void alb() {
        var response = bookingApi.postBooking(BOOKING);
        assertThat(response.statusCode()).isEqualTo(200);
    }
}
