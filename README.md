# Password Checker API

A Spring Boot application that validates passwords based on defined security rules.  
Returns informative messages describing validation results.

## Features

- Validates passwords against multiple security requirements
- Returns detailed error messages in Portuguese
- RESTful API endpoint

## Requirements

- Java 21
- Maven
- Spring Boot 3.5.7


## API Endpoint

### Validate Password

```
POST /password
Content-Type: application/json

{
  "password": "YourPassword123!"
}
```

### Response

- **200 OK**: Password is valid
- **400 Bad Request**: Password is invalid (contains error messages)

## Password Requirements

- At least 8 characters long
- At least one uppercase letter (A-Z)
- At least one lowercase letter (a-z)
- At least one digit (0-9)
- At least one special character (!@#$%^&*()_+-=[]{};':"<>?,./`~\\|)

## Running the Application

```bash
mvn spring-boot:run
```

The application will be available at `http://localhost:8080`

## Technologies Used

- Spring Boot
- Spring Web
- Spring Boot DevTools (for development)
- Maven (dependency management)

## Contributing

Contributions are welcome.

1. Fork the repository
2. Create a feature branch  
   `git checkout -b feature/your-feature`
3. Commit your changes  
   `git commit -m "Add new feature"`
4. Push the branch  
   `git push origin feature/your-feature`
5. Open a pull request


## License

This project is licensed under the MIT License.  



