package javabrains.io.ratingDataService.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javabrains.io.ratingDataService.model.MovieRating;

@RestController
@RequestMapping("/rating")
public class RatingController {

	@RequestMapping(method=RequestMethod.GET)
	public List<MovieRating> getRatingForUser(@RequestParam(name = "user",required=false) String user) {
		if (user!=null && user.equalsIgnoreCase("gagan"))
			return Arrays.asList(new MovieRating("M101", 5), new MovieRating("M103", 2));
		return Arrays.asList(new MovieRating("M101", 4), new MovieRating("M102", 5), new MovieRating("M103", 1));

	}

}
