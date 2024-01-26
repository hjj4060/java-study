package 자바의정석.Ch12_지네릭스;

public class BoxGenerics<T> {
    T item;

    void setItem(T item) {
        this.item = item;
    }

    T getItem() {
        return item;
    }
}
