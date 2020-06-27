public class CountAndSay {
  public String countAndSay(int n) {
    if (n == 1) {
      return "1";
    }
    return this.explain(countAndSay(n - 1));
  }

  public String explain(String s) {
    String result = "";
    char lastC = s.charAt(0);
    int count = 0;
    for (int i = 0; i < s.length(); i++) {
      char c = s.charAt(i);
      if (c != lastC) {
        result += String.valueOf(count) + lastC;
        lastC = c;
        count = 1;
      } else {
        count += 1;
      }
    }
    result += String.valueOf(count) + lastC;
    return result;
  }

  public static void main(String[] args) {
    CountAndSay cas = new CountAndSay();
    System.out.println(cas.explain("1"));
    System.out.println(cas.explain("11"));
    System.out.println(cas.explain("21"));
    System.out.println(cas.explain("1211"));
    System.out.println(cas.countAndSay(1));
    System.out.println(cas.countAndSay(2));
    System.out.println(cas.countAndSay(3));
    System.out.println(cas.countAndSay(4));
  }
}