//작성자 홍주형
//작성일 2023.09.11
//최종수정일 2023.09.12

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
        if(enemy.getHp() < damage){System.exit(0);}
        else {enemy.setHp(enemy.getHp() - damage);}
        System.out.println(getNickName()+"가"+enemy.getNickName()+"에게"+damage+"만큼 데미지를 주었습니다.");
        System.out.println(enemy.nickName+"의 현재 HP : "+enemy.hp);
    }
}