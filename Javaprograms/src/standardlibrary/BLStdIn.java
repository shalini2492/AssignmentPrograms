package standardlibrary;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.regex.Pattern;
public class BLStdIn {
	 private static final String CHARSET_NAME = "UTF-8";

	    // assume language = English, country = US for consistency with System.out.
	    private static final Locale LOCALE = Locale.US;

	    // the default token separator; we maintain the invariant that this value
	    // is held by the scanner's delimiter between calls
	    private static final Pattern WHITESPACE_PATTERN = Pattern.compile("\\p{javaWhitespace}+");

	    // makes whitespace significant
	    private static final Pattern EMPTY_PATTERN = Pattern.compile("");

	    // used to read the entire input
	    private static final Pattern EVERYTHING_PATTERN = Pattern.compile("\\A");

	    /*** end: section (1 of 2) of code duplicated from In to StdIn. */

	    private static Scanner scanner;
	 
	    
	    private BLStdIn() { }

	   /*Methods for reading individual tokens from the Bridgelabz standard input
	    * This method will return true if there is no standard input.
	    */
	    public static boolean isEmpty() {
	        return !scanner.hasNext();
	    }

	   /** This method checks if standard input has next line or not.
	    * 
	    * @return returns true if input has next line else returns false.
	    */
	    public static boolean hasNextLine() {
	        return scanner.hasNextLine();
	    }

	   /**This method checks if there are any characters remaining.
	    * 
	    * @return returns true if any characters are left to read else returns false
	    */
	    public static boolean hasNextChar() {
	        scanner.useDelimiter(EMPTY_PATTERN);
	        boolean result = scanner.hasNext();
	        scanner.useDelimiter(WHITESPACE_PATTERN);
	        return result;
	    }


	/** This method reads the next line of input and returns it.
	 * 
	 * @return line
	 */
	    public static String readLine() {
	        String line;
	        try {
	            line = scanner.nextLine();
	        }
	        catch (NoSuchElementException e) {
	            line = null;
	        }
	        return line;
	    }

