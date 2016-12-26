# howToGetMAXINT
cannot get maxint? cuz' we can help u

just scroll down

![mda](https://pp.vk.me/c636726/v636726081/41e51/4d-PugicBHU.jpg)

* src/andrej.java
```java
public static int getIntMaxValue() {
    return getIntMaxValue(0);
}

private static int getIntMaxValue(int x) {
    return (x + 1 >= 0)? 1 + getIntMaxValue(x + 1) : 0;
}
```

* src/ivan1.java
```java
int getMaxInt() { return ~(1«31); }
```

* src/ivan2.java
```java
import one.util.streamex.IntStreamEx;
 
public static int getMaxInt() {
    return IntStreamEx.iterate(1, i -> i++)
      .takeWhileInclusive(i -> i + 1 > 0)
      .map(i -> 1)
      .sum();
}
```

* src/substancia1.java
```java
public static int getIntMaxValue() {
while (1 == 1) {
int old = i;
i++;
if (i >= 0) {
i = old;
break;
}
}
return i;
}

// pls no spaces
```

* src/substancia2.scala
```scala
def getMaxInt() {
  val (maxint, _) = Stream.continually(())
    .zipWithIndex
    .map {
      case (_, i) => (i, i + 1)
    }
    .takeWhile {
      case (c, p) => p > 0
    }
    .last
  maxint
}
```

* src/vlados1.d
```d
// fully rewrited by substancia
 
int getMaxInt() {
  return (cast(uint)(0 - 1)) / 2;
}
```

