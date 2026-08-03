  package homework_14_exc_io;

  import java.io.BufferedReader;
  import java.io.FileReader;
  import java.io.FileWriter;
  import java.io.IOException;
  import java.util.StringTokenizer;


  public class MyMain {
       private static final int MIN_LENGTH = 8;

       public static void main(String[] args) {
           getLongWordsExtractor();
       }

       public static void getLongWordsExtractor() {
           String inputFileName = "src/homework_14_exc_io/romeo_and_juliet";
           String outputFileName = "src/homework_14_exc_io/longest_word.txt";

           try {
               extractLongWords(inputFileName, outputFileName, MIN_LENGTH);
               System.out.println("Готово! Длинные слова сохранены в " + outputFileName);
           } catch (IOException e) {
               System.out.println("Произошла ошибка при работе с файлами: " + e.getMessage());
               e.printStackTrace();
           }
       }

       private static void extractLongWords(String inputFile, String outputFile, int minLength) throws IOException{
           try(BufferedReader reader = new BufferedReader(new FileReader(inputFile));
               FileWriter writer = new FileWriter(outputFile)) {

                   String line;
                   while ((line = reader.readLine()) != null) {
                       StringTokenizer tokenizer = new StringTokenizer(line, " \t\n\r\f,.;:!?\"'()-");
                       while (tokenizer.hasMoreTokens()){
                           String word = tokenizer.nextToken();

                           word = word.replaceAll("[^a-zA-Z]", "");
                           if (!word.isEmpty() && word.length() > minLength){
                               writer.write(word + "\n");
                           }
                       }
                   }
               }
       }
   }

