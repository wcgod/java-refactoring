public class StringCalculator {
    public static int splitAndSum(String text) {
        /* else 제거
        int result = 0; */
        if (text == null || text.isEmpty()) {
            /* result = 0; */
            return 0;
        }
        String[] values = text.split(",|:");
        int[] numbers = toInts(values);
        return sum(numbers);
        /*
        } else {
            String[] values = text.split(",|:");
        */
            /* indent 2인 곳을 refactoring
            for (String value : values) {
                result += Integer.parseInt(value);
            }
            */
        /*
            result = sum(values);
        }
        return result;
        */
    }

    /* 메소드는 한가지 일만 하도록 수정
    private static int sum(String[] values) {
        int result = 0;
        for (String value : values) {
            result += Integer.parseInt(value);
        }
        return result;
    }
    */

    private static int[] toInts(String[] values) {
        int[] numbers = new int[values.length];
        for (int i=0;i < values.length; i++) {
            numbers[i] = Integer.parseInt(values[i]);
        }
        return numbers;
    }

    private static int sum(int[] numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
