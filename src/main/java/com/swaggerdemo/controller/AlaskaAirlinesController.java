package com.swaggerdemo.controller;


import com.swaggerdemo.response.TicketInfo;
import com.swaggerdemo.service.AlaskaAirlinesService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import com.swaggerdemo.request.PassengerInfo;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.NoSuchElementException;

@RestController
@Api("Welcome Aboard, Thanks for choosing to fly with us today :)")
public class AlaskaAirlinesController {

    @Autowired
    AlaskaAirlinesService service;

    @ApiOperation("This is used to book a flight ticket..")
    @PostMapping(value = "/bookFlightTicket", consumes = {"application/json","application/xml"}, produces = {"application/json","application/xml"})
    public ResponseEntity<TicketInfo> bookTicket(@RequestBody PassengerInfo passengerInfo){
        try {
            TicketInfo ticket = service.bookTicket(passengerInfo);
            return new ResponseEntity<>(ticket, HttpStatus.CREATED);
        }catch (NoSuchElementException e){
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        }
    }
}

/*
    @PostMapping("/addPokemon")
    public ResponseEntity<Pokemon> addPokemon(@RequestBody Pokemon newPokemon){
         try {
             Pokemon pokemon = pokeService.addNewPokemon(newPokemon);
             return new ResponseEntity<Pokemon>(pokemon,HttpStatus.CREATED);
         } catch (NoSuchElementException e){
             return new ResponseEntity<>(HttpStatus.CONFLICT);
         }
    }


    public Pokemon addNewPokemon(Pokemon pokemon){
        pokemon.setPokemonId(getMaxId());
        repo.save(pokemon);
        return pokemon;
    }
 */