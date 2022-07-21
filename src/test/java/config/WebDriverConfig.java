package config;

import org.aeonbits.owner.Config;

import java.net.URL;


@Config.Sources("classpath:local.properties")
public interface WebDriverConfig extends Config {
    @Key("browser.baseURL")
    @DefaultValue("https://voronezh.hh.ru/")
    String getBaseURL();


    @Key("browser.name")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browser.version")
        //  @DefaultValue("103")
    String getBrowserVersion();

    @Key("remote.url")
    URL getRemoteUrl();

    @Key("remote.webdriver")
    String getRemoteDriver();
}
