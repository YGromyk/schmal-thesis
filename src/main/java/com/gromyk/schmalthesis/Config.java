package com.gromyk.schmalthesis;

import com.gromyk.thesis.persistence.ConfigPersistence;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {ConfigPersistence.class})
public class Config {
}
