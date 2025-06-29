package Kiosk;

public class Movie {
    String 제목;
    String 상영시간1;
    String 상영시간2;

    // 생성자
    public Movie(String 제목, String 시간1, String 시간2) {
        this.제목 = 제목;
        this.상영시간1 = 시간1;
        this.상영시간2 = 시간2;
    }

    public String get제목() {
        return 제목;
    }

    public String get상영시간1() {
        return 상영시간1;
    }

    public String get상영시간2() {
        return 상영시간2;
    }

    public void set제목(String 제목) {
        this.제목 = 제목;
    }

    public void set상영시간1(String 시간1) {
        this.상영시간1 = 시간1;
    }

    public void set상영시간2(String 시간2) {
        this.상영시간2 = 시간2;
    }
}

