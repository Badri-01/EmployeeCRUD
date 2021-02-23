# EmployeeCRUD
Spring boot application to show CRUD API demo on Employee Database.

The application provides Rest API to perform GET, POST, PUT, DELETE operations on Employee database. Database used is MongoDB.

GET API : http://localhost:8080/api/v1/person/ (Get list of all employees)
          http://localhost:8080/api/v1/person/id (Get employee with specific id)

PUT API : http://localhost:8080/api/v1/person/    
(Expects a body that follows employee model structure)

POST API : http://localhost:8080/api/v1/person/
(Expects a body that follows employee model structure)

DELETE API: http://localhost:8080/api/v1/person/id  (Deletes employee with specific id)
