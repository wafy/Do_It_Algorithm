public class IntStack {

  private int max; //스택 용량
  private int ptr; //스택 포인터
  private int [] stk; //스택 본체

  public class EmptyInStackException extends RuntimeException {
    public EmptyInStackException() {}
  }

  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() {}
  }

  // 생성자
  public IntStack(int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

  // 스택에 x 를 넣기
  public int push(int x) throws OverflowIntStackException {
    if (ptr >= max) {
      throw new OverflowIntStackException();
    }
    return stk[ptr++] = x;
  }
  // 스택 정상에 있는 데이타 꺼내기
  public int pop() throws EmptyInStackException {
    if (ptr == 0) {
      throw new EmptyInStackException();
    }
    return stk[--ptr];
  }

  // 스택 정상에 있는 데이타를 보기
  public int peek() throws EmptyInStackException {
    if (ptr <=0 ) {
      throw new EmptyInStackException();
    }
    return stk[ptr - 1];
  }

  // 스택에서 x를 찾아 인텍스를 반환 없으면 -1을 반환
  public int indexOf(int x) {
    for (int i= ptr-1; i >=0 ;i--) {
      if (stk[i] == x) {
        return i;
      }
    }
    return -1;
  }

  //스택을 비움
  public void clear() {
    ptr = 0;
  }

  //스택의 용량을 반환
  public int capacity() {
    return max;
  }

  //스택에 쌓여 있는 데아타 수를 반환
  public int size() {
    return ptr;
  }

  //스택이 비어 있는가?
  public boolean isEmpty() {
    return ptr <= 0;
  }
  //스택이 가득 찼는가?
  public boolean isFull() {
    return ptr >= max;
  }

  //스택 안의 모든 데이타를 밑에서 꼭대기 순서로 출력
  public void dump() {
    if (ptr == 0) {
      System.out.println("스택이 비어 있습니다.");
    } else {
      for(int i=0; i < ptr; i++) {
        System.out.println(stk[i]);
      }
    }
  }

}


