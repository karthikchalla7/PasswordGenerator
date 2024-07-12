
## Basic Spring Boot Password Generator

### Overview

This project is a simple yet effective strong password generator built using Spring Boot. It provides a web interface where users can specify the desired length of their password, and the application generates a strong, random password using a combination of lowercase letters, uppercase letters, numbers, and special characters.

This project serves as an excellent introduction to Spring Boot, demonstrating basic concepts such as:

- Setting up a Spring Boot project
- Creating a web controller
- Handling form submissions
- Using Thymeleaf for server-side rendering
- Basic password generation logic

### Prerequisites

To run this project, you need:

- Java Development Kit (JDK) 11 or later
- Maven 3.6 or later



### Setup and Running

1. Clone the repository:
   ```
   git clone https://github.com/yourusername/password-generator.git
   cd password-generator
   ```

2. Build the project:
   ```
   mvn clean install
   ```

3. Run the application:
   ```
   mvn spring-boot:run
   ```

4. Open a web browser and navigate to `http://localhost:8080`

### Usage

1. When you access the application, you'll see a simple form with an input field for password length.
2. Enter the desired length for your password (between 8 and 50 characters).
3. Click the "Generate Password" button.
4. The application will display a strong, randomly generated password.

### How It Works

1. The `PasswordController` class handles HTTP requests:
   - The `@GetMapping("/")` method serves the initial HTML page.
   - The `@PostMapping("/generate")` method handles form submissions, generates the password, and returns the result.

2. Password generation logic:
   - The `generateRandomPassword()` method creates a password using a combination of lowercase letters, uppercase letters, numbers, and special characters.
   - It uses `java.security.SecureRandom` for cryptographically strong random number generation.

3. The `index.html` file (located in `src/main/resources/templates/`) contains the web interface, built using basic Thymeleaf for server-side rendering.

### Security Considerations

While this project demonstrates basic password generation, for real-world applications, consider the following:

- Implement additional complexity rules (e.g., ensuring each character type is used at least once).
- Add server-side validation for the password length.
- Use HTTPS in production to protect data in transit.
- Consider not storing or logging generated passwords.

### Further Enhancements

To expand on this project, you could:

1. Add options for users to specify which character types to include.
2. Implement password strength meters.
3. Create an API endpoint for programmatic password generation.
4. Add unit and integration tests.

