class QDemo {
    public static void main(String[] args) {
      Queue q = new Queue(10);
  
      q.put('A');
      q.put('B');
      q.put('C');
      q.get();
  
      System.out.print("Contents of q: ");
      for(int i=0; i<3; i++) {
        System.out.print(q.get());
      }
    }
  }