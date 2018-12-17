public class MyLinkedList{
   private int size;
   private Node start,end;


public MyLinkedList(){
  size = 0;
}

public int size(){
  return size;
}

public boolean add(int value){
  if(start == null){
    start = new Node(value);
    end = new Node(value);
    return true;
  }
  Node x = new Node(value);
  end.setNext(x);
  end = x;
  return true;
}

public String toString(){
  String ans = "[";
Node n = start;
while(n != end){
  ans += n;
  ans += ", ";
  n = n.next();
}
ans = ans + end + "]";
return ans;
}

private Node getnthnode(int n){
  if(n >= size || n < 0) throw new IndexOutOfBoundsException();
  int counter = 0;
  Node now = start;
  while(counter < n){
    now = now.next();
    counter ++;
  }
  return now;
}




//PRIVATE CLASS
//
//
  private class Node{
    private Integer data;
    private Node next,prev;

    public Node(Integer data){
      this.data = data;
    }


    public Node next(){
      return next;
    }
    public Node prev(){
      return prev;
    }

    public void setNext(Node other){
      next = other;
    }

    public void setPrev(Node other){
      prev = other;
    }
    public Integer getData(){
      return data;
    }
    public Integer setData(Integer i){
      Integer x = data;
      data = i;
      return data;
    }
    public String toString(){
      return "" + data;
    }


}
///
///
//








}
