package com.microsg2.microsg2gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

	@Bean
	public RouteLocator gatewayRoutes(RouteLocatorBuilder builder) {

		return builder.routes()
				.route(r -> r.path("/author/**")
						.uri("lb://authorapi"))
				.route(r -> r.path("/category/**")
						.uri("lb://categoryapi"))
				.route(r -> r.path("/article/**")
						.uri("lb://articleapi"))
				.route(r -> r.path("/comment/**")
						.uri("lb://commentapi"))
				.build();
	}
}
