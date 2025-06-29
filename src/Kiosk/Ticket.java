package Kiosk;

public class Ticket {
    String 영화제목;
    String 상영시간;
    int 행;
    int 열;
    int 가격;


    public Ticket(String 영화제목, String 상영시간, int 행, int 열, int 가격) {
        this.영화제목 = 영화제목;
        this.상영시간 = 상영시간;
        this.행 = 행;
        this.열 = 열;
        this.가격 = 가격;
    }


    public String get영화제목() {
        return 영화제목;
    }

    public String get상영시간() {
        return 상영시간;
    }

    public int get행() {
        return 행;
    }

    public int get열() {
        return 열;
    }

    public int get가격() {
        return 가격;
    }


    public void set영화제목(String 영화제목) {
        this.영화제목 = 영화제목;
    }

    public void set상영시간(String 상영시간) {
        this.상영시간 = 상영시간;
    }

    public void set행(int 행) {
        this.행 = 행;
    }

    public void set열(int 열) {
        this.열 = 열;
    }

    public void set가격(int 가격) {
        this.가격 = 가격;
    }

    public void 출력() {
        System.out.println("\n=== 티켓 정보 ===");
        System.out.println("영화: " + 영화제목);
        System.out.println("시간: " + 상영시간);
        System.out.println("좌석: " + 행 + "행 " + 열 + "열");
        System.out.println("가격: " + 가격 + "원");
        System.out.println("=================");
    }
}

