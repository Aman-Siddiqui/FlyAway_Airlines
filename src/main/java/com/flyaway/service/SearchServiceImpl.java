package com.flyaway.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.flyaway.dao.SearchDao;
import com.flyaway.model.Flights;
import com.flyaway.model.Search;

public class SearchServiceImpl implements SearchService {

	@Autowired
	SearchDao searchDao;

	@Override
	public List<Flights> validateSearch(Search search) {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		if(search.getSource().equals("None") || search.getSource().isEmpty()){
			System.out.println("Please Enter the Source..");

		}

		if(search.getDestination().equals("None") || search.getDestination().isEmpty()){
			System.out.println("Please Enter the Destination..");

		}

		if(search.getJourneyDate()==null || search.getJourneyDate().isEmpty()){
			System.out.println("Please Select the Date..");

		}

		try {
			Date d = sdf.parse(search.getJourneyDate()); //.parse mean changing into date format

			Date today= new Date();

//			String todayS= sdf.format(today); // .format changing into string format

			if(d.before(today)) {
					System.out.println("Can not select past date");
			}
		} catch (ParseException e) {
			e.printStackTrace();
		}

		if(Integer.parseInt(search.getNumberOfSeats())>30) {
			System.out.println("Beyond Maximum Capacity!");

		}

		if(search.getNumberOfSeats()==null || search.getNumberOfSeats().isEmpty() ||
				search.getNumberOfSeats().equals("0")){
			System.out.println("Please select a seat..");

		}
		if(search.getSource().equals(search.getDestination())) {
			System.out.println("Source and Destination can not be same..");
		}

		@SuppressWarnings("unchecked")
		List<Flights> flightlist = searchDao.validateSearch(search);

		return flightlist;
	}

}
