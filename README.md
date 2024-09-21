The College Directory Application is designed to serve as an informational platform for students,
faculty, and staff within a college or university. The application provides features such as user 
authentication, user management, and the ability to search for and view details about various 
departments, courses, and faculty members.

Key Features
User Authentication:

Users can log in to access the application. This feature ensures that sensitive information is
protected and only accessible to authorized users.
Users are assigned roles (e.g., admin, student, faculty) that determine their access levels.
User Management:

An admin can create, update, and delete user accounts.
Each user can manage their own profile, including personal information and passwords.
Directory Functionality:

Users can browse through a list of departments, courses, and faculty members.
Each department can have associated courses and faculty profiles, making it easy for users to 
find relevant information.
Search Functionality:

A search feature allows users to quickly find departments or courses based on keywords.
Responsive Design:

The application is built with a focus on user experience, ensuring that it works well on both
desktop and mobile devices.
Technology Stack
Backend:

Spring Boot: For building the RESTful API and handling backend logic.
Spring Security: For managing user authentication and authorization.
MySQL: As the database to store user data, directory information, and application settings.
Frontend:

HTML, CSS, JavaScript: For building the user interface and ensuring a smooth user experience.
Database Schema
User Table: Stores user details (username, password, role).
Department Table: Stores information about different departments (name, description).
Course Table: Links to departments and stores course details (course name, department ID).
Faculty Table: Stores faculty member information (name, department ID).

Application Flow
User Registration/Login:

Users can create an account or log in to an existing account.
Access Control:

Based on user roles, different functionalities are accessible. For example, admins have 
additional features to manage users and content.
Browsing and Searching:

Users can navigate through the directory and search for specific departments or courses.
Potential Enhancements
Advanced Search Filters: Improve the search functionality with filters like department, course type, etc.
Profile Management: Allow users to update their profiles more comprehensively.
Feedback System: Enable users to leave feedback or comments on courses or departments.
Mobile App: Develop a mobile application for easier access on the go.
Conclusion
The College Directory Application aims to streamline access to important college-related information, making 
it easier for users to find what they need while ensuring a secure environment. This project not only
enhances your technical skills but also provides valuable experience in building user-centered applications.
