package calculator.models;

public interface Mementable<T> {
    T createMemento();

    void restoreMemento(T memento);
}
