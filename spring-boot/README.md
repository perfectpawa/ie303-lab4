## Prerequisites

- Java 24 or higher
- Maven 3.6 or higher

## Running the Application

1. Navigate to the project directory:
   ```bash
   cd spring-boot
   ```

2. Run the application using Maven:
   ```bash
   ./mvnw spring-boot:run
   ```

3. The application will start on `http://localhost:8080`

## API Endpoints

### Get All Products
```
GET /api/products
```

### Get Product by ID
```
GET /api/products/{id}
```

## Testing the API

```bash
# Get all products
curl http://localhost:8080/api/products

# Get product by ID
curl http://localhost:8080/api/products/1
