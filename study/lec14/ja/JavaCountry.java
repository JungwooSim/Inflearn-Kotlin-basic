package study.lec14.ja;

public enum JavaCountry {
  KOREA("KO"),
  AMEICA("US");

  private final String code;

  JavaCountry(String code) {
    this.code = code;
  }

  public String getCode() {
    return code;
  }
}
