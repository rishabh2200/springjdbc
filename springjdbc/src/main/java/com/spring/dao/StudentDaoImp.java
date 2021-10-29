package com.spring.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.entity.Student;

public class StudentDaoImp implements StudentDao{
	private JdbcTemplate jdbcTemplate;
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public int insert(Student st) {
		JdbcTemplate template = jdbcTemplate;
		String query = "insert into springjdbc(id,studentName,studentAddress) values(?,?,?)";
		int result =template.update(query,st.getId(),st.getStudentName(),st.getStudentName());
		return result;
	}
}
