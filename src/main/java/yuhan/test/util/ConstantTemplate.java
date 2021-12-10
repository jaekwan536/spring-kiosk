package yuhan.test.util;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class ConstantTemplate {
	public static JdbcTemplate template;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		
		ConstantTemplate.template = new JdbcTemplate(dataSource);
	}
}
