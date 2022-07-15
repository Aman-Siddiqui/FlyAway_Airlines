package com.flyaway.service;

import java.util.List;

import com.flyaway.model.Flights;
import com.flyaway.model.Search;

public interface SearchService {
	
	public List<Flights> validateSearch(Search search);

}
