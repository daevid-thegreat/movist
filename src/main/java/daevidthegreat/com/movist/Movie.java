package daevidthegreat.com.movist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private String id;
    private String imdbId;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String posterPath;
    private List<String> genres;
    private List<String> backdrops;
    @DocumentReference
    private List<String> reviewIds;
}
