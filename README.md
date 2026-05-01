# E-Commerce Product Management System

A Spring Boot + MySQL web application for managing products using REST API, JPA, Fetch API, and frontend integration.

---

## Features

- View all products
- View product by ID
- Add new product
- Update product
- Delete product
- Filter products by category
- Frontend connected using Fetch API
- Responsive product page
- MySQL database integration

---

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- HTML
- JavaScript (Fetch API)
- CSS
- Git / GitHub

---

## Database Schema

### products

| Column Name     | Type |
|----------------|------|
| id             | Long |
| name           | String |
| description    | String |
| price          | double |
| stock_quantity | int |
| image_url      | String |
| category_id    | Long |

### categories

| Column Name | Type |
|------------|------|
| id         | Long |
| name       | String |

### orders

| Column Name   | Type |
|--------------|------|
| id           | Long |
| customerName | String |

### order_items

| Column Name | Type |
|------------|------|
| id         | Long |
| quantity   | int |
| order_id   | Long |
| product_id | Long |

---

## Relationships

- One Category has many Products
- One Product belongs to one Category
- One Order has many OrderItems
- One OrderItem belongs to one Product

---

## API Endpoints

### Product APIs

| Method | Endpoint |
|-------|----------|
| GET | /api/v1/products |
| GET | /api/v1/products/{id} |
| POST | /api/v1/products |
| PUT | /api/v1/products/{id} |
| DELETE | /api/v1/products/{id} |
| GET | /api/v1/products/category/{name} |

---

## Sample JSON for POST

```json
{
  "name": "Nike Shoes",
  "description": "Comfortable running shoes",
  "price": 899,
  "stockQuantity": 10,
  "imageUrl": "nike.jpg"
}
