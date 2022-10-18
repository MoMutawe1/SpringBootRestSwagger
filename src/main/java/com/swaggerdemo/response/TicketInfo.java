package com.swaggerdemo.response;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class TicketInfo {
    private String passengerName;
    private String fromLocation;
    private String toLocation;
    private String flightTicketId;
    private String flightDate;
    private String ticketPrice;
    private String ticketStatus;
}