	    /**
	     * Reads and returns the next character.
	     *
	     * @return the next {@code char}
	     * @throws NoSuchElementException if standard input is empty
	     */
	    public static char readChar() {
	        try {
	            scanner.useDelimiter(EMPTY_PATTERN);
	            String ch = scanner.next();
	            assert ch.length() == 1 : "Internal (Std)In.readChar() error!"
	                + " Please contact the authors.";
	            scanner.useDelimiter(WHITESPACE_PATTERN);
	            return ch.charAt(0);
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'char' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }  


	   /**
	     * Reads and returns the remainder of the input, as a string.
	     *
	     * @return the remainder of the input, as a string
	     * @throws NoSuchElementException if standard input is empty
	     */
	    public static String readAll() {
	        if (!scanner.hasNextLine())
	            return "";

	        String result = scanner.useDelimiter(EVERYTHING_PATTERN).next();
	        // not that important to reset delimeter, since now scanner is empty
	        scanner.useDelimiter(WHITESPACE_PATTERN); // but let's do it anyway
	        return result;
	    }


	   /**
	     * Reads the next token  and returns the {@code String}.
	     *
	     * @return the next {@code String}
	     * @throws NoSuchElementException if standard input is empty
	     */
	    public static String readString() {
	        try {
	            return scanner.next();
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'String' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }

	   /**
	     * Reads the next token from standard input, parses it as an integer, and returns the integer.
	     *
	     * @return the next integer on standard input
	     * @throws NoSuchElementException if standard input is empty
	     * @throws InputMismatchException if the next token cannot be parsed as an {@code int}
	     */
	    public static int readInt() {
	        try {
	            return scanner.nextInt();
	        }
	        catch (InputMismatchException e) {
	            String token = scanner.next();
	            throw new InputMismatchException("attempts to read an 'int' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attemps to read an 'int' value from standard input, "
	                                           + "but no more tokens are available");
	        }

	    }

	   /**
	     * Reads the next token from standard input, parses it as a double, and returns the double.
	     *
	     * @return the next double on standard input
	     * @throws NoSuchElementException if standard input is empty
	     * @throws InputMismatchException if the next token cannot be parsed as a {@code double}
	     */
	    public static double readDouble() {
	        try {
	            return scanner.nextDouble();
	        }
	        catch (InputMismatchException e) {
	            String token = scanner.next();
	            throw new InputMismatchException("attempts to read a 'double' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'double' value from standard input, "
	                                           + "but no more tokens are available");
	        }
	    }

	    /**
	     * Reads the next token from standard input, parses it as a boolean,
	     * and returns the boolean.
	     *
	     * @return the next boolean on standard input
	     * @throws NoSuchElementException if standard input is empty
	     * @throws InputMismatchException if the next token cannot be parsed as a {@code boolean}:
	     *    {@code true} or {@code 1} for true, and {@code false} or {@code 0} for false,
	     *    ignoring case
	     */
	    public static boolean readBoolean() {
	        try {
	            String token = readString();
	            if ("true".equalsIgnoreCase(token))  return true;
	            if ("false".equalsIgnoreCase(token)) return false;
	            if ("1".equals(token))               return true;
	            if ("0".equals(token))               return false;
	            throw new InputMismatchException("attempts to read a 'boolean' value from standard input, "
	                                           + "but the next token is \"" + token + "\"");
	        }
	        catch (NoSuchElementException e) {
	            throw new NoSuchElementException("attempts to read a 'boolean' value from standard input, "
	                                           + "but no more tokens are available");
	        }

	    }

	    /**
	     * Reads all remaining tokens from standard input and returns them as an array of strings.
	     *
	     * @return all remaining tokens on standard input, as an array of strings
	     */
	    public static String[] readAllStrings() {
	        // we could use readAll.trim().split(), but that's not consistent
	        // because trim() uses characters 0x00..0x20 as whitespace
	        String[] tokens = WHITESPACE_PATTERN.split(readAll());
	        if (tokens.length == 0 || tokens[0].length() > 0)
	            return tokens;

	        // don't include first token if it is leading whitespace
	        String[] decapitokens = new String[tokens.length-1];
	        for (int i = 0; i < tokens.length - 1; i++)
	            decapitokens[i] = tokens[i+1];
	        return decapitokens;
	    }

	    /**
	     * Reads all remaining lines from standard input and returns them as an array of strings.
	     * @return all remaining lines on standard input, as an array of strings
	     */
	    public static String[] readAllLines() {
	        ArrayList<String> lines = new ArrayList<String>();
	        while (hasNextLine()) {
	            lines.add(readLine());
	        }
	        return lines.toArray(new String[lines.size()]);
	    }

	    /**
	     * Reads all remaining tokens from standard input, parses them as integers, and returns
	     * them as an array of integers.
	     * @return all remaining integers on standard input, as an array
	     * @throws InputMismatchException if any token cannot be parsed as an {@code int}
	     */
	    public static int[] readAllInts() {
	        String[] fields = readAllStrings();
	        int[] vals = new int[fields.length];
	        for (int i = 0; i < fields.length; i++)
	            vals[i] = Integer.parseInt(fields[i]);
	        return vals;
	    }

	    /**
	     * Reads all remaining tokens from standard input, parses them as doubles, and returns
	     * them as an array of doubles.
	     * @return all remaining doubles on standard input, as an array
	     * @throws InputMismatchException if any token cannot be parsed as a {@code double}
	     */
	    public static double[] readAllDoubles() {
	        String[] fields = readAllStrings();
	        double[] vals = new double[fields.length];
	        for (int i = 0; i < fields.length; i++)
	            vals[i] = Double.parseDouble(fields[i]);
	        return vals;
	    }
	    
	    //// end: section (2 of 2) of code duplicated from In to StdIn
	    
	    
	    // do this once when StdIn is initialized
	    static {
	        resync();
	    }

	    /**
	     * If StdIn changes, use this to reinitialize the scanner.
	     */
	    private static void resync() {
	        setScanner(new Scanner(new java.io.BufferedInputStream(System.in), CHARSET_NAME));
	    }
	    
	    private static void setScanner(Scanner scanner) {
	        BLStdIn.scanner = scanner;
	        BLStdIn.scanner.useLocale(LOCALE);
	    }

	 
	  


	    /**
	     * Interactive test of basic functionality.
	     *
	     * @param args the command-line arguments
	     */
	    public static void main(String[] args) {

	        BLStdOut.print("Type a string: ");
	        String s = BLStdIn.readString();
	        BLStdOut.println("Your string was: " + s);
	        BLStdOut.println();

	        BLStdOut.print("Type an int: ");
	        int a = BLStdIn.readInt();
	        BLStdOut.println("Your int was: " + a);
	        BLStdOut.println();

	        BLStdOut.print("Type a boolean: ");
	        boolean b = BLStdIn.readBoolean();
	        BLStdOut.println("Your boolean was: " + b);
	        BLStdOut.println();

	        BLStdOut.print("Type a double: ");
	        double c = BLStdIn.readDouble();
	        BLStdOut.println("Your double was: " + c);
	        BLStdOut.println();
	    }

	}

