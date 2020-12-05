package Cooking;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static Cooking.FileUtils.*;
import static org.assertj.core.api.Assertions.assertThat;

class FileUtilsTest {
    @Test
    void readFromFile_result_is_not_null() throws IOException {
        String path = "C:\\Users\\jolged\\IdeaProjects\\Recipe.txt";

        assertThat(getFileContents(path)).isNotNull();
    }

    @Test
    void writeToFile_result_is_not_null() throws IOException {
        //String path1 = "C:\\Users\\jolged\\IdeaProjects\\Recipe.txt";
        String path2 = "C:\\Users\\jolged\\IdeaProjects\\Recipe2.txt";

        //readFromFile(path1);
        writeToFile(path2);
       //assertThat(getFileContentsOut()).isNotNull();

    }

}