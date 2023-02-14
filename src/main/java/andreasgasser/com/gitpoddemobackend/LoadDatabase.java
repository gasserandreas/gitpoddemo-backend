package andreasgasser.com.gitpoddemobackend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(SongRepository repository) {

        return args -> {
            log.info("Preloading " + repository.save(new Song("The Kids Aren't Alright", "The Offspring")));
            log.info("Preloading " + repository.save(new Song("Last Resort", "Papa Roach")));
        };
    }
}