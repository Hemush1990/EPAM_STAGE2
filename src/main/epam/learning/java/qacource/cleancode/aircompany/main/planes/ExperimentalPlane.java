package qacource.cleancode.aircompany.main.planes;

import qacource.cleancode.aircompany.main.models.ClassificationLevel;
import qacource.cleancode.aircompany.main.models.ExperimentalTypes;

public class ExperimentalPlane extends Plane {

    private final ExperimentalTypes type;
    private ClassificationLevel classificationLevel;

    public ExperimentalPlane(
            String model,
            int maxSpeed,
            int maxFlightDistance,
            int maxLoadCapacity,
            ExperimentalTypes type,
            ClassificationLevel classificationLevel) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.type = type;
        this.classificationLevel = classificationLevel;
    }

    public ClassificationLevel getClassificationLevel() {
        return classificationLevel;
    }

    public void setClassificationLevel(ClassificationLevel classificationLevel) {
        this.classificationLevel = classificationLevel;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "experimentalPlane{" +
                "model='" +
                model + '\'' + '}';
    }
}
