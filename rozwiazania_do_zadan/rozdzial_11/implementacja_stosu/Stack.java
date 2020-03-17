class StackEmptyException extends RuntimeException {}
class StackFullException extends RuntimeException {}

public class Stack {
  private int[] values;
  private int currentSize;

  public Stack(int size) {
    if (size < 0) {
      throw new IllegalArgumentException("size musi byc >= 0");
    }
    this.values = new int[size];
  }

  public void push(int value) {
    if (currentSize == values.length) {
      throw new StackFullException();
    }
    values[currentSize++] = value;
  }

  public int pop() {
    if (currentSize == 0) {
      throw new StackEmptyException();
    }
    return values[--currentSize];
  }

  public int top() {
    if (currentSize == 0) {
      throw new StackEmptyException();
    }
    return values[currentSize - 1];
  }

  public int size() {
    return currentSize;
  }

  public void clear() {
    currentSize = 0;
  }
}
