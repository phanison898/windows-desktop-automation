# Windows Desktop Automation framework

### Installations

1. WinAppDriver (Enable Windows developer tools)
2. Windows Inspector (In order to inspect the locators)

### Key points

1. WinAppDriver won't support W3C protocal. So need to use old versions of Selenium and Appium
2. Selenium (v3) : 3.141.59
3. Appium (v7) : 7.6.0

### Capabilities

```java
    MutableCapabilities cap = new MutableCapabilities();
	cap.setCapability("platformName", "WINDOWS");
	cap.setCapability("deviceName", "WINDOWS");
	cap.setCapability("automationName", "WINDOWS");
	cap.setCapability("driverType", "WINDOWS");
	cap.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
	cap.setCapability("ms:waitForAppLaunch", "5");
	cap.setCapability("ms:experimental-webdriver", false);
```
