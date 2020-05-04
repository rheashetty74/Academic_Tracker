# Academic_Tracker

The aim of this project is to create a student assist app. As the name suggests, the app is supposed to assist students in keeping up with their academics.

While the scope of the project includes different types of user logins, for this prototype only student logins have been implemented.
Some features that have been implemented are:
1. Registeration of an existing user in the school network to the app.
2. Login verification.
3. Displaying the list of courses the student has registered for.
4. Clicking on a course lets the takes the user to a tabbed activity that has fragments.
5. Course Details fragments shows information about the course, an upcoming deadline for the course, and grades for this course. If a grade hasn't been posted yet, then the value is -.
6. Notes fragment shows a list of notes for the course. It lets the user click on an existing note and edit or add a new note.


Discussions feature and Calendar view are yet to be implemented. For the prototype, all the information related to the user and course for displaying, were hardcoded default values.

**To run the project**
1. Download latest version of Android Studio and gradle
2. Clone the project and open it in Android Studio
3. Let gradle finish syncing and building
4. Setup an emulator. We have used Google Pixel
5. Run the project using the little green play icon at the top of the window
6. Make sure the run target is 'app'
7. Make sure it is trying to run on the right emulator

When the app finishes installing, the emulator would start with the LoginAcitivity as that is the launcher acitivity for this app.
