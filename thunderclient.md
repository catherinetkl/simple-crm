# customer api test

## get customer list

```http
GET http://localhost:8080/customers
```

```json
[
  {
    "id": 1,
    "firstName": "Bruce",
    "lastName": "Banner",
    "email": "brucebanner@marvel.com",
    "contactNo": "6784367092",
    "jobTitle": "Scientist",
    "yearOfBirth": 1969,
    "interactions": [
      {
        "id": 1,
        "type": "EMAIL",
        "remarks": "Hello, I am Bruce Banner",
        "interactionDate": "2020-01-01"
      }
    ]
  },
  {
    "id": 2,
    "firstName": "Peter",
    "lastName": "Parker",
    "email": "peterparker@marvel.com",
    "contactNo": "4072241783",
    "jobTitle": "Photographer",
    "yearOfBirth": 2001,
    "interactions": [
      {
        "id": 2,
        "type": "PHONE",
        "remarks": "Hey there!",
        "interactionDate": "2022-02-15"
      }
    ]
  },
  {
    "id": 3,
    "firstName": "Stephen",
    "lastName": "Strange",
    "email": "stephenstrange@marvel.com",
    "contactNo": "5706627762",
    "jobTitle": "Doctor",
    "yearOfBirth": 1979,
    "interactions": [
      {
        "id": 3,
        "type": "MEETING",
        "remarks": "Discussing magical matters",
        "interactionDate": "2023-03-20"
      }
    ]
  },
  {
    "id": 4,
    "firstName": "Steve",
    "lastName": "Rogers",
    "email": "steverogers@marvel.com",
    "contactNo": "6781367092",
    "jobTitle": "Soldier",
    "yearOfBirth": 1918,
    "interactions": [
      {
        "id": 4,
        "type": "CHAT",
        "remarks": "Talking about the old days",
        "interactionDate": "2021-05-10"
      }
    ]
  }
]
```

### POST /customers

```http
POST http://localhost:8080/customers
```

```json
  {
    "id": 5,
    "firstName": "Tony",
    "lastName": "Stark",
    "email": "tonystark@marvel.com",
    "contactNo": "2129704133",
    "jobTitle": "CEO",
    "yearOfBirth": 1970,
    "interactions": null
  }
```

### GET interactions list

```http
GET http://localhost:8080/interactions
```

```json
[
  {
    "id": 1,
    "type": "EMAIL",
    "remarks": "Hello, I am Bruce Banner",
    "interactionDate": "2020-01-01"
  },
  {
    "id": 2,
    "type": "PHONE",
    "remarks": "Hey there!",
    "interactionDate": "2022-02-15"
  },
  {
    "id": 3,
    "type": "MEETING",
    "remarks": "Discussing magical matters",
    "interactionDate": "2023-03-20"
  },
  {
    "id": 4,
    "type": "CHAT",
    "remarks": "Talking about the old days",
    "interactionDate": "2021-05-10"
  }
]
```

### POST /interactions

```http
POST http://localhost:8080/interactions
```

```json
{
    "id": 5,
    "type": "EMAIL",
    "remarks": "Discussing new projects",
    "interactionDate": "2023-12-30"
}
```

### GET updated interactions

```http
GET http://localhost:8080/interactions
```

```json
[
  {
    "id": 1,
    "type": "EMAIL",
    "remarks": "Hello, I am Bruce Banner",
    "interactionDate": "2020-01-01"
  },
  {
    "id": 2,
    "type": "PHONE",
    "remarks": "Hey there!",
    "interactionDate": "2022-02-15"
  },
  {
    "id": 3,
    "type": "MEETING",
    "remarks": "Discussing magical matters",
    "interactionDate": "2023-03-20"
  },
  {
    "id": 4,
    "type": "CHAT",
    "remarks": "Talking about the old days",
    "interactionDate": "2021-05-10"
  },
  {
    "id": 5,
    "type": "EMAIL",
    "remarks": "Discussing new projects",
    "interactionDate": "2023-12-30"
  }
]
```

### GET updated customer list

```http
GET http://localhost:8080/customers
```

```json
[
  {
    "id": 1,
    "firstName": "Bruce",
    "lastName": "Banner",
    "email": "brucebanner@marvel.com",
    "contactNo": "6784367092",
    "jobTitle": "Scientist",
    "yearOfBirth": 1969,
    "interactions": [
      {
        "id": 1,
        "type": "EMAIL",
        "remarks": "Hello, I am Bruce Banner",
        "interactionDate": "2020-01-01"
      }
    ]
  },
  {
    "id": 2,
    "firstName": "Peter",
    "lastName": "Parker",
    "email": "peterparker@marvel.com",
    "contactNo": "4072241783",
    "jobTitle": "Photographer",
    "yearOfBirth": 2001,
    "interactions": [
      {
        "id": 2,
        "type": "PHONE",
        "remarks": "Hey there!",
        "interactionDate": "2022-02-15"
      }
    ]
  },
  {
    "id": 3,
    "firstName": "Stephen",
    "lastName": "Strange",
    "email": "stephenstrange@marvel.com",
    "contactNo": "5706627762",
    "jobTitle": "Doctor",
    "yearOfBirth": 1979,
    "interactions": [
      {
        "id": 3,
        "type": "MEETING",
        "remarks": "Discussing magical matters",
        "interactionDate": "2023-03-20"
      }
    ]
  },
  {
    "id": 4,
    "firstName": "Steve",
    "lastName": "Rogers",
    "email": "steverogers@marvel.com",
    "contactNo": "6781367092",
    "jobTitle": "Soldier",
    "yearOfBirth": 1918,
    "interactions": [
      {
        "id": 4,
        "type": "CHAT",
        "remarks": "Talking about the old days",
        "interactionDate": "2021-05-10"
      }
    ]
  },
  {
    "id": 5,
    "firstName": "Tony",
    "lastName": "Stark",
    "email": "tonystark@marvel.com",
    "contactNo": "2129704133",
    "jobTitle": "CEO",
    "yearOfBirth": 1970,
    "interactions": [
      {
        "id": 5,
        "type": "EMAIL",
        "remarks": "Discussing new projects",
        "interactionDate": "2023-12-30"
      }
    ]
  }
]
```
