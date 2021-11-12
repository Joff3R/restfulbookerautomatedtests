package api;

import dto.Booking;
import dto.BookingId;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.List;

import static common.UrlHelper.BOOKING;

public class BookingApi {

    public List<BookingId> getBookingIds() {
        return List.of(RestAssured.given()
                .get(BOOKING)
                .getBody()
                .as(BookingId[].class));
    }

    public Booking getBookingById(int id) {
        return RestAssured.given()
                .get(BOOKING + id)
                .getBody()
                .as(Booking.class);
    }

    public Response postBooking(Booking booking){
        return RestAssured.given()
                .headers("Content-Type", ContentType.JSON,
                        "Accept", ContentType.JSON)
                .body(booking)
                .post(BOOKING);

    }
}
