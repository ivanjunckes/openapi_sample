package com.sample.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;

@OpenAPIDefinition(info = @Info(title = "OpenAPI Sample Project", version = "1.0"),
        security = @SecurityRequirement(name = "oauth2"),
        servers = @Server(url = "/openapi-sample"))
@ApplicationPath("/api")
public class ApplicationConfig {
}
