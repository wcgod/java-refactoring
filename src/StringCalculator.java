public class StringCalculator {
    public static int splitAndSum(String text) {
        int result = 0;
        if (text == null || text.isEmpty()) {
            result = 0;
        } else {
            String[] values = text.split(",|:");
            /* indent 2인 곳을 refactoring
            for (String value : values) {
                result += Integer.parseInt(value);
            }
            */
            result = sum(values);
        }
        return result;
    }

    private static int sum(String[] values) {
        int result = 0;
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }
}
