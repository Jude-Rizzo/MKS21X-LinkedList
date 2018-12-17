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

public Integer get(int index){
  Node n = getnthnode(index);
  return n.getData();
}

public Integer set(int index, Integer value){
  Node n = getnthnode(index);
  return n.setData(value);
}

public boolean contains(Integer value){
  Node n = start();
  int counter = 0;
  while(counter < size){
    if(n.getData() == value) return true;
    n = n.next()
    counter ++;
  }
  return false;
}

public int indexOf(Integer value){
  Node n = start();
  int counter = 0;
  while(counter < size){
    if(n.getData() == value) return counter;
    counter ++;
  }
}

  public void add(int index, Integer value){
    if (index > length || index < 0) throw new IndexOutOfBoundsException();
    Node n = new Node();
    n.setData(value);
    if (length == 0 || index == length){
      add(value);
      length--;
    }
    if (index == 0 && length != 0){
      Node helper = start;
      start = n;
      start.setNext(helper);
      helper.setPrev(start);
    }
    if (index > 0 && index < length){
      Node prevNode = getNthNode(index-1);
      Node oldNode = getNthNode(index);
      prevNode.setNext(n);
      oldNode.setPrev(n);
      n.setNext(oldNode);
      n.setPrev(prevNode);
    }
    length++;
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


}
