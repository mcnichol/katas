# Katas - Java TDD

A collection of Code Katas written in Java following TDD methodologies.

## Getting Started

Download and run all tests from all submodules
`clone https://github.com/mcnichol/katas.git` 
`cd katas`
`./gradlew test`

### Prerequisities

This project uses Spring-Boot on top of the Spring Framework.

[Reference Documentation](https://spring.io/docs/reference)

Although Spring Framework is not necessary for running tests from the application
services, to leverage dependency injection and autowiring of Controller and 
Repository dependencies, you will require this Framework.

Inside is a multi-module project build using Gradle and Spring-Boot Gradle 
plugin for dependency management built off the **Spring 1.4.1.RELEASE**

All sub-modules are individual Katas and will follow similar patterns of
development, testing, and running.


### Installing

To run a project as a Spring-Boot Application:
From the katas root module folder:

**$>** `./gradlew fizz-buzz:bootRun`

Navigate to localhost:8080/{sub-module}/{input}
http://localhost:8080/fizzbuzz/15


## Running the tests



### Break down into end to end tests

Explain what these tests test and why

```
Give an example
```

### And coding style tests

Explain what these tests test and why

```
Give an example
```

## Deployment

Add additional notes about how to deploy this on a live system

## Built With

* Dropwizard - Bla bla bla
* Maven - Maybe
* Atom - ergaerga

## Contributing

Please read [CONTRIBUTING.md](CONTRIBUTING.md) for details on our code of conduct, and the process for submitting pull requests to us.

## Versioning

We use [SemVer](http://semver.org/) for versioning. For the versions available, see the [tags on this repository](https://github.com/your/project/tags). 

## Authors

* **Billie Thompson** - *Initial work* - [PurpleBooth](https://github.com/PurpleBooth)

See also the list of [contributors](https://github.com/your/project/contributors) who participated in this project.

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

## Acknowledgments

* Hat tip to anyone who's code was used
* Inspiration
* etc
