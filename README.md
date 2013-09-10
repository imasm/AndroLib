AndroLib
========

General purpose Android application library


AndroLib Classes
----------------
### ULog - Unified Log ###

Based on a Jeffrey Blattman post
http://zerocredibility.wordpress.com/2012/03/08/android-advanced-logger/


Initialize log level:

```java
//Extend Application class and initialize log level
public class MyApplication extends Application {

    @Override public void onCreate() {
        ULog.setTag("ApplicationName");
        ULog.setLevel(ALog.Level.D);
    }
}
```

Usage:

```java
ULog.w("A problem occurred when i %s and then also at %s", msg1, msg2);
```