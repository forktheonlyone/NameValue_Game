public class GoPub {

    public void PubMenu(Charactor chr)
    {
        ScannerManager.Initialize();
        System.out.println("맥주잔이 부딪히는 소리, 바드의 악기 연주 소리가 들린다.");
        boolean repeat = true;
        while (repeat)
        {
            System.out.println("0. 음식 주문하기");
            System.out.println("( 음식을 이용해 체력을 회복하세요. )");
            System.out.println("1. 방을 빌려 침대에서 잠에 들기 - 15 Gold ");
            System.out.println("2. 돌아가기");
            switch (ScannerManager.Scan())
            {
                case 0 :
                    System.out.println("0. 빵 - 3 Gold");
                    System.out.println("( + 5 HP ");
                    System.out.println("1. 스튜 - 6 Gold");
                    System.out.println("( + 10 HP ");
                    System.out.println("2. 익힌 칠면조 - 9 Gold");
                    System.out.println("( + 15 HP ");
                    food(chr);
                    break;
                case 1 :
                    ((Player)chr).hpRecovery(30);
                    break;
                case 2 :
                    repeat = false;
                    break;

                default:
                    System.out.println("잘못 입력하셨습니다.");
                    break;

            }
        }
    }

    private void food(Charactor chr)
    {
        switch (ScannerManager.Scan())
        {
            case 0 :
                ((Player)chr).hpRecovery(5);
                System.out.println("5 HP 회복 완료! 현재 HP : " + chr.getHp());
            case 1 :
                ((Player)chr).hpRecovery(10);
                System.out.println("10 HP 회복 완료! 현재 HP : " + chr.getHp());
            case 2 :
                ((Player)chr).hpRecovery(15);
                System.out.println("15 HP 회복 완료! 현재 HP : " + chr.getHp());
        }
    }
}
