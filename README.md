AndroLib
========

General purpose Android application library


AndroLib Classes
----------------

### StringUtils ###

Useful functions from org.apache.commons.lang.StringUtils

```java
static boolean endsWith(java.lang.String str, java.lang.String suffix)
static boolean endsWithIgnoreCase(java.lang.String str, java.lang.String suffix)
static boolean isEmpty(java.lang.CharSequence cs)
static boolean isNotEmpty(java.lang.CharSequence cs)
static String padLeft(java.lang.String str, int size)
static String padLeft(java.lang.String str, int size, char padChar)
static String padLeft(java.lang.String str, int size, java.lang.String padStr)
static String padRight(java.lang.String str, int size)
static String padRight(java.lang.String str, int size, char padChar)
static String padRight(java.lang.String str, int size, java.lang.String padStr)
static String removeEnd(java.lang.String str, java.lang.String remove)
static String removeEndIgnoreCase(java.lang.String str, java.lang.String remove)
static String removeFirstN(java.lang.String str, char ch)
static String removeStart(java.lang.String str, java.lang.String remove)
static String removeStartIgnoreCase(java.lang.String str, java.lang.String remove)
static String repeat(char ch, int repeat)
static String repeat(java.lang.String str, int repeat)
static String repeat(java.lang.String str, java.lang.String separator, int repeat)
static boolean startsWith(java.lang.String str, java.lang.String prefix)
static boolean startsWithIgnoreCase(java.lang.String str, java.lang.String prefix)
```

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