/**
 * 标签：字符串匹配
 */
class StrStr {
  public int strStr(String haystack, String needle) {
    int index = -1;
    if (needle.length() <= haystack.length()) {
      index = 0;
      while (index + needle.length() <= haystack.length()) {
        String c = haystack.substring(index, index + needle.length());
        if (c.equals(needle)) {
          break;
        }
        index++;
      }
      if (index + needle.length() > haystack.length()) {
        index = -1;
      }
    }
    return index;
  }

  public static void main(String[] args) {
    StrStr str = new StrStr();
    System.out.println(str.strStr("hello", "ll"));
    System.out.println(str.strStr("aaaaa", "bba"));
    System.out.println(str.strStr("a", "a"));
    System.out.println(str.strStr("caaa", "aaa"));
  }
}