package headOrgans;
import headOrgan.HeadOrgan;
import bodyOrgans.Stomach;

import java.util.ArrayList;

public class Brain extends HeadOrgan {
    private double CPA;
    private ArrayList<String> list = new ArrayList<>();
    public Brain(double m, double cpa) {
        super(m);
        this.CPA = cpa;
    }
    public void manageOrganNoseScratch(Nose nose) {
        nose.scratch(this);
    }
    public void manageOrganNoseSniff(Nose nose) {
        nose.sniff(this);
    }
    public void manageOrganMouthEat(Mouth mouth, Stomach stomach) { mouth.eat(this, stomach); }
    public void manageOrganMouseTalk(Mouth mouth) {
        mouth.talk(this);
    }
    public void manageOrganEarListen (Ear ear) {ear.listen(this);}
    void receiveOrgansData(String data) {
        list.add(data);
    }
    public String getDataList() {
        String arr = list.get(0);
        list.remove(0);
        return arr;
    }
}
