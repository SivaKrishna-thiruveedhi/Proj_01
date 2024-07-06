package com.library.config;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CurrentTime {
	
	@Bean
	public String presentTime() {
		// Get the current date and time
        LocalDateTime currentDateTime = LocalDateTime.now();
        // Define a custom date and time format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        // Format the current date and time as a string
        String formattedDateTime = currentDateTime.format(formatter);
        
        return formattedDateTime;
	}
	
}
