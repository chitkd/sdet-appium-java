package lessons.day_12.constant_pool;

public interface UrlSlugs {
    String QA_ENV = "/qa-sdetpro";
    String STAGING_ENV = "/staging-sdetpro";

    String BASE_URL = "https://sdetpro.com";

    static String getQaEnv(){
        return BASE_URL.concat(QA_ENV);
    }

    static void saySth(){
        System.out.println("Hello");
    }
}
