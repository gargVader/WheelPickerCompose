# WheelPickerCompose [![](https://jitpack.io/v/commandiron/WheelPickerCompose.svg)](https://jitpack.io/#commandiron/WheelPickerCompose) <a href="https://android-arsenal.com/api?level=21"><img alt="API" src="https://img.shields.io/badge/API-21%2B-brightgreen.svg?style=flat"/></a>

Add Wheel Date - Time Picker in Android Jetpack Compose.

<img src="art/wheel_picker_compose_cover.png"> 

## Usage
|Picker|Usage|
|------|-----|
|<img src="https://user-images.githubusercontent.com/50905347/201921058-82c7813d-b9c4-448c-a296-62465845152d.gif" width="256" height="256">|```WheelDateTimePicker { snappedDateTime -> }```|
|<img src="https://user-images.githubusercontent.com/50905347/201921069-14a8410b-5952-4130-80b0-71f9ca286a93.gif" width="256" height="256">|```WheelDatePicker { snappedDate -> }```|
|<img src="https://user-images.githubusercontent.com/50905347/201921066-b94b9fcd-c447-4b01-833f-03600e20ed44.gif" width="256" height="256">|```WheelTimePicker { snappedTime -> }```|
|<img src="https://user-images.githubusercontent.com/50905347/205661315-2eac971a-2dd9-41dc-93e7-de2be0514a9e.gif" width="256" height="256">|```WheelTimePicker(timeFormat = TimeFormat.AM_PM) { snappedTime -> }```|

## Features

<table>
<tr>
<td>
            
```kotlin  
WheelDateTimePicker(
    startDateTime = LocalDateTime.of(
        2025, 10, 30, 5, 0
    ),
    yearsRange = IntRange(1950, 2050),
    size = DpSize(200.dp, 100.dp),
    rowCount = 5,
    backwardsDisabled = true,
    textStyle = MaterialTheme.typography.titleSmall,
    textColor = Color(0xFFffc300),
    selectorProperties = WheelPickerDefaults.selectorProperties(
        enabled = true,
        shape = RoundedCornerShape(0.dp),
        color = Color(0xFFf1faee).copy(alpha = 0.2f),
        border = BorderStroke(2.dp, Color(0xFFf1faee))
    )
){ snappedDateTime -> }
```
</td>
<td>  
    
<img src="https://user-images.githubusercontent.com/50905347/201922097-86422287-cbd7-40ab-bf3c-5e0475828976.gif" width="256" height="256">
    
</td>
</tr>
</table>

## Setup
1. Open the file `settings.gradle` (it looks like that)
```groovy
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        // add jitpack here 👇🏽
        maven { url 'https://jitpack.io' }
       ...
    }
} 
...
```
2. Sync the project
3. Add dependency
```groovy
dependencies {
    implementation 'com.github.commandiron:WheelPickerCompose:1.1.8'
}
```
4. < API 26 (optional)
```groovy
compileOptions {
    coreLibraryDesugaringEnabled true
    //
}
//
dependencies {
    //
    coreLibraryDesugaring "com.android.tools:desugar_jdk_libs:1.1.6"
}
```

## Todo ✔️
   * seamless text alpha animation ✔️
   * add row count gif ❌
