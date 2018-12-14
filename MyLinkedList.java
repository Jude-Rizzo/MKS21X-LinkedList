public class MyLinkedList{
   private int size;
   private Node start,end;
   public int size();
   public boolean add(int value);
   public String toString();


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
}
