# Selenium-android-poc


install appium

```
npm install -g appium
```

```
which appium 
```

```
appium --allow-cors
```

```
appium driver install uiautomator2@2.0.1
```

- download appium desktop to inspect elements:
```
https://github.com/appium/appium-desktop/releases
```


once you download it, you should add this information in the desired capabilities:
```
    {
  "platformName": "Android",
  "appium:deviceName": "Pixel_4",
  "appium:app": "path/to/apk/app-debug.apk",
  "appium:automationName": "UiAutomator2"
}
```


Apk: https://drive.google.com/file/d/1mypWQWvqfVm5VM4hCPlkwzUkWjuTh5MS/view?usp=sharing


