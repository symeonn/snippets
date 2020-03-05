package pl.bymario.interfaces;

public class ConcreteWithFields implements WithFieldsInterface {

    @Override
    public int getFieldA() {
        return fieldA;
    }

    @Override
    public String getFieldB() {
        return fieldB;
    }
}
