package com.flyaway.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.flyaway.model.Flights;
import com.flyaway.model.Search;
import com.flyaway.service.SearchService;

@Controller
public class SearchController {
	
  @Autowired
  SearchService searchService;

  @RequestMapping(value = "/search", method = RequestMethod.GET)
	public ModelAndView searchFlight() {
		ModelAndView model = new ModelAndView();
		model.addObject("availableFlights", new Search());
		model.setViewName("search");

		return model;
	}
  
@RequestMapping(value = "/searchProcess", method = RequestMethod.POST)
	public ModelAndView addUser(@ModelAttribute Search search) {
	  

	  List<Flights> flightsList = searchService.validateSearch(search);
	  System.out.println("cont"+flightsList);
	  
	  ModelAndView model=null;
	  if(flightsList!=null) {
		  model.addObject("flightsList", flightsList);
		  model.setViewName("searchresult");
	  }else {
		  model.addObject("message", "No flight found :(");
		  model.setViewName("search");
	  }
	
		return model;
	}

  
  
  
}
