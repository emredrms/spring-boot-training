package com.in28minutes.spring.basics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {

	@Autowired
	ComponenetJdbcConnection jdbcConnection;

	public ComponenetJdbcConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void ComponenetJdbcConnection(ComponenetJdbcConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
	}
	
	
}
