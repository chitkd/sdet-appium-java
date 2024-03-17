package lessons.day_13;

public enum PlatformType {
    IOS("ios", "17.0"),
    ANDROID_34_0("Android", "34.0");

    private String platform;
    private String version;

    PlatformType() {
    }

    PlatformType(String platform, String version) {
        this.platform = platform;
        this.version = version;
    }


}
