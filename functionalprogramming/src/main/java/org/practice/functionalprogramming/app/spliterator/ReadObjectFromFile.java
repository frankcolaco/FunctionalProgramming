package org.practice.functionalprogramming.app.spliterator;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class ReadObjectFromFile {

    public static void main(String[] args) {

        Path filePath = Paths.get("C:\\Users\\FrankColaco\\study\\gitHub\\FunctionalProgramming\\functionalprogramming\\src\\main\\java\\org\\practice\\functionalprogramming\\app\\spliterator\\Books.txt");
        try(Stream<String> lines = Files.lines(filePath)){

            Spliterator<String> baseSpliterator = lines.spliterator();
            Spliterator<Book> bookSpliterator = new BookSpliterator(baseSpliterator);

            Stream<Book> bookStream = StreamSupport.stream(bookSpliterator,false);
            bookStream.forEach(System.out::println);

        }catch (IOException ioe){
            System.out.println(ioe.getCause());
        }
    }
}
