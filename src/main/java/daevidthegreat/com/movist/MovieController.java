package daevidthegreat.com.movist;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
    @GetMapping
    public ResponseEntity<String> getAllMovies() {
        return new ResponseEntity<>("Hello World!", null, 200);
    }
}
