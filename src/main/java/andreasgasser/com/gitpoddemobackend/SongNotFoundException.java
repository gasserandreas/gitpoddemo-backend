package andreasgasser.com.gitpoddemobackend;

public class SongNotFoundException extends RuntimeException {
    SongNotFoundException(Long id) {
        super("Could not find song " + id);
    }
}
