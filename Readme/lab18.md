# Lab 18: Following Users on CodeFellowship
Adding login to the CodeFellowship app, and allow users to create posts.

## Setup
1. This feature was added to Lab 17 code. 

## Feature Tasks 
1. Ensure that users can’t perform SQL injection or HTML injection with their posts.
2. Allow users to follow other users. Following a user means that their posts show up in the logged-in user’s feed, where they can see what all of their followed users have posted recently.
3. Ensure there is some way (like a users index page) that a user can discover other users on the service.
4. On a user profile page that does NOT belong to the currently logged-in user, display a “Follow” button. When a user clicks that follow button, the logged-in user is now following the viewed-profile-page user.
note: this will require a self-join on ApplicationUsers.
5. A user can visit a url (like /feed) to view all of the posts from the users that they follow.
Each post should have a link to the user profile of the user who wrote the post.

## Instructions to run the app
1. In terminal run ./gradlew bootrun
2. Go to localhost:8080/ should return to login page where user can login and make new profile
