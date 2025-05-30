package _30_Singleton.AppConfig;

import lombok.Data;

// Getter, Setter, toString, EqualsAndHashCode, RequiredArgsConstructor
@Data // 자주 쓰는 시그니처 패키지
public class AppConfig {
    private static AppConfig instance;

    private String apikey;
    private String appMode;

    private AppConfig () {
        this.apikey = "DEFAULT-KEY";
        this.appMode = "PRODUCTION";
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance;
    }
}
