package com.sk.reservation.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.sk.reservation.entities.Flight;
import com.sk.reservation.repos.FlightRepository;
import com.sk.reservation.util.FlightConstant;

@Controller
public class FlightController {

	@Autowired
	FlightRepository flightRepo;

	@RequestMapping(value = FlightConstant.FLIGHT_SEARCH_PATH, method = RequestMethod.POST)
	public String showFlights(@RequestParam("from") String from, @RequestParam("to") String to,
	                    @RequestParam("departureDate") @DateTimeFormat(pattern = "MM-dd-yyyy") Date departureDate,
	                    ModelMap map) {
		List<Flight> flights = flightRepo.findFlights(from, to, departureDate);
		map.addAttribute("flightsList", flights);
		return FlightConstant.FLIGHT_DISPLAY_FILE;
	}

}
