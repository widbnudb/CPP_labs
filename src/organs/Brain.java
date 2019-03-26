package organs;
import organ.Organ;

import java.util.ArrayList;

public class Brain extends Organ {
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
    public void manageOrganMouthEat(Mouth mouth) {
        mouth.eat(this);
    }
    public void manageOrganMouseTalk(Mouth mouth) {
        mouth.talk(this);
    }
    void receiveOrgansData(String data) {
        list.add(data);
    }
    public String getDataList() {
        String arr = list.get(0);
        list.remove(0);
        return arr;
    }
}
