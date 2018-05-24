package com.zuul.route.gateway;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder applicationbBuilder) {
        return applicationbBuilder.sources(new Class[]{Application.class});
    }
}
