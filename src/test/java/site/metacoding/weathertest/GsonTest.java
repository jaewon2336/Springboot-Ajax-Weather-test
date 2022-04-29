package site.metacoding.weathertest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import com.google.gson.Gson;

import org.junit.jupiter.api.Test;

public class GsonTest {

    @Test
    public void gsonTest() {
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=090tbpV1s%2F%2F2YJxMEkGWsGycvC6GQRKrIXFNzkv44vZejXWfuwu0yzNcVUOUEnn5QgU9fXb9yuJfArubBmvWpg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&CURRENT_DATE=2019122010&HOUR=24&COURSE_ID=1");
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            Gson gson = new Gson();
            WeatherDto weatherDto = gson.fromJson(responseJson, WeatherDto.class);

            System.out.println(weatherDto.getResponse().getBody().getItems().getItem().size());
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Test
    public void test() {
        try {
            URL url = new URL(
                    "https://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=090tbpV1s%2F%2F2YJxMEkGWsGycvC6GQRKrIXFNzkv44vZejXWfuwu0yzNcVUOUEnn5QgU9fXb9yuJfArubBmvWpg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&CURRENT_DATE=2019122010&HOUR=24&COURSE_ID=1");
            HttpsURLConnection conn = (HttpsURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // Gson gson = new Gson();
            // WeatherDto weatherDto = gson.fromJson(responseJson, WeatherDto.class);

            System.out.println(responseJson.toString());

        } catch (Exception e) {
            e.getMessage();
        }
        System.out.println("꽝");
    }
}
