package io.agilerules.movieinfoservice.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import io.agilerules.movieinfoservice.models.ContainerMetaDataService;
import io.agilerules.movieinfoservice.models.Movie;
import io.agilerules.movieinfoservice.models.MovieSummary;
import io.agilerules.ratingsdataservice.util.environment.InstanceInformationService;

@RestController
@RequestMapping("/movies")
public class MovieResourceController {
	@Autowired
	private InstanceInformationService containerMetaDataService;

    @Value("${api.key}")
    private String apiKey;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/{movieId}")
    public Movie getMovieInfo(@PathVariable("movieId") String movieId) {
        MovieSummary movieSummary = restTemplate.getForObject("https://api.themoviedb.org/3/movie/" + movieId + "?api_key=" +  apiKey, MovieSummary.class);
        return new Movie(movieId, movieSummary.getTitle(), movieSummary.getOverview(), containerMetaDataService.retrieveInstanceInfo());

    }

}
