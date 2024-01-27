package 자바의정석.Ch12_지네릭스;

public class MultipleTypeParameter<T1, T2, T3, T4> {
    private T1 value1;
    private T2 value2;
    private T3 value3;
    private T4 value4;

    MultipleTypeParameter(T1 value1, T2 value2, T3 value3, T4 value4) {
        this.value1 = value1;
        this.value2 = value2;
        this.value3 = value3;
        this.value4 = value4;
    }
}
