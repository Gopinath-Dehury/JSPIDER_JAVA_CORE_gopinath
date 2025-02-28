class Test1 {
    public static void main(String[] args) {
        double d = 12.5d; // 'd' is optional but recommended for clarity
        float f = 12.5f; // 'f' is required
        // Java treats all decimal literals (e.g., 12.5) as double by default, which has
        // 64-bit precision. However, float is 32-bit, so assigning a double to a float
        // directly without explicit casting or an f suffix would cause a compilation
        // error.

    }
}
