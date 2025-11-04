# Używamy JDK 21 jako bazowego obrazu
FROM eclipse-temurin:21-jdk

# Ustaw katalog roboczy
WORKDIR /app

# Skopiuj pliki projektu
COPY . .

# Zbuduj aplikację
RUN ./mvnw clean package -DskipTests

# Otwórz port (Render używa zmiennej PORT)
EXPOSE 8080

# Uruchom aplikację
CMD ["java", "-jar", "target/FitBuddy-0.0.1-SNAPSHOT.jar"]