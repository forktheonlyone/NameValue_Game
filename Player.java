//작성자 배준혁
//작성일 2023.09.11
//최종수정일 2023.09.12
public class Player extends Charactor{
    int gold;
    int maxHp;

    public int getGold() {return gold;}
    public void setGold(int gold) {this.gold = gold;}

    public int getMaxHp() {return maxHp;}
    public void setMaxHp(int maxHp) {this.maxHp = maxHp;}

    public Player(String nickName) {
        super.nickName = nickName;
        hp = 30;
        atk = 2;
        def = 0;
        speed = 10;
        gold = 0;
        maxHp = 30;
    }

    @Override
    public void Attack(Charactor enemy) {
        int dmg = atk - super.def;
        if(dmg<1){
            dmg=1;
        }
        if(enemy.getHp() < super.atk){
            enemy.setHp(0);
        }
        else{
            enemy.setHp(enemy.getHp() - super.atk);
        }
        System.out.print(nickName + "(이)가 " + enemy.nickName + "에게 "
                + dmg + "만큼 데미지를 주었습니다. ");
        System.out.println(enemy.nickName + "의 현재 HP : " + enemy.hp);
    }

    public void Deffence(Charactor enemy){
        int dmg = (enemy.atk - def + 1)/2;
        if(dmg<1){
            dmg=1;
        }
        System.out.print(enemy.nickName + "(이)가 " + nickName + "에게 "
                + dmg + "만큼 데미지를 주었습니다. ");
        if(hp > dmg){
            hp -= dmg;
        }
        else{
            System.out.println(nickName + "의 현재 HP : 0 ");
            System.out.println("당신은 " + enemy.nickName + "에게 죽임당했습니다. "
                    + nickName + "의 시야가 어두워지며, 세계에 멸망이 도래합니다. ");
            System.exit(0);
        }
        System.out.println(nickName + "의 현재 HP : " + hp);
    }

    public void hpRecovery(int recover){
        int reHp = hp + recover;
        if(reHp>maxHp){
            reHp=maxHp;
        }
        hp = reHp;
        System.out.print(nickName + "(이)가 Hp를 "
                + recover + "만큼 회복했습니다. ");
        System.out.println(nickName + "의 현재 HP : " + hp);
    }
}
