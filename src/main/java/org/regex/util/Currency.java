package org.regex.util;

import lombok.extern.slf4j.Slf4j;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Slf4j
public class Currency {

    public static void getUsdToRub() {

        try {
            String text = Jsoup.connect("https://www.cbr.ru/currency_base/daily").get().text();

            Pattern pattern = Pattern.compile("Доллар США\\s\\d{2},\\d{4}");
            Matcher matcher = pattern.matcher(text);

            if (matcher.find()) {
                System.out.println(matcher.group());
            }

        } catch (IOException e) {
            log.error("An exception occurred!", e);
        }
    }
}
