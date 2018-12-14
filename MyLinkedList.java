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
    start, end = new Node(value);
    return true;
  }
  x = new Node(value);
  end.setNext(x);
  end = x;

}

public String toString(){
  ans = "["
Node n = start;
while(n != end){
  ans += n;
  ans += ", "
  n = n.next();
}
ans = ans + end + "]"
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
}
