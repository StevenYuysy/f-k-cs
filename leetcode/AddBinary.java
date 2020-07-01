public class AddBinary {
  public String addBinary(String a, String b) {
    String result = "";
    String longStr, shortStr;
    if (a.length() >= b.length()) {
      longStr = a;
      shortStr = b;
    } else {
      longStr = b;
      shortStr = a;
    }
    int length = longStr.length();
    int offset = longStr.length() - shortStr.length();
    boolean isUp = false;
    for (int i = length - 1; i >= 0; i--) {
      int longNum = longStr.charAt(i) - '0';
      int shortNum = (i - offset) < 0 ? 0 : shortStr.charAt(i - offset) - '0';
      int currentNum = longNum + shortNum + (isUp ? 1 : 0);
      if (currentNum >= 2) {
        isUp = true;
        result = String.valueOf(currentNum - 2) + result;
      } else {
        isUp = false;
        result = String.valueOf(currentNum) + result;
      }
    }
    if (isUp) {
      result = "1" + result;
    }
    return result;
  }

  public static void main(String[] args) {
    AddBinary ab = new AddBinary();
    System.out.println(ab.addBinary("1", "11"));
    System.out.println(ab.addBinary("1010", "1011"));
    System.out.println(ab.addBinary("0", "0"));
    System.out.println(ab.addBinary("1", "1"));
    System.out.println(ab.addBinary("101", "1"));
    System.out.println(ab.addBinary("1111", "1111"));
  }
}