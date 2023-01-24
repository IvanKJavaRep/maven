import org.example.FileIterator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FileIteratorTest {
    @Test
    public void lineCounterTest() {
        int i = 0;
        FileIterator fileIterator = new FileIterator("C:\\Users\\Иван\\IdeaProjects\\untitled8\\test.txt");
        while (fileIterator.hasNext()) {
            i += 1;
        }
        Assertions.assertEquals(3, i);
    }

    @Test
    public void contentTest() {
        String[] arr = new String[3];
        String[] expected = {"a", "b", "c"};
        FileIterator fileIterator = new FileIterator("C:\\Users\\Иван\\IdeaProjects\\untitled8\\test.txt");
        int i = 0;
        while (fileIterator.hasNext()) {
            arr[i] = fileIterator.next();
            i++;
        }
        Assertions.assertArrayEquals(expected, arr);
    }

    @Test
    public void lengthTest() {
        FileIterator fileIterator = new FileIterator("C:\\Users\\Иван\\IdeaProjects\\untitled8\\test.txt");
        int i = 0;
        String content = "";
        while (fileIterator.hasNext()) {
            content += fileIterator.next();
        }
        Assertions.assertTrue(content.length() >= 3);
    }

}
