package andreasgasser.com.gitpoddemobackend;

import org.springframework.data.jpa.repository.JpaRepository;

interface SongRepository extends JpaRepository<Song, Long> {

}
