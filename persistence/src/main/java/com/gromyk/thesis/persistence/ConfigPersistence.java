package com.gromyk.thesis.persistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = {"com.gromyk.thesis.persistence"})
@EntityScan(basePackages = {"com.gromyk.thesis.persistence.db"})
@ComponentScan(basePackages = {"com.gromyk.thesis.persistence"})
public class ConfigPersistence {
}
