package com.flyaway.dao;

import java.util.List;

import com.flyaway.model.Flights;
import com.flyaway.model.Search;

public interface SearchDao {
	
	public List<Flights> validateSearch(Search search);


}
