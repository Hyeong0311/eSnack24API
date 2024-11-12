package org.esnack24api.esnack24api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class ESnack24ApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ESnack24ApiApplication.class, args);
    }

}
