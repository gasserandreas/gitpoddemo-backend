package andreasgasser.com.gitpoddemobackend;

import java.util.List;

import org.springframework.web.bind.annotation.*;

@RestController
public class SongController {

    private final SongRepository repository;

    public SongController(SongRepository repository) {
        this.repository = repository;
    }

    // Aggregate root
    // tag::get-aggregate-root[]
    @GetMapping("/songs")
    public List<Song> list() {
        return repository.findAll();
    }
    // end::get-aggregate-root[]

    @PostMapping("/songs")
    public Song post(@RequestBody Song song) {
        return repository.save(song);
    }

    @GetMapping("/songs/{id}")
    public Song get(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new SongNotFoundException(id));
    }

    @PutMapping("/songs/{id}")
    public Song put(@RequestBody Song newSong, @PathVariable long id) {
        return repository.findById(id)
                .map((song) -> {
                    song.setName(newSong.getName());
                    song.setArtist(newSong.getArtist());
                    song.setLearned(newSong.isLearned());
                    return repository.save(song);
                }).orElseGet(() -> {
                    newSong.setId(id);
                    return repository.save(newSong);
                });
    }

    @DeleteMapping("songs/{id}")
    public void delete(@PathVariable long id) {
        repository.deleteById(id);
    }
}
