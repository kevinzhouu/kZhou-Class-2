public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = data.length;
  }
  public void clear(){
    size = 0;
    String[] data = new String[0];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    else {
      return false;
    }
  }
  public boolean add(String element){
    data[size] = element;
    size+=1;
    return true;
  }
  public String get(int index){
    if (index<=size-1&&index>=0){
      return data[index];
    }
    else {
      return null;
    }
  }
  public String set(int index, String element){
    if (index<=size-1&&index>=0){
      String temp = data[index];
      data[index]=element;
      return temp;
    }
    else {
      return null;
    }
  }
  public String toString(){
    String res = "[";
    for (int i = 0;i<data.length;i++){
      res+=data[i];
      res+=", ";
    }
    res+="]";
    return res;
  }
  private void resize() {
    int size2 = size * 2;
    String[] data2 = new String[size2];
    for (int i = 0;i<data.length;i++){
      data2[i]=data[i];
    }
    data = data2;
    size = size2;
  }
  public boolean contains(String element){
    for (int i = 0;i<data.length;i++){
      if (element.equals(data[i])){
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element){
    if (index<0||index>=size){
      System.out.println("bad index");
    }
    for (int i = size-1; i>=index;i--){
      data[i+1] = data[i];
    }
    data[index] = element;
  }
  public int indexOf(String element){
    for(int i=0;i<size;i++){
      if (data[i]==element){
        return i;
      }
    }
    return -1;
  }
  public int lastindexOf(String element){
    int result = -1;
    for(int i=0;i<size;i++){
      if (data[i]==element){
        result = i;
      }
    }
    return result;
  }
  public boolean remove(String element){
    int result = -1;
    for(int i=0;i<size;i++){
      if (data[i]==element){
        result = i;
        break;
      }
    }
    if (result == -1){
      return false;
    }
    else{
      for(int i=result;i<size-1;i++){
        data[i]=data[i+1];}
      size -=1;
      return true;
    }
  }
}
