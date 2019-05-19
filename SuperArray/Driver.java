class Driver {
  public static void main(String[]args) {
    SuperArray s = new SuperArray();
    s.clear();
    System.out.println(s.size());
    System.out.println(s.isEmpty());
    System.out.println(s.add("a"));
    System.out.println(s.get(3));
    System.out.println(s.set(4,"abc"));
    System.out.println(s.toString());
    System.out.println(s.contains("abcdefg"));
    s.add(7,"something");
    System.out.println(s.indexOf("hello"));
    System.out.println(s.lastindexOf("hi"));
    System.out.println(s.remove("no"));
  }
}
