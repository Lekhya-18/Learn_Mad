# 📱 First Android Application - Understanding XML & Java
---
## 📌 XML (User Interface)

XML is a language used to design the **User Interface (UI)** of an Android application.

- It defines what we see on the screen  
- It contains UI elements like TextView, Button, etc.  

In this first application, we are not focusing on layouts.(Will be discussed Later)  
We simply used a **TextView** to display text.

### 🔹 Example:

```xml
<TextView
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:text="Hello, Welcome to My First Application"/> 
```
🔹 Explanation
- TextView → Used to display text
- layout_width & layout_height → Define size of the element
- text → Displays the message on screen
---
### 📌 Java (Application Logic)
---
Java is the most important part where the actual logic of the application runs.

```java 
public class MainActivity extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
}
```
## 🔹 1.MainActivity
`public class MainActivity extends AppCompatActivity`
- AppCompatActivity is a Java class that provides Android features
- Without extending this, the app cannot run properly
## 🔹 2.onCreate() Method
`protected void onCreate(Bundle savedInstanceState)`
- This is the entry point of the application
- The app starts execution from here
## 🔹 3.super.onCreate(savedInstanceState)
- Calls the parent class method
- Required for proper initialization
- Also helps in restoring saved data if available
## 🔹 4.setContentView()
`setContentView(R.layout.activity_main);`
- Used to connect XML and Java
- Displays the UI designed in XML
## 🔹 5.Bundle savedInstanceState
- Bundle is a container used to store data in key-value pairs
- Used to save and restore activity data
- Useful during situations like screen rotation
--- 
## 📂 Project Files

- **Java File:**  
  `app/src/main/java/com/yourpackagename/MainActivity.java`

- **XML Layout File:**  
  `app/src/main/res/layout/activity_main.xml`