// 박세진 , 2023.09.11

public class War {
    public void Fight(Charactor c, int i){

        switch (i) {
            case 1 :
                System.out.print("고블린 던전에 입장하였습니다.");
                MonsterManager.getInstance().GoblinList();
                break;
            case 2 :
                System.out.print("오크 던전에 입장하였습니다.");
                MonsterManager.getInstance().OrkList();
                break;
            case 3 :
                System.out.print("나이트 엘프 던전에 입장하였습니다.");
                MonsterManager.getInstance().ElfList();
                break;
            case 4 :
                System.out.print("리치 던전에 입장하였습니다.");
                MonsterManager.getInstance().LastBoss();
                ((Player)c).setMaxHp(50);
                ((Player)c).hpRecovery(50);
                break;
        }

        boolean keep =true;

        while (MonsterManager.getInstance().getMonsterList(0) != null) {
            Monster m = MonsterManager.getInstance().getMonsterList(0);
            while (m.getHp() > 0 && keep) {
                PlayActMenu();
                switch (ScannerManager.Scan()) {
                    case 1:
                        if(c.getSpeed() > m.getSpeed()) {
                            c.Attack(m);
                            m.Attack(c);
                        }
                        else {
                            m.Attack(c);
                            c.Attack(m);
                        }
                    case 2:
                        ((Player) c).Deffence(m);
                        break;
                    case 3:
                        keep = false;
                        break;
                }
            }
            MonsterManager.getInstance().remove();
        }

        if(keep) {
            switch (i) {
                case 1 :
                    GetGold(c,30);
                case 2 :
                    GetGold(c,45);
                case 3 :
                    GetGold(c,60);
            }
        }

    }

    public void PlayActMenu() {
        System.out.println("1.공격하기 ");
        System.out.println("2.막기 ");
        System.out.println("3.도망가기 ");
    }

    public void GetGold(Charactor c,int gold) {
        System.out.println(gold + "골드를 획득하였습니다.");
        ((Player)c).setGold(((Player)c).getGold()+gold);
    }
}
