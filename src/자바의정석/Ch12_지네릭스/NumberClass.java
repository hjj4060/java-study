package 자바의정석.Ch12_지네릭스;

public class NumberClass<T extends Number> {
    T numberValue;

    public NumberClass(T numberValue) {
        this.numberValue = numberValue;
    }

    public T getNumberValue() {
        return numberValue;
    }

    public <T extends Number> String genericMethod() {
        String ss = "dd";

        return ss;
    }
}