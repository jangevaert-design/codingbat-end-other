public class endOther {
  public boolean endOther(String a, String b) {
    String alc = a.toLowerCase();
    String blc = b.toLowerCase();
    return (b.length() <= a.length() && blc.equals(alc.substring(a.length() - b.length()))
        || (a.length() <= b.length() && alc.equals(blc.substring(b.length() - a.length())))) ;
  }
}
