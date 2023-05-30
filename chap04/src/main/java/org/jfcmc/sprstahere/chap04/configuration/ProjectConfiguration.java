package org.jfcmc.sprstahere.chap04.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(
        basePackages = {"org.jfcmc.sprstahere.chap04.proxies",
                        "org.jfcmc.sprstahere.chap04.services",
                        "org.jfcmc.sprstahere.chap04.repositories"}
)
public class ProjectConfiguration {
}
