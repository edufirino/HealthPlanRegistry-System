# HealthPlanRegistry System


-----------------------------------------------------------------------------------------------------

### This project includes the following libraries:
* springframework 3.2.2
* h2database
* projectlombok
* auth0 4.4.0
* mapstruct 1.6.0.Beta1
* maven 3.7.0

-----------------------------------------------------------------------------------------------------
### Download the Project from GitHub

URL

-----------------------------------------------------------------------------------------------------

### Build and Run the Project

To compile:

`mvn clean install`

To start:

`mvn spring-boot:run `

-----------------------------------------------------------------------------------------------------

### Swagger Documentation:

* http://localhost:8080/swagger-ui/index.html

-----------------------------------------------------------------------------------------------------
### User Creation:


POST - http://localhost:8080/users

Payloads:

    {
        "email": "2",
        "password": "1",
        "role": "ROLE_ADMINISTRATOR"
    }

ou

    {
        "email": "1",
        "password": "1",
        "role": "ROLE_CUSTOMER"
    }

-----------------------------------------------------------------------------------------------------
### Login:

POST - http://localhost:8080/users/login

    {
        "email": "1",
        "password": "1"
    }


After logging in, copy the token code from the response body, for example,
"eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9....."

This token will be used for authentication and authorization.

Before executing the endpoints, in POSTMAN, select Authorization: Bearer TOKEN, then paste the token.

-----------------------------------------------------------------------------------------------------



### User Permissions

ADMINISTRATOR and CUSTOMER can:

* Register a beneficiary with documents.
* List all registered beneficiaries.
* List all documents of a beneficiary based on their ID.
* Update the registration data of a beneficiary.

Only ADMINISTRATOR can:

* Remove a beneficiary.


-----------------------------------------------------------------------------------------------------

### Beneficiary Creation with Documents:

POST - http://localhost:8080/beneficiaries

Payload

```
{
    "name": "User1",
    "phone": "1234-4321",
    "birthDate": "2000-01-28T02:59:32.027Z",
    "documents": [
        {
            "documentType": "CPF",
            "description": "123.123.123.12",
            "createAt": "2024-01-28T02:59:32.027Z",
            "updateAt": "2024-01-28T02:59:32.027Z"
        },
        {
            "documentType": "RG",
            "description": "12.123.123-1",
            "createAt": "2024-01-28T02:59:32.027Z",
            "updateAt": "2024-01-28T02:59:32.027Z"
        }
    ]
}
```

-----------------------------------------------------------------------------------------------------
### Lists All Beneficiaries:

GET - http://localhost:8080/beneficiaries

-----------------------------------------------------------------------------------------------------
### Lists Documents by Beneficiary Id:

GET - http://localhost:8080/beneficiaries/1/documents

-----------------------------------------------------------------------------------------------------

### Removes Beneficiary by Id:

DELETE - http://localhost:8080/beneficiaries/1




-----------------------------------------------------------------------------------------------------
