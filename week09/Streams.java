import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Streams {

    public static void main(String[] args) throws IOException {
//        int i = Integer.parseInt("-5");0
//        System.out.println(i);

        Scanner scanner = new Scanner(new StringReader("24 10 33"));
        while (scanner.hasNextInt()) {
            System.out.println(scanner.nextInt());
        }

//        for (int i = 0; i < 200000; i++) {
//            System.out.print(i);
//            System.out.flush();
//            if (i == 2000) {
//                System.exit(1);
//            }
//        }

//        System.out.println("Something is wrong");
//        System.err.println("Something is wrong");

//        OutputStream out = System.out;
//        printFooBarBaz(out);

//        byte[] inStream = "string as a stream".getBytes();
//        readInputStream(new ByteArrayInputStream(new byte[]{}));

//        readBufferedInputStream(new BufferedInputStream(new ByteArrayInputStream(new byte[]{})));

//        String result = reverse(new StringReader("Words, words, and more words"));
//        System.out.println(result);

//        Reader r;
        String result;
//        r = new BufferedReader(new FileReader("week9/Streams.java"));
//        result = reverse(r);
//        System.out.println(result);
//
//        try {
//            r = new BufferedReader(new FileReader("week9/Streams.java"));
//            result = reverse(r);
//            System.out.println(result);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } finally {
//            r.close();
//        }
//
//        try (Reader r2 = new BufferedReader(new FileReader("week9/Strams.java"))) {
//            result = reverse(r2);
//            System.out.println(result);
//        } catch (IOException e) {
//            //throw new RuntimeException(e);
//            e.printStackTrace();
//        }

    }
    // 5D
//    private static String reverse(Reader reader) throws IOException {
//        char[] output = new char[10];
//        for (int i = 0; i < 10; i++) {
//            output[9 - i] = (char) reader.read();
//        }
//        return new String(output);
//    }
//    // 5C
//    private static void readBufferedInputStream(BufferedInputStream fio) throws IOException {
//        int ch = 0;
//        while (ch != -1) {
//            ch = fio.read();
//        }
//    }
//    // 5B
//    private static void readInputStream(InputStream fio) throws IOException {
//        int ch = 0;
//        while (ch != -1) {
//            ch = fio.read();
//        }
//    }
//    // 5A
//    private static void printFooBarBaz(OutputStream out) throws IOException {
//        String toPrint = "foo bar baz";
//        //out.write(toPrint.getBytes(StandardCharsets.UTF_8));
//        //out.write(10);
//        byte[] output = new byte[toPrint.length()];
//        for (int i = 0; i < output.length; i++) {
//            output[i] = (byte) toPrint.charAt(i);
//        }
//        out.write(output);
//    }
}
