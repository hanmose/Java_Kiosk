package Kiosk;

import java.util.Scanner;

public class KioskSystem {
    Scanner scanner = new Scanner(System.in);

    Movie movie1 = new Movie("드래곤길들이기", "10:00", "13:00");
    Movie movie2 = new Movie("주토피아", "11:00", "14:00");
    Movie movie3 = new Movie("레버넌트", "12:00", "15:00");
    Theater theater = new Theater();
    int 가격 = 10000;

    public void start() {
        System.out.println("=== 영화관 키오스크 ===");

        // 영화 선택
        System.out.println("\n[영화 목록]");
        System.out.println("1. " + movie1.get제목());
        System.out.println("2. " + movie2.get제목());
        System.out.println("3. " + movie3.get제목());
        System.out.print("영화를 선택하세요 (1~3): ");
        int 선택 = scanner.nextInt();

        Movie 선택한영화;
        if (선택 == 1) 선택한영화 = movie1;
        else if (선택 == 2) 선택한영화 = movie2;
        else 선택한영화 = movie3;

        // 시간 선택
        System.out.println("\n[상영 시간]");
        System.out.println("1. " + 선택한영화.get상영시간1());
        System.out.println("2. " + 선택한영화.get상영시간2());
        System.out.print("시간을 선택하세요 (1~2): ");
        int 시간선택 = scanner.nextInt();
        String 선택한시간 = (시간선택 == 1) ? 선택한영화.get상영시간1() : 선택한영화.get상영시간2();

        // 좌석 선택
        int 행, 열;
        while (true) {
            theater.좌석출력();
            System.out.print("좌석 행 선택 (1~5): ");
            행 = scanner.nextInt() - 1;
            System.out.print("좌석 열 선택 (1~5): ");
            열 = scanner.nextInt() - 1;
            if (theater.좌석예약(행, 열)) break;
            System.out.println("이미 예약된 좌석입니다.");
        }

        Ticket ticket = new Ticket(선택한영화.get제목(), 선택한시간, 행 + 1, 열 + 1, 가격);
        ticket.출력();
    }
}