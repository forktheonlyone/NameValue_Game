// 작성자 : 송한올
// 23.09.12

public class GoSmith {

    public void SmithMenu(Charactor chr)
    {
        ScannerManager.Initialize();
        System.out.println("용암의 열기가 느껴지는 대장간이다.");
        System.out.println("철이 부딪히는 소리가 반복적으로 들려온다.");
        System.out.println("대장장이 : 도움이 필요한가?");

        Player player = new Player(chr.getNickName());
        if (chr.getAtk() == 2 || chr.getDef() == 0)
        {
            System.out.println("1. 검을 강화 ( -50 Gold )");
            System.out.println("2. 방어구를 강화 ( -30 Gold )");
            System.out.println("3. 마을로 돌아간다.");
            ScannerManager.Initialize();
            switch (ScannerManager.Scan())
            {
                case 1 :
                    if(player.getGold() >= 50)
                    {
                        player.setGold(player.getGold() -50);
                        player.setAtk(4);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                case 2 :
                    if(player.getGold() >= 30)
                    {
                        player.setGold(player.getGold() -30);
                        player.setDef(1);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                case 3 :

            }
        }
        else if (chr.getAtk() == 4 || chr.getDef() == 1)
        {
            System.out.println("1. 검을 강화한다. ( -100 Gold )");
            System.out.println("2. 방어구를 강화한다. ( -60 Gold )");
            ScannerManager.Initialize();
            switch (ScannerManager.Scan())
            {
                case 1 :
                    if(player.getGold() >= 100)
                    {
                        player.setGold(player.getGold() -100);
                        player.setAtk(6);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                case 2 :
                    if(player.getGold() >= 60)
                    {
                        player.setGold(player.getGold() -60);
                        player.setDef(2);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
            }
        }
        else if (chr.getAtk() == 6 || chr.getDef() == 2)
        {
            System.out.println("1. 검을 강화한다. ( -150 Gold )");
            System.out.println("2. 방어구를 강화한다. ( -90 Gold )");
            ScannerManager.Initialize();
            switch (ScannerManager.Scan())
            {
                case 1 :
                    if(player.getGold() >= 150)
                    {
                        player.setGold(player.getGold() -150);
                        player.setAtk(8);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
                case 2 :
                    if(player.getGold() >= 90)
                    {
                        player.setGold(player.getGold() -90);
                        player.setDef(3);
                        System.out.println("강화에 성공하셨습니다!");
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                    }
            }
        }
        else
        {
            System.out.println("대장장이 : 내 능력으론 더 이상 강화가 불가능하네.");
        }
    }
}