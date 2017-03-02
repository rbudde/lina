package de.laura.test;

import java.io.File;
import java.util.List;

import org.junit.Test;

import de.laura.mains.Filter;

public class FilterTest {

    @Test
    public void filterTest1() {
        Filter filter = new Filter(".*\\.java");
        File f = new File("src/main/java");
        List<File> result = filter.filterDir(f);
        for ( File file : result ) {
            System.out.println(file.getAbsolutePath());

        }

    }

    @Test
    public void filterTest2() {
        Filter filter = new Filter(".*txt");
        File f = new File("src/main/resources");
        List<File> result = filter.filterDir(f);
        for ( File file : result ) {
            System.out.println(file.getAbsolutePath());

        }

    }
}
