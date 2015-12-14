package lab6;

import com.opencsv.CSVReader;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by olgaoskina
 * 09/11/15
 */
public class RandomCsvWriterToStream {

    private final CSVReader reader;
    private final OutputStream outputStream;

    public RandomCsvWriterToStream(CSVReader reader, OutputStream outputStream) {
        this.reader = reader;
        this.outputStream = outputStream;
    }

    public void write() throws IOException {
        reader.readAll()
                .parallelStream()
                .forEach(a -> writeIntoStream(outputStream, StringUtils.join(a, reader.getParser().getSeparator())));
    }

    private void writeIntoStream(OutputStream outputStream, String s) {
        try {
            outputStream.write((s + "\n").getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
