package com.mango.crawler.constant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class Constant {

    public static String NAVER_URL;
    public static String WEB_DRIVER_KEY;
    public static String WEB_DRIVER_PATH;


    @Value("${const.naver-url}")
    public void setNaverUrl(String NAVER_URL) {
        this.NAVER_URL = NAVER_URL;
    }

    @Value("${const.web-driver-key}")
    public void setWebDriverKey(String WEB_DRIVER_KEY) {
        this.WEB_DRIVER_KEY = WEB_DRIVER_KEY;
    }

    @Value("${const.web-driver-path}")
    public void setWebDriverPath(String WEB_DRIVER_PATH) {
        this.WEB_DRIVER_PATH = WEB_DRIVER_PATH;
    }

}
