# Spring-data & Hibernate

#### Movie DB

We want to implement a database structure formed of three entities: **Movie,ArtisticMovie and TvShow**. An ArtisticMovie and a TvShow are also of type **Movie**. The final purpose of the application is to create a request for storing a Movie into the database and see that the data has been successfully and corectly stored.

A Movie must have:
- an Id of type Long
- a name, which must be stored in the database on a column named "name_of_the_movie"
- a score
- a duration, which must be stored in the database on a column named "duration_minutes"
- a list of categories

A TvShow has (in addition to a Movie's features):
- the number of seasons
- the number of episodes per season

A ArtisticMovie has (in addition to a Movie's features):
- the number of prizes won

In the database we only want to store a _SINGLE TABLE_ with all types of movies, discriminated by a type which is a String. So you have to decide which Inheritance strategy to apply when creating the entities. 

We already have a request for storing a Category defined, so you can get inspired from there. (**but it's pretty different**)

### Requirements:
1. Implement a model for **Movie,ArtisticMovie and TvShow** in the model package
2. Implement a DAO for **Movies** in the DAO package
3. Implement a service for **Movies** in the service package, following the existing pattern for Categories
4. Implement a controller for **Movies** with a POST method for storing a Movie

example of body:

{
	"name":"Great Gatsby",
	"score":"9",
	"minutes":22.3,
	"categories":[
		{"name":"horror"},
		{"name":"comedy"}
		]
}
