package logic;

import organs.Brain;
import organs.Mouth;
import organs.Nose;
import organ.Organ;

public class Logic {
    public Organ organ;
    public Mouth mouth;
    public Nose nose;
    public Brain brain;

    public Logic() {
        organ= new Organ(1250);
        mouth= new Mouth(1250, 7);
        nose= new Nose(1250,"straight");
        brain=new Brain(1250,10);
    }
    public Logic(Organ organ, Mouth mouth, Nose nose,Brain brain) throws NullPointerException{
        this.organ=organ;
        this.mouth=mouth;
        this.nose=nose;
        this.brain=brain;
    }
}
