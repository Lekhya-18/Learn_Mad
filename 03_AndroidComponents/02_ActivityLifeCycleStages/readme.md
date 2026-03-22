# 📱 Activity Lifecycle in Android
---
## 📌 What is Activity Lifecycle?
 Activity Lifecycle is the **sequence of states an Activity goes through from creation to destruction**.
👉 In simple words:  
It defines how an Android screen behaves when the app is opened, used, paused, or closed.
```
✔ Activity = Screen
✔ Lifecycle = Journey of that screen
```
---
# 🔄 Why Lifecycle is Important?
- Helps Android manage memory efficiently  
- Ensures smooth user experience  
- Handles app switching properly  
- Prevents crashes and data loss  
---
# 📊 Activity Lifecycle Methods
## 🔹 1. onCreate()
- Called when Activity is **first created**
- Initializes UI and logic
- `setContentView()` is used here
👉 Think: App is starting
---
## 🔹 2. onStart()
- Activity becomes **visible to the user**
- UI is now shown on screen
👉 Think: Screen appears
---
## 🔹 3. onResume()
- Activity is now **active and interactive**
- User can interact with the app
👉 Think: App is running in foreground
---
## 🔹 4. onPause()
- Activity is partially visible
- Another screen is coming on top
👉 Think: App is temporarily paused
---
## 🔹 5. onStop()
- Activity is completely hidden
- App moves to background
👉 Think: App is not visible
---
## 🔹 6. onDestroy()
- Activity is destroyed completely
- Final cleanup happens
👉 Think: App is closed
---
# 🔄 Lifecycle Flow Diagram
```
onCreate → onStart → onResume → (Running State)
onPause → onStop → onDestroy
```
---
# 📱 Real-Life Example
## Opening WhatsApp:
- App opens → onCreate()
- Screen visible → onStart()
- Chatting → onResume()
## Switching to another app:
- WhatsApp → onPause()
- WhatsApp → onStop()
## Closing app:
- WhatsApp → onDestroy()
---