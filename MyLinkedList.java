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
    if (index > size || index < 0) throw new IndexOutOfBoundsException();
    Node n = new Node();
    n.setData(value);
    if (size == 0 || index == size){
      this.add(value);
      size--;
    }
    if (index == 0 && size != 0){
      Node helper = start;
      start = n;
      start.setNext(helper);
      helper.setPrev(start);
    }
    if (index > 0 && index < size){
      Node prevNode = getnthnode(index-1);
      Node oldNode = getnthnode(index);
      prevNode.setNext(n);
      oldNode.setPrev(n);
      n.setNext(oldNode);
      n.setPrev(prevNode);
    }
    size++;
  }

  public Integer remove(int index){
    if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
    if(index == 0){
      int x = start.getData();
      start = start.next();
      start.setPrev(null);
      size -= 1;
      return x;
    }
    if(index == size - 1){
      int x = end.getData()
      end = end.prev();
      end.setNext(null);
      size -= 1;
      return x;
    }
    Node n = getnthnode(index);
    int x = n.getData();
    Node prev = n.prev();
    Node next = n.next();
    prev.setNext(next);
    next.setPrev(prev);
    return x;
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
