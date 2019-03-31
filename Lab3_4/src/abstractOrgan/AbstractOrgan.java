package abstractOrgan;

public class AbstractOrgan {
    double AbstractMass;
    public AbstractOrgan (double massTemp) {
        AbstractMass = massTemp;
    }

    public double getAbstractMass() {
        return AbstractMass;
    }

    public void setAbstractMass(double AbstractMass) {
        this.AbstractMass = AbstractMass;
    }
}
