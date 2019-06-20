# Lab 16: CodeFellowship Profiles
An app called CodeFellowship was created that allows people learning to code to connect with each other and support each other on their coding journeys.

## Setup
1. A new repo codefellowship was created without readme and license. 
2. Spring Initializr was used to set up an app with dependencies on Web, Thymeleaf, JPA, Postgres, and Security (and optionally DevTools for auto refresh of app on building). 

## Feature Tasks 
1. The site has a splash page at the root route (/) that contains basic information about the site, as well as a link to the “sign up” page.
2. An ApplicationUser have a username, password ( hashed using BCrypt), firstName, lastName, dateOfBirth, bio, and any other fields you think are useful.
3. The site allow users to create an ApplicationUser on the “sign up” page.
4. Controller have an @Autowired private PasswordEncoder passwordEncoder; and use that to run passwordEncoder.encode(password) before saving the password into the new user.
5. The site have a page which allows viewing the data about a single ApplicationUser, at a route like /users/{id}.
6. This include a default profile picture, which is the same for every user, and their basic information.
7. Using the above cheat sheet, add the ability for users to log in to your app.
8. Upon logging in, users are taken to a /myprofile route that displays their information.
9. Ensure that your homepage, login, and registration routes are accessible to non-logged in users. All other routes should be limited to logged-in users.
10. Ensure that user registration also logs users into your app automatically.
11. The site should be reasonably styled. (This can be using CSS that you did not create yourself.)
12. The site should contain integration testing. At a minimum, there should be tests to ensure basic functionality for the splash page and the sign up page.

## Instructions to run the app
1. In terminal run ./gradlew bootrun
2. Go to localhost:8080/ should return to login page where user can login and create new user
