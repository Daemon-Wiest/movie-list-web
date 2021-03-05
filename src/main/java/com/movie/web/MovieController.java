package com.movie.web;
import java.util.*;

import org.springframework.web.bind.annotation.*;

import com.movie.business.Movie;
@CrossOrigin
@RestController //this class is a controller, and should be converted to json automatically
@RequestMapping("/api/Movie")
public class MovieController {
	public List<String> movies = new ArrayList<>();
	@GetMapping("/")
	public List<String> getAll() {
		return movies;
	}
	@GetMapping("")
	public String addMovie(@RequestParam String title, @RequestParam int year) {
		
		Movie movie=new Movie(title, year);
		movies.add(movie);
		return movie.getTitle()+" added";
	}

}
