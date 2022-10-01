package lecture.lec14.java;

public enum JavaCountry {
    KOREA("KO"),
    AMERICA("US");

    private final String code;

    JavaCountry(String code) {
        this.code = code;
    }

    private String getCode() {
        return code;
    }

    private static void handleCountry(JavaCountry javaCountry) {
        if (javaCountry == JavaCountry.KOREA) {
            // 로직
        }

        if (javaCountry == JavaCountry.AMERICA) {
            // 로직
        }
    }
}
