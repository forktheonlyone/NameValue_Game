public abstract class Charactor {
    protected String nickName;
    protected int hp;
    protected int atk;
    protected int def;
    protected int speed;

    public String getNickName() {return nickName;}
    public void setNickName(String nickName) {this.nickName = nickName;}

    public int getHp() {return hp;}
    public void setHp(int hp) {this.hp = hp;}

    public int getAtk() {return atk;}
    public void setAtk(int atk) {this.atk = atk;}

    public int getDef() {return def;}
    public void setDef(int def) {this.def = def;}

    public int getSpeed() {return speed;}
    public void setSpeed(int speed) {this.speed = speed;}

    public abstract void Attack(Charactor enemy);
}
