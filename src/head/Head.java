package head;

import organs.Brain;
import organs.Mouth;
import organs.Nose;
import organ.Organ;

import java.util.List;
import java.util.ArrayList;


public class Head {
    private List<Organ> organs;
    public Head (Brain brain, Nose nose, Mouth mouth) throws NullPointerException {
        if (brain == null || nose == null || mouth == null) {
            throw new NullPointerException("Weight of organ can't be less than 0 or such as 0");
        }
        this.organs = new ArrayList<>();
        organs.add(brain);
        organs.add(nose);
        organs.add(mouth);
    }
}

