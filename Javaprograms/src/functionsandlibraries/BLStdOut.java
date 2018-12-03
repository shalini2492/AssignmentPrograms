package functionsandlibraries;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class BLStdOut {
	// force Unicode UTF-8 encoding; otherwise it's system dependent
    private static final String CHARSET_NAME = "UTF-8";

    // assume language = English, country = US for consistency with StdIn
    private static final Locale LOCALE = Locale.US;

    // send output here
    private static PrintWriter out;

    // this is called before invoking any methods
    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, CHARSET_NAME), true);
        }
        catch (UnsupportedEncodingException e) {
            System.out.println(e);
        }
    }

    // don't instantiate
    private BLStdOut() { }


    /**
     * Terminates the current line by printing the line-separator string.
     */
    public static void println() {
        out.println();
    }

   

   /**
     * Prints a string to standard output and then terminates the line.
     *
     * @param x the string to print
     */
    public static void println(String x) {
        out.println(x);
    }

  
    

 
   /**
     * Prints a string to standard output and flushes standard output.
     * 
     * @param x the string to print
     */
    public static void print(String x) {
        out.print(x);
        out.flush();
    }

   
   /**
     * Prints a formatted string to standard output, using the specified format
     * string and arguments, and then flushes standard output.
     *
     *
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(String format, Object... args) {
        out.printf(LOCALE, format, args);
        out.flush();
    }

   /**
     * Prints a formatted string to standard output, using the locale and
     * the specified format string and arguments; then flushes standard output.
     *
     * @param locale the locale
     * @param format the <a href = "http://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html#syntax">format string</a>
     * @param args   the arguments accompanying the format string
     */
    public static void printf(Locale locale, String format, Object... args) {
        out.printf(locale, format, args);
        out.flush();
    }

   /**
     * Unit tests some of the methods in {@code StdOut}.
     *
     * @param args the command-line arguments
     */
    public static void main(String[] args) {

        // write to blstdout
        BLStdOut.println("Test");
       
        BLStdOut.printf("%.6f\n", 1.0/7.0);
    }

}

