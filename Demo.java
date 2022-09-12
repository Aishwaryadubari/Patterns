
//decorator
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.stream.IntStream;

class MagicString
{
  private String string;

  public MagicString(String string)
  {
    this.string = string;
  }

  public long getNumberOfVowels()
  {
    return string.chars()
      .mapToObj(c -> (char)c)
      .filter(c -> "aeiou".contains(c.toString()))
      .count();
  }

  @Override
  public String toString()
  {
    return string;
  }

  // delegated members

  public int length()
  {
    return string.length();
  }
  public boolean isEmpty()
  {
    return string.isEmpty();
  }
  public char charAt(int index)
  {
    return string.charAt(index);
  }
 
 
 
  
  public boolean startsWith(String prefix, int toffset)
  {
    return string.startsWith(prefix, toffset);
  }
  public boolean startsWith(String prefix)
  {
    return string.startsWith(prefix);
  }
  public boolean endsWith(String suffix)
  {
    return string.endsWith(suffix);
  }
  public int indexOf(int ch)
  {
    return string.indexOf(ch);
  }
  public int indexOf(int ch, int fromIndex)
  {
    return string.indexOf(ch, fromIndex);
  }
  public int lastIndexOf(int ch)
  {
    return string.lastIndexOf(ch);
  }
  public int lastIndexOf(int ch, int fromIndex)
  {
    return string.lastIndexOf(ch, fromIndex);
  }
  public int indexOf(String str)
  {
    return string.indexOf(str);
  }
  public int indexOf(String str, int fromIndex)
  {
    return string.indexOf(str, fromIndex);
  }
  public int lastIndexOf(String str)
  {
    return string.lastIndexOf(str);
  }
 
    public static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements)
  {
    return String.join(delimiter, elements);
  }
  public String toLowerCase(Locale locale)
  {
    return string.toLowerCase(locale);
  }
  public String toLowerCase()
  {
    return string.toLowerCase();
  }
  public String toUpperCase(Locale locale)
  {
    return string.toUpperCase(locale);
  }
 
  
  public static String valueOf(float f)
  {
    return String.valueOf(f);
  }
  public static String valueOf(double d)
  {
    return String.valueOf(d);
  }
  public String intern()
  {
    return string.intern();
  }
}

class Demo
{
  public static void main(String [] args)
  {
    MagicString s = new MagicString("hello");
    System.out.println(s + " has "
      + s.getNumberOfVowels() + " vowels");
  }
}