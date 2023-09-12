// 박세진 , 2023.09.11

public class GoDungeon {

    public void DungeonMenu() {
        System.out.println("1.고블린 던전 ");
        System.out.println("2.오크 던전 ");
        System.out.println("3.엘프 던전 ");
        System.out.println("4.리치 던전 ");
        System.out.println("5.돌아가기 ");
    }
    public void Update(War war,Charactor c) {
        DungeonMenu();
        switch (ScannerManager.Scan()) {
            case 1:
                war.GoblinD(c);
                break;
            case 2:
                war.OrkD(c);
                break;
            case 3:
                war.ElfD(c);
                break;
            case 4:
                war.LichD(c);
                System.out.println("Game Clear!!!");
                System.exit(0);
                break;
            case 5:
                break;
            default:
                System.out.println("그런 번호는 없습니다.");
                break;
        }
    }
}
