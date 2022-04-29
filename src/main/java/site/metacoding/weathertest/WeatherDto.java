package site.metacoding.weathertest;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class WeatherDto {
    private Response response;

    @AllArgsConstructor
    @NoArgsConstructor
    @Data
    public class Response {
        private Header header;
        private Body body;

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public class Header {
            private String resultCode;
            private String resultMsg;
        }

        @AllArgsConstructor
        @NoArgsConstructor
        @Data
        public class Body {
            private String dataType;
            private Integer pageNo;
            private Integer numOfRows;
            private Integer totalCount;
            private Items items;

            @AllArgsConstructor
            @NoArgsConstructor
            @Data
            public class Items {
                private List<Content> item;

                @AllArgsConstructor
                @NoArgsConstructor
                @Data
                public class Content {
                    private String tm; // 예보시각
                    private String thema; // 테마
                    private String courseId; // 코스ID
                    private String courseAreaId; // 코스 지역ID
                    private String courseAreaName; // 코스 지역이름
                    private String courseName; // 코스명
                    private Integer spotAreaId; // 관광지 지역ID
                    private String spotAreaName; // 관광지 지역이름
                    private String spotName; // 관광지명
                    private Integer th3; // 일 3시간 기온
                    private Integer wd; // 풍향
                    private Integer ws; // 풍속
                    private Integer sky; // 하늘상태
                    private Integer rhm; // 습도
                    private Integer pop; // 강수확률
                }
            }
        }
    }
}
