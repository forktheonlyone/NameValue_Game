import java.util.ArrayList;
import java.util.List;

public class Monster extends Charactor {

    public Monster (String nickName, int hp, int atk, int def, int speed) {
        this.nickName=nickName;
        this.hp=hp;
        this.atk=atk;
        this.def=def;
        this.speed=speed;
    }

    @Override
    public void Attack(Charactor enemy) {
        int damage = atk - enemy.def;
        if(damage<1){damage=1;}
        if(enemy.getHp() < damage){enemy.setHp(0);}
        else {enemy.setHp(enemy.getHp() - damage);}
        System.out.println(getNickName()+"가"+enemy.getNickName()+"에게"+damage+"만큼 데미지를 주었습니다.");
        System.out.println(enemy.nickName+"의 현재 HP : "+enemy.hp);
    }

    private List<Monster> monsterList = new ArrayList<>();

    public Monster getMonsterList(int i) {
        return monsterList.get(i);
    }

    protected void MonsterList()
    {


        // Monster creation
        monsterList.add(new Monster("고블린", 10, 1, 0, 9));
        monsterList.add(new Monster("고블린", 10, 1, 0, 9));
        monsterList.add(new Monster("고블린보스", 14, 2, 0, 9));
        monsterList.add(new Monster("오크", 12, 3, 0, 9));
        monsterList.add(new Monster("오크", 12, 3, 0, 9));
        monsterList.add(new Monster("오크보스", 26, 4, 0, 9));
        monsterList.add(new Monster("나이트엘프정찰병", 12, 5, 0, 9));
        monsterList.add(new Monster("나이트엘프정찰병", 12, 5, 0, 9));
        monsterList.add(new Monster("나이트엘프네임드", 15, 7, 0, 9));
        monsterList.add(new Monster("나이트엘프보스", 20, 8, 0, 9));
        monsterList.add(new Monster("리치왕 아서스 메놀드", 92, 9, 1, 11));






    /*    // Get a specific monster from the list and use it
        Monster specificMonster = monsterList.get(1); // Get the second monster in the list (Goblin)

        System.out.println(specificMonster.getNickName() + " was retrieved from the list.");*/
    }


}
/*
    public void printInfo() {
        System.out.println("=====================");
        System.out.println("     몬스터 정보창     ");
        System.out.println(" 플레이어 이름 : "+getNickName());
        System.out.println(" 체력 : "+getHp());
        System.out.println(" 공격력 : "+ getAtk());
        System.out.println(" 방어력 : "+ getDef());

        System.out.println("=====================");
    }
*/