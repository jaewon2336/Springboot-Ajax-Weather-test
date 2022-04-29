package site.metacoding.weathertest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherApiController {

    @RequestMapping(value = "/weather/{courseId}", method = RequestMethod.GET, produces = "application/json; charset=UTF8")
    public String main(@PathVariable String courseId) {
        try {
            URL url = new URL(
                    "http://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=090tbpV1s%2F%2F2YJxMEkGWsGycvC6GQRKrIXFNzkv44vZejXWfuwu0yzNcVUOUEnn5QgU9fXb9yuJfArubBmvWpg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&CURRENT_DATE=2019122010&HOUR=24&COURSE_ID="
                            + courseId);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(), "utf-8"));

            String responseJson = br.readLine();
            // Gson gson = new Gson();
            // WeatherDto weatherDto = gson.fromJson(responseJson, WeatherDto.class);

            // System.out.println(responseJson.toString());

            return responseJson.toString();

        } catch (Exception e) {
            e.getMessage();
        }
        return "/main";
    }
}
