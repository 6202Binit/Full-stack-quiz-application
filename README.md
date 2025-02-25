# Full-stack-quiz-application
 This project is a full-stack web application for managing quizzes, developed using Spring Boot for the backend and React.js for the frontend. It provides functionalities for user authentication, quiz management, and quiz attempts.

Table of Contents
Features
Prerequisites
Installation
Running the Application
Project Structure
API Endpoints
Frontend Routes
Contributing
License
Features
User authentication with login functionality.
CRUD operations for quizzes and questions.
Users can attempt quizzes and view results.
Secure API endpoints with JWT-based authentication.
Prerequisites
Java Development Kit (JDK): Version 1.8 or higher.
Node.js and npm: Ensure you have the latest stable versions.
MySQL Database: For persisting application data.
Installation
Clone the Repository:
git clone https://github.com/6202Binit/Full-stack-quiz-application.git
cd quiz-application
Backend Setup:

Navigate to the backend directory:
cd backend
Configure the MySQL database:

Update the src/main/resources/application.properties file with your MySQL credentials:
spring.datasource.url=jdbc:mysql://localhost:3306/quiz_system
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.jpa.hibernate.ddl-auto=update
Build the backend application using Maven:

mvn clean install
Frontend Setup:

Navigate to the frontend directory:
cd ../frontend
Install the required npm packages:

npm install
Running the Application
Start the Backend Server:

From the backend directory, run:

mvn spring-boot:run
The backend server will start on http://localhost:8080.

Start the Frontend Development Server:

From the frontend directory, run:


npm start
The frontend application will start on http://localhost:3000.

Project Structure

quiz-application/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/com/example/quizapplication/
│   │   │   │   ├── controller/
│   │   │   │   ├── entity/
│   │   │   │   ├── repository/
│   │   │   │   └── service/
│   │   │   └── resources/
│   │   │       └── application.properties
│   └── pom.xml
└── frontend/
    ├── public/
    ├── src/
    │   ├── components/
    │   ├── App.js
    │   └── index.js
    └── package.json
API Endpoints
POST /auth/login: Authenticate a user and return a JWT token.
GET /api/quizzes: Retrieve a list of all quizzes.
POST /api/quizzes: Create a new quiz.
GET /api/quizzes/{id}: Retrieve details of a specific quiz.
PUT /api/quizzes/{id}: Update an existing quiz.
DELETE /api/quizzes/{id}: Delete a quiz.
GET /api/questions/quiz/{quizId}: Retrieve questions for a specific quiz.
Frontend Routes
/login: User login page.
/dashboard: Dashboard displaying available quizzes.
/quiz/:id: Page to attempt a specific quiz.
/results: Page displaying user's quiz results.
Contributing
Contributions are welcome! Please fork the repository and submit a pull request for any enhancements or bug fixes.

License
This project is licensed under the MIT License. See the LICENSE file for details.
