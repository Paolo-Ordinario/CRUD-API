#Pokemon CRUD API
A API for managing Pokemon charecters, built with Spring Boot and PostgresSQL.

## Insallation
1. Clone the repository
   ```bash terminal
   git clone PLACEHOLDER REPO URL
   ```

2. Create an 'application.properties' file in 'src/main/resources/' with your database credentials:
 ```properties
spring.application.name=Demo
spring.datasource.url=jdbc:postgresql://ep-holy-sun-aikm24ma-pooler.c-4.us-east-1.aws.neon.tech/neondb?sslmode=require
spring.datasource.username=neondb_owner
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```

3. Run the application:
```bash terminal
./gradlew bootRun
```

## API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/characters` | Get all Pokemon |
| GET | `/characters/{id}` | Get Pokemon by ID |
| POST | `/characters` | Add a new Pokemon |
| PUT | `/characters/{id}` | Update a Pokemon |
| DELETE | `/characters/{id}` | Delete a Pokemon |
| GET | `/characters/category/{type}` | Get Pokemon by type |
| GET | `/characters/search?name={substring}` | Search Pokemon by name |

## Demo Video

[https://uncg-my.sharepoint.com/:v:/r/personal/dlordinario_uncg_edu/Documents/video1539597749.mp4?csf=1&web=1&nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=a5bfey)](https://uncg-my.sharepoint.com/:v:/g/personal/dlordinario_uncg_edu/IQB4CEQ5sxsPR5CJwdNtJm2NAcAmOzcuGEL1qa4Wm5hLv20?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=SWi2hv](https://uncg-my.sharepoint.com/:v:/g/personal/dlordinario_uncg_edu/IQB4CEQ5sxsPR5CJwdNtJm2NAcAmOzcuGEL1qa4Wm5hLv20?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=eAeEhR)
