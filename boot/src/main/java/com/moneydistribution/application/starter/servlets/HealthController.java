package com.moneydistribution.application.starter.servlets;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.springframework.stereotype.Component;

/**
 * Created by Vlad on 02.12.2016.
 */
@Component
@Path("/health")
public class HealthController {
	@GET
	@Produces("application/json")
	public Health health() {
		return new Health("Jersey: Up and Running!");
	}

	private class Health {
		private final String status;

		private Health(String status) {
			this.status = status;
		}

		public String getStatus() {
			return status;
		}
	}
}