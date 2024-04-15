# Library Management System

This Library Management System is a RESTful API developed using Spring Boot, designed to manage books, patrons, and borrowing records for a library. The system supports CRUD operations on books and patrons, as well as managing borrow and return processes for books.

## Features

- Manage books
- Manage patrons
- Track borrowing records
- Basic authentication
- Automated testing with JUnit

## Technologies

- Spring Boot 2.5.4
- Spring Data JPA
- Spring Security
- SQLite Database
- Maven
- Java 11

## Entities
### Book

Attributes:

- `id` (Long): The unique identifier for a book.
- `title` (String): The title of the book.
- `author` (String): The author of the book.
- `publicationYear` (Integer): The year the book was published.
- `isbn` (String): The ISBN number of the book.

### Patron

Attributes:

- `id` (Long): The unique identifier for a patron.
- `name` (String): The name of the patron.
- `contactInfo` (String): The contact information for the patron.

### Borrowing Record

Attributes:

- `id` (Long): The unique identifier for a borrowing record.
- `bookId` (Long): The ID of the borrowed book.
- `patronId` (Long): The ID of the patron who borrowed the book.
- `borrowDate` (LocalDate): The date when the book was borrowed.
- `returnDate` (LocalDate): The date when the book was returned.

## Installation

### Prerequisites

- Java 11 or higher
- Maven 3.6 or higher

### Setup

1 - Clone the repository:


`git clone https://github.com/yourusername/library-management-system.git`
`cd library-management-system`

2 - Build the project:

`mvn clean install`
 
3 - Run the application:

`mvn spring-boot:run`

## Testing Endpoints with Postman

Before testing, ensure the application is running on http://localhost:8080.

## Authentication

The API uses basic authentication. Use the following credentials:

- Username: user
- Password: password

## Sample Requests

1 - Add a Book
 - URL: POST /api/books
 - Headers: Content-Type: application/json, Authorization: Basic <credentials>
 - Body:


`
    {
      "title": "1984",
      "author": "George Orwell",
      "publicationYear": 1949,
      "isbn": "0123456789"
    }
`

2 - Get All Books

- URL: GET /api/books
- Headers: Authorization: Basic <credentials>

3 - Update a Book

- URL: PUT /api/books/{id}
- Headers: Content-Type: application/json, Authorization: Basic <credentials>
- Body:

    
`
	{
	  "title": "1984",
	  "author": "George Orwell",
	  "publicationYear": 1950,
	  "isbn": "0123456789"
	}
 `


4 - Delete a Book
- URL: DELETE /api/books/{id}
- Headers: Authorization: Basic <credentials>

Replace <credentials> with the Base64 encoded string of username:password.



Enjoy ^_^
