package com.swaggerdemo.service;

import com.swaggerdemo.request.PassengerInfo;
import com.swaggerdemo.response.TicketInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class AlaskaAirlinesService {
    TicketInfo ticket = new TicketInfo();
    public TicketInfo bookTicket(PassengerInfo passengerInfo) {

        ticket.setPassengerName(passengerInfo.getFirstName() + " " + passengerInfo.getLastName());
        ticket.setFromLocation(passengerInfo.getFromLocation());
        ticket.setToLocation(passengerInfo.getToLocation());
        ticket.setTicketStatus("CONFIRMED");
        ticket.setTicketPrice("$450.0 USD");
        ticket.setFlightDate(passengerInfo.getFlightDate());

        return ticket;
    }
}
