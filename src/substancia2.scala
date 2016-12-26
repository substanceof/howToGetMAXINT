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
