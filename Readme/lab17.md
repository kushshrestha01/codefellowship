# Lab 17: CodeFellowship Profiles with Login
Adding login to the CodeFellowship app, and allow users to create posts.

## Setup
1. This feature was added to Lab 16 code. 

## Feature Tasks 
1. Ability for users to log in to your app was added.
2. Upon logging in, users are taken to a /codefellows route that displays their information.
3. Homepage, login, and registration routes are accessible to non-logged in users. All other routes are limited to logged-in users.
4. Registered user logs users into your app automatically.
5. Post entity was added to app.
6. A Post has a body and a createdAt timestamp.
7. A logged-in user should be able to create a Post, and a post should belong to the user that created it.
8. A user’s posts should be visible on their profile page.
9. When a user is logged in, the app should display the user’s username on every page (probably in the heading).

## Instructions to run the app
1. In terminal run ./gradlew bootrun
2. Go to localhost:8080/ should return to login page where user can login and make new profile
3. Once login user can create a new posts
4. When logged in user can check other user using profile /user/{id}
