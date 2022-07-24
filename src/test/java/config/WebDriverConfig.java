package config;

import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources(
        "classpath:${host}.properties"
)
public interface WebDriverConfig extends Config {

    @Key("browser.baseURL")
    @DefaultValue("https://voronezh.hh.ru/")
    String getBaseURL();

    @Key("browser.name")
   @DefaultValue("FIREFOX")
    String getBrowser();

    @Key("browser.version")
    @DefaultValue("102")
    String getBrowserVersion();

    @Key("remote.url")
    @DefaultValue("https://user1:1234@selenoid.autotests.cloud/wd/hub")
    URL getRemoteUrl();
}
