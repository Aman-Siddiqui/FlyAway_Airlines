package com.flyaway.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.flyaway.model.Admin;

public class AdminDaoImpl implements AdminDao{

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Autowired
	DataSource dataSource;

	@Override
	public Admin validateAdmin(Admin login) {
		String sql = "select * from admin_master where username = ? and password = ?;";
		Admin admin = jdbcTemplate.queryForObject(sql, new AdminMapper(),login.getUsername(), login.getPassword());

		return admin;
	}

	@Override
	public int UpdatePassword(Admin update) {

		String sql = "update admin_master set password = ? where username = ?;";

		return jdbcTemplate.update(sql, update.getNewpassword(), update.getUsername());
	}

}

class AdminMapper implements RowMapper<Admin> {

	public Admin mapRow(ResultSet rs, int arg1) throws SQLException {
		Admin admin = new Admin();

		admin.setUsername(rs.getString("username"));
		admin.setPassword(rs.getString("password"));

		return admin;
	}
}
