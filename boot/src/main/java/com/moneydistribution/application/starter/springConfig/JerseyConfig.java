package com.moneydistribution.application.starter.springConfig;

import javax.ws.rs.ApplicationPath;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

import com.moneydistribution.application.starter.servlets.HealthController;

/**
 * Created by Vlad on 02.12.2016.
 */
@Component
@ApplicationPath("/jersey")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(HealthController.class);
	}

}
