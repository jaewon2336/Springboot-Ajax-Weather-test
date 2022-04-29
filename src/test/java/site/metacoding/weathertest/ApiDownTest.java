package site.metacoding.weathertest;

import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

public class ApiDownTest {

    @Test
    public void test() {
        RestTemplate rt = new RestTemplate();

        String url = "https://apis.data.go.kr/1360000/TourStnInfoService/getTourStnVilageFcst?serviceKey=090tbpV1s%2F%2F2YJxMEkGWsGycvC6GQRKrIXFNzkv44vZejXWfuwu0yzNcVUOUEnn5QgU9fXb9yuJfArubBmvWpg%3D%3D&pageNo=1&numOfRows=10&dataType=JSON&CURRENT_DATE=2019122010&HOUR=24&COURSE_ID=1";

        String body = rt.getForObject(url, String.class);
        System.out.println("=============================");
        System.out.println(body);
    }
}
