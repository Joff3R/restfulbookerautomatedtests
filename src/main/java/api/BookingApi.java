package api;

import dto.BookingId;
import io.restassured.response.Response;

import java.util.List;

import static common.UrlHelper.BOOKING_IDS;

public class BookingApi {

    public List<BookingId> getBookingIdsResponse() {
        var request = new AuthenticationApi().authenticatedRequest();
        return List.of(request
                .get(BOOKING_IDS)
                .getBody()
                .as(BookingId[].class));
    }


//    public Response getBookingIds() {
//        getBookingIdsResponse()
//                .
//    }


}
