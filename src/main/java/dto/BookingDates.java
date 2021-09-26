package dto;

import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
public class BookingDates {

    private LocalDateTime checkin;
    private LocalDateTime checkout;
}
