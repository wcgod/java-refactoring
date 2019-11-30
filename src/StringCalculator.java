public class StringCalculator {
    public static int splitAndSum(String text) {
        /* else 제거
        int result = 0; */
        /* 1단계 추상화 과정 compose method 패턴
        if (text == null || text.isEmpty()) {
        */
            /* result = 0; */
        /*
            return 0;
        }
        */
        if (isBlank(text)) {
            return 0;
        }
        /* 로컬변수 필요유무 파악
        String[] values = text.split(",|:");
        int[] numbers = toInts(values);
        return sum(numbers);
        */
        /* 1단계 추상화 과정 compose method 패턴
        return sum(toInts(text.split(",|:")));
        */
        return sum(toInts(split(text)));
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

    private static boolean isBlank(String text) {
        return text == null || text.isEmpty();
    }

    private static String[] split(String text) {
        return text.split(",|:");
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
