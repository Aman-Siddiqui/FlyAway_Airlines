package com.flyaway.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.flyaway.model.Flights;
import com.flyaway.model.Search;

public class SearchDaoImpl implements SearchDao {

	@Autowired
	DataSource datasource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public List<Flights> validateSearch(Search search) {

		List<Flights> flightsList = new ArrayList<Flights>();

		String sql = "select * from flight_master where source = ? and destination = ?;";  

		RowMapper<Flights> rowMapper = new  RowMapper<Flights>() {

			@Override
			public Flights mapRow(ResultSet rs, int rowNum) throws SQLException {

				Integer flightId = rs.getInt("flightId");
				String airlineName = rs.getString("airlineName");
				String departureTime = rs.getString("departureTime");
				String arrivalTime = rs.getString("arrivalTime");
				String destination = rs.getString("destination");
				String source = rs.getString("source");
				//String departureDate = rs.getString("departureDate");
				Double fare = Double.parseDouble(search.getNumberOfSeats())
						*rs.getDouble("fare");
				Integer availableSeat =rs.getInt("availableSeats");

				Flights flight = new Flights(flightId, airlineName, source, 
						departureTime, search.getJourneyDate(), 
						destination, arrivalTime, fare, availableSeat);

				flightsList.add(flight);

				return flight;
			}


		};
		  System.out.println("dao"+flightsList);

		return jdbcTemplate.query(sql, rowMapper, new Object[] {search.getSource(), search.getDestination()});
	}



}
