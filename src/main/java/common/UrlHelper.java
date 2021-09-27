package common;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public class UrlHelper {

    public static final String BASE_URL = "https://restful-booker.herokuapp.com/";
    public static final String AUTH = BASE_URL + "auth";
    public static final String BOOKING_IDS = BASE_URL + "booking/";
}
