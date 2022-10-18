package com.swaggerdemo.request;

import lombok.Data;

import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
public class PassengerInfo {
    private String firstName;
    private String lastName;
    private String fromLocation;
    private String toLocation;
    private String flightTicketId;
    private String flightDate;
}
