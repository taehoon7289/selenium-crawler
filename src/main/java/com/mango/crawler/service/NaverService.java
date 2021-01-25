package com.mango.crawler.service;

import com.mango.crawler.constant.Constant;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class NaverService {

    public String getMain() {

        //System Property SetUp
        System.setProperty(Constant.WEB_DRIVER_KEY, Constant.WEB_DRIVER_PATH);

        WebDriver driver = new ChromeDriver();
        String url = Constant.NAVER_URL;
        String pageStr = "";
        try {
            driver.get(url);
            pageStr = driver.getPageSource();
        } finally {
            driver.close();
        }
        return pageStr;
    }

}
