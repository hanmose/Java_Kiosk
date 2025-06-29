package Kiosk;

public class Theater {
    boolean[][] 좌석 = new boolean[5][5];

    public Theater() {
        int 랜덤예약수 = (int)(Math.random() * 6) + 5;

        for (int i = 0; i < 랜덤예약수; i++) {
            int 행 = (int)(Math.random() * 5);
            int 열 = (int)(Math.random() * 5);
            좌석[행][열] = true;
        }
    }

    public boolean 좌석예약(int 행, int 열) {
        if (행 < 0 || 행 >= 5 || 열 < 0 || 열 >= 5) return false;
        if (좌석[행][열]) return false;
        좌석[행][열] = true;
        return true;
    }

    public void 좌석출력() {
        System.out.println("\n[좌석 상태] (O: 비어있음, X: 예약됨)");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(좌석[i][j] ? " X " : " O ");
            }
            System.out.println();
        }
    }
}


