# 🏋️‍♂️ FitBuddy

**FitBuddy** to inteligentna aplikacja webowa wspierająca trening i dietę — Twoje osobiste centrum fitness w jednym miejscu.  
Projekt tworzony w Javie (Spring Boot) jako backend + planowany frontend (React/HTML/CSS).  
Docelowo aplikacja będzie również dostępna na Androida i iOS.

---

## Funkcjonalności (plan projektu)

### Etap 1 — Fundament (MVP)
- Rejestracja i logowanie użytkowników (Spring Boot, JWT)
- Profil użytkownika: dane osobowe, cel (redukcja / masa / utrzymanie)
- Obliczanie BMR, TDEE i zapotrzebowania makroskładników
- Prosty endpoint `/health` (status aplikacji)

### Etap 2 — Diety i jadłospisy
- Generowanie planów żywieniowych (7 dni)
- System przepisów i składników
- Integracja z urządzeniami kuchennymi (Thermomix, Airfryer)

### Etap 3 — Trening i AI Coach
- Tworzenie i zapisywanie planów treningowych
- Kalendarz ćwiczeń
- Integracja z ChatGPT (AI-coach) — indywidualne plany i sugestie
- Filmy instruktażowe (YouTube / Vimeo)

### Etap 4 — Postępy i analityka
- Śledzenie wagi, obwodów, kalorii i wyników treningowych
- Wykresy i raporty

---

## Stack technologiczny

| Warstwa | Technologia |
|----------|--------------|
| Backend | Java 21 (Spring Boot 3.5.7) |
| Baza danych | H2 Database (dev), PostgreSQL (prod) |
| Build | Maven |
| CI/CD | GitHub Actions |
| Frontend (planowany) | HTML, CSS, JavaScript / React |
| AI | OpenAI API (ChatGPT) |
| Inne | Lombok, JPA, Validation API |

---

## Struktura projektu
FitBuddy/
├── src/
│   ├── main/java/com/fitbuddy/
│   │   ├── controller/      # Kontrolery REST API
│   │   ├── model/           # Modele danych (encje JPA)
│   │   ├── repository/      # Repozytoria baz danych
│   │   ├── service/         # Logika biznesowa
│   │   └── FitBuddyApplication.java
│   └── main/resources/
│       ├── application.properties
│       └── static/
├── pom.xml
└── README.md

---

## ⚙Uruchomienie projektu lokalnie

### Wymagania:
- Java 21 (np. Amazon Corretto)
- Maven 3.9+
- IntelliJ IDEA / VSCode

### Kroki:
```bash
git clone https://github.com/KuI3uS/FitBuddy-.git
cd FitBuddy-
mvn clean install
mvn spring-boot:run