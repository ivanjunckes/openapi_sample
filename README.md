# Sample project for TOMEE-2502

## OpenAPI document is not showing configuration of @OpenAPIDefinition in ApplicationConfig.java

```
package com.sample.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.security.SecurityRequirement;
import org.eclipse.microprofile.openapi.annotations.servers.Server;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@OpenAPIDefinition(info = @Info(title = "OpenAPI Sample Project", version = "1.0"),
        security = @SecurityRequirement(name = "oauth2"),
        servers = @Server(url = "/openapi-sample"))
@ApplicationPath("/api")
public class ApplicationConfig extends Application {
}

```

## Run
Run the command below:
```
mvn clean install tomee:run
```

## Access the url
```
http://localhost:8080/openapi_sample/api/openapi.json
```

## Check the response
See that none of the information provided in the @OpenAPIDefinition  is there.
