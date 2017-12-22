package doom.config;

public enum TextColor {
    ANSI_RESET("\u001B[0m"),
    ANSI_RED("\u001B[31m"),
    ANSI_GREEN("\u001B[32m"),;

    private final String value;

    TextColor(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}