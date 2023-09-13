public class StartGame {
    public static void main(String[] args) {

        ScannerManager.Initialize();
        Charactor charactor = new Player(ScannerManager.ScanName());
        GoPub goPub = new GoPub();
        GoSmith goSmith = new GoSmith();
        GoDungeon goDungeon = new GoDungeon();
        Govillage start = new Govillage();
        start.ActMenu(charactor,goPub,goSmith,goDungeon);

    }
}
