# 🏠 RentHive - Smart Property Rental Management System

> RentHive is a full-stack property rental platform built using React, Spring Boot, and PostgreSQL. It allows landlords to list properties and tenants to search, apply, and sign digital leases. The system features AI-driven property recommendations, real-time booking updates, and secure payment integration.

---

## 📋 Table of Contents

- [🌟 Project Summary](#-project-summary)
- [🧩 Core Features](#-core-features)
- [🧑‍💼 Target Users](#-target-users)
- [💻 Tech Stack](#-tech-stack)
- [🚀 Getting Started](#-getting-started)
- [🛠️ Environment Configuration](#️-environment-configuration)
- [☁️ Deployment](#️-deployment)
- [🤝 Contributing](#-contributing)
- [📜 License](#-license)

## ✨ Key Highlights

- **Full-Stack Architecture:** Modern stack with React for a dynamic frontend and Spring Boot for a robust backend.
- **AI-Powered Recommendations:** Utilizes AI to provide tenants with personalized property suggestions.
- **Real-Time Functionality:** Employs WebSockets for instant notifications and chat.
- **End-to-End Workflow:** Covers the entire rental process from listing to lease management and payments.

## 🧩 Core Features

### 🏘️ 1. Property Listings
-   **Landlords** can create, update, and delete property listings.
-   Listings include high-resolution images, detailed amenities, pricing, location, and availability status.
-   **Tenants** can perform advanced searches using filters like location, price range, property size, and availability dates.

### 👀 2. Smart Property Matching (AI)
-   Tenants receive AI-recommended listings tailored to their preferences (budget, location, size).
-   The recommendation engine analyzes past viewing history and current property availability.
-   *Example: Uses OpenAI to summarize listing descriptions and match them to keywords in a user's profile.*

### 📋 3. Application Workflow
-   Tenants can easily apply for a property directly through the platform.
-   Landlords receive real-time notifications to review applications.
-   Application statuses (Approved, Rejected, Pending) are tracked and visible to both parties.
-   Tenants can view their complete application history in their dashboard.

### 📄 4. Digital Lease Agreements
-   Landlords can upload lease agreement templates (PDFs).
-   Functionality for digitally signing and downloading agreements.
-   Automated notifications for lease expiry and renewal reminders.

### 💳 5. Payment Module
-   Secure rent payment processing via **Stripe** or **Razorpay**.
-   Automated generation of monthly invoices.
-   Tenants can access their complete payment history.

### 🔔 6. Notifications & Chat
-   Real-time notifications for new applications, status updates, or messages.
-   **WebSocket-powered** chat module for direct communication between tenants and landlords.

### 📊 7. Admin Panel
-   Comprehensive user management (Admins, Landlords, Tenants).
-   Moderation tools for properties and user-generated content.
-   Analytics dashboard displaying key metrics like total rent collected, most viewed properties, and user growth.

## 🧑‍💼 Target Users

-   **👑 Admin:** Manages the entire platform, handles user disputes, and monitors analytics.
-   **🏠 Landlords:** List properties, approve or decline tenant applications, and manage digital leases.
-   **👤 Tenants:** Browse property listings, submit applications, pay rent, and manage lease documents.

## 💻 Tech Stack

| Layer                | Technology                                              |
| -------------------- | ------------------------------------------------------- |
| **Frontend**         | React, Tailwind CSS, Redux Toolkit, Axios               |
| **Backend**          | Spring Boot, Spring Data JPA, Spring Security, JWT      |
| **Database**         | PostgreSQL (Managed using DBeaver)                      |
| **Real-time**        | WebSockets (Spring WebSocket + Socket.IO on frontend)   |
| **AI/ML**            | OpenAI / LangChain for smart recommendations            |
| **File Handling**    | PDF upload/download for lease agreements                |
| **Payments**         | Stripe / Razorpay                                       |
| **Deployment**       | Docker, GitHub Actions (CI/CD), Render/Heroku           |

## 🚀 Getting Started

### Prerequisites

-   Java 17+
-   Node.js 18+
-   PostgreSQL
-   Docker (Optional)

### Installation

1.  **Clone the repository:**
    ```sh
    git clone https://github.com/your-username/renthive.git
    cd renthive
    ```

2.  **Backend Setup:**
    ```sh
    cd backend
    # Configure application.properties with your DB, JWT, and API keys
    ./mvnw spring-boot:run
    ```

3.  **Frontend Setup:**
    ```sh
    cd frontend
    # Create a .env file with your API endpoint
    npm install
    npm start
    ```

## 🛠️ Environment Configuration

You will need to create a configuration file for both the backend and frontend.

#### Backend (`/backend/src/main/resources/application.yamal`)

```properties
# PostgreSQL Database
spring.datasource.url=jdbc:postgresql://localhost:5432/renthive_db
spring.datasource.username=your_db_user
spring.datasource.password=your_db_password
spring.jpa.hibernate.ddl-auto=update

# JWT Secret
jwt.secret=your-super-secret-key-for-jwt

# OpenAI API Key
openai.api.key=sk-your-openai-api-key

# Stripe API Key
stripe.secret.key=sk_test_your_stripe_secret_key
```

#### Frontend (`/frontend/.env`)

```env
REACT_APP_API_BASE_URL=http://localhost:8080/api
REACT_APP_STRIPE_PUBLIC_KEY=pk_test_your_stripe_public_key
```

## ☁️ Deployment

This project is configured for deployment using Docker and can be automated with GitHub Actions.

1.  **Build Docker Images:**
    ```sh
    # Build backend
    docker build -t renthive-backend ./backend
    # Build frontend
    docker build -t renthive-frontend ./frontend
    ```

2.  **Run with Docker Compose:**
    Use the `docker-compose.yml` file to orchestrate the services.
    ```sh
    docker-compose up -d
    ```

---
