//작성자 홍주형
//작성일자 2023.09.11
//

import java.util.Scanner;

public class Govillage {


    public void ActMenu() {
        Scanner scanner = new Scanner(System.in);
        GoPub goPub = new GoPub();
        GoSmith goSmith = new GoSmith();
        GoDungeon goDungeon = new GoDungeon();

        while (true) {
            System.out.println("1.펍으로 이동 2.대장간으로 이동 3.던전으로 이동");
            System.out.println("이동할 장소를 선택해 주세요.");
            int select = scanner.nextInt();

            switch (select) {
                case "1":
                    goPub.PubMenu();
                    break;
                case "2":
                    goSmith.SmithMenu;
                    break;
                case "3":
                    goDungeon.DungeonMenu;
                    break;
                default:
                    System.out.println("잘못된 선택지 입니다.");
                    System.out.println("다시 선택해주세요.");
                    break;
            }
        }
    }
}