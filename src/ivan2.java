import one.util.streamex.IntStreamEx;
 
public static int getMaxInt() {
    return IntStreamEx.iterate(1, i -> i++)
      .takeWhileInclusive(i -> i + 1 > 0)
      .map(i -> 1)
      .sum();
}
