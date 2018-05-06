# CalendarX-Android
Android Library for custom CalendarView

Usage
-----

Include `CalendarX` in your layout XML.

```xml
<com.example.calendar_x_main.CalendarX
        android:id="@+id/calendar_view"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" 
      />
```


Download
--------

Add it in your root build.gradle at the end of repositories:
```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

And Add the dependency:
```
dependencies {
	        implementation 'com.github.ChathuminaVimukthi:CalendarX-Android:0.1.0'
	}
```
