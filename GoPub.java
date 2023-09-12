// 작성자 : 송한올
// 2023.09.12
// indev 0.01

import java.util.concurrent.TimeUnit;

public class GoPub {

    public void PubMenu(Charactor chr)
    {
        Player player = new Player(chr.getNickName());
        System.out.println("맥주잔이 부딪히는 소리, 바드의 악기 연주 소리가 들린다.");
        boolean repeat = true;
        while (repeat)
        {
            System.out.println("1. 음식 주문하기 ( 음식을 이용해 체력을 회복하세요. )");
            System.out.println("2. 방을 빌려 침대에서 잠에 들기 ( -15 Gold )");
            System.out.println("3. 마을로 돌아가기");
            switch (ScannerManager.Scan())
            {
                case 1 :
                    System.out.println("1. 빵 ( -3 Gold ) / ( +5 HP )");
                    System.out.println("2. 스튜 ( -6 Gold ) / ( +10 HP )");
                    System.out.println("3. 칠면조 구이 ( -9 Gold ) / ( +15 HP )");
                    foodMenu(chr);
                    break;
                case 2 :
                    if (player.getGold() >= 15) {
                        player.setGold(player.getGold() -15);
                        ((Player) chr).hpRecovery(30);
                        System.out.println("낡은 침대이지만 포근함 만큼은 집을 생각나게 한다.");
                        System.out.println("( 체력을 모두 회복했다! )");
                        break;
                    }
                    else
                    {
                        System.out.println("골드가 부족합니다.");
                        break;
                    }
                case 3 :
                    System.out.println("마을로 돌아간다.");
                    repeat = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;

            }
        }
    }

    private void foodMenu(Charactor chr)
    {
        Player player = new Player(chr.getNickName());
        switch (ScannerManager.Scan())
        {
            case 1 :
                if ((player.getGold() >= 3))
                {
                    player.setGold(player.getGold() -3);
                    System.out.println("퍽퍽하고 단순한 밀빵이다.");
                    ((Player)chr).hpRecovery(5);
                    System.out.println("5 HP 회복 완료! 현재 HP : " + chr.getHp());
                    break;
                }
                else
                {
                    System.out.println("골드가 부족합니다.");
                    break;
                }
            case 2 :
                if ((player.getGold() >= 6))
                {
                    player.setGold(player.getGold() -6);
                    System.out.println("옥수수가 들어간 따뜻한 스튜다.");
                    ((Player)chr).hpRecovery(10);
                    System.out.println("10 HP 회복 완료! 현재 HP : " + chr.getHp());
                    break;
                }
                else
                {
                    System.out.println("골드가 부족합니다.");
                    break;
                }
            case 3 :
                if ((player.getGold() >= 9))
                {
                    System.out.println("머리 없이 통으로 구워진 칠면조다.");
                    player.setGold(player.getGold() -9);
                    ((Player)chr).hpRecovery(15);
                    System.out.println("15 HP 회복 완료! 현재 HP : " + chr.getHp());
                    break;
                }
                else
                {
                    System.out.println("골드가 부족합니다.");
                    break;
                }
        }
    }
}
