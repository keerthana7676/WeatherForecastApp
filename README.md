📱 Weather Forecast App
1. Overview
Goal:
To build a simple Android application that provides weather forecasts based on user-inputted city names. The app retrieves real-time weather data (temperature and humidity) using the OpenWeatherMap API.

2. Technologies Used
Component	Technology
Language	Java
UI Design	XML
Networking	Retrofit (REST API)
IDE	Android Studio
API Provider	OpenWeatherMap

3. Features
•	Enter a city name to fetch weather data.
•	Display current temperature and humidity.
•	Error handling for invalid or empty city input.
•	About screen for app info and developer details.
•	Navigation between screens using explicit intents.

4. App Structure

WeatherForecastApp/
├── app/
│   ├── java/com/example/weatherforecastapp/
│   │   ├── MainActivity.java
│   │   ├── AboutActivity.java
│   │   ├── api/
│   │   │   ├── ApiClient.java
│   │   │   └── ApiInterface.java
│   │   └── model/
│   │       └── WeatherResponse.java
│   ├── res/layout/
│   │   ├── activity_main.xml
│   │   └── activity_about.xml
│   └── AndroidManifest.xml
└── build.gradle

5. Setup & Installation

      1. Clone or Download the project from the source.
      2. Open in Android Studio.
      3. Insert your OpenWeatherMap API Key in MainActivity.java:
      
         String API_KEY = "YOUR_API_KEY"; // Replace with your key
      
      4. Connect a device or use emulator.
      5. Run the project or build APK via:
         Build > Build Bundle(s)/APK(s) > Build APK(s)

6. Usage Instructions

- Enter a valid city name (e.g., "London")
- Tap "Get Weather" to fetch data
- Tap "About" to view app details

7. Screenshots
![S2](https://github.com/user-attachments/assets/4cdcd589-4361-4a19-9fd8-d5589efec7cb)
![S3](https://github.com/user-attachments/assets/7d46867e-af70-4053-a7af-88d80c29f3e5)

    1. Home Screen:
       - Text input for city name
       - "Get Weather" button
       - Output shown below
       - "About" button for navigation
     
    
    2. About Screen:
       - App version
       - Developer name
 
9. Developer

Name: Keerthana N
Email: keerthanan7616@gmail.com
Version: 1.0
Date: 05 May 2025

