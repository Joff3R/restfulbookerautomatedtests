package dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import static lombok.AccessLevel.PRIVATE;


@Getter
@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor
@Builder
public class BookingDates {

    private String checkin;
    private String checkout;
}
