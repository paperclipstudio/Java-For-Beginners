class P2_19 {
  public static void main(String[] args) {
    output_large("hello");
  }

  static void output_large (String input) {
    int i = 0;
    input = input.toLowerCase();
    String fullBar = "***** \n";
    String edgeBar = "*   * \n";
    String leftBar = "*     \n";
    String empty   = "      \n";
    String h = edgeBar + edgeBar + fullBar + edgeBar + edgeBar + empty;
    String e = fullBar + leftBar + fullBar + leftBar + fullBar + empty;
    String l = leftBar + leftBar + leftBar + leftBar + fullBar + empty;
    String o = fullBar + edgeBar + edgeBar + edgeBar + fullBar + empty;
    String block = fullBar + fullBar + fullBar + fullBar + fullBar + empty;

    while (i < input.length()) {
      switch (input.charAt(i)){
        case 'h': System.out.print(h); break;
        case 'e': System.out.print(e); break;
        case 'l': System.out.print(l); break;
        case 'o': System.out.print(o); break;
        default : System.out.print(block); break;
      }
      i++;
    }
  }
}
