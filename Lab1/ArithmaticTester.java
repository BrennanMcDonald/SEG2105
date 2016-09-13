public class ArithmaticTester {
    public static void main(String[] args) {
        int[] values = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34, 36, 38};
        ArithmaticSequence seq = new ArithmaticSequence(2, -2);

        // get_next_element() tests
        for (int i = 0; i < values.length; i ++) {
            eql(values[i], seq.get_next_element(), "should get next element");
        }

        // get_prev_element() tests
        for (int i = values.length - 1; i > 0; i --) {
            eql(values[i-1], seq.get_prev_element(), "should get previous element");
        }

        // get_element_by_index() tests
        for (int i = 0; i < values.length; i ++) {
            eql(values[i], seq.get_element_by_index(i + 1), "should get specific element");
        }
    }

    // simple assert runner
    private static void eql(int expected, int given, String message) {
        System.out.format(
            "\u001b[%dm %s %s%s\u001b[39m\n",
            expected == given ? 32 : 31,
            expected == given ? "\u2713" : "x",
            message,
            expected != given ? " (expected " + expected + ", got " + given + ")" : ""
        );
    }
}