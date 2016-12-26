public static int getIntMaxValue() {
    return getIntMaxValue(0);
}

private static int getIntMaxValue(int x) {
    return (x + 1 >= 0)? 1 + getIntMaxValue(x + 1) : 0;
}
