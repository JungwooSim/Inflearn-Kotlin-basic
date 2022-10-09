package study.lec05.ja;

public class Main {
    public static void main(String[] args) {

    }

    private void validateScoreIsNotNegative(int score) {
        if (score < 0) {
            throw new IllegalArgumentException(String.format("%s는 0보다 작을 수 없다.", score));
        }
    }

    private String getPassOrFail(int score) {
        if (score >= 50) {
            return "P";
        } else {
            return "F";
        }
    }

    private String getGrade(int score) {
        if (score >= 90) {
            return "A";
        } else if(score >= 80) {
            return "B";
        } else if (score >= 70) {
            return "C";
        } else {
            return "D";
        }
    }

    private void validate(int score) {
        if (0 <= score && score <= 100) {
            System.out.println("ok");
        }
    }

    private String getGradeWithSwitch(int score) {
        switch (score / 10) {
            case 9: return "A";
            case 8: return "B";
            case 7: return "C";
            default: return "D";
        }
    }

    private boolean startsWithA(Object obj) {
        if (obj instanceof String) {
            return ((String) obj).startsWith("A");
        } else {
            return false;
        }
    }

    private void judgeNumber(int number) {
        if (number == 1 || number == 0 || number == -1) {
            System.out.println("OK");
        } else {
            System.out.println("NO");
        }
    }

    private void judgeNumber2(int number) {
        if (number == 0) {
            System.out.println("is 0");
            return;
        }

        if (number % 2 == 0) {
            System.out.println("짝수");
            return;
        }

        System.out.println("홀수");
    }
}
