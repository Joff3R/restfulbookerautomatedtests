package api;

import dto.Booking;
import dto.BookingId;
import io.restassured.RestAssured;

import java.util.List;

import static common.UrlHelper.BOOKING_IDS;

public class BookingApi {

    public List<BookingId> getBookingIds() {
        return List.of(RestAssured.given()
                .get(BOOKING_IDS)
                .getBody()
                .as(BookingId[].class));
    }

    public Booking getBookingById(int id) {
        return RestAssured.given()
                .get(BOOKING_IDS + id)
                .getBody()
                .as(Booking.class);
    }
}
