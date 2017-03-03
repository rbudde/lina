package de.laura.test;

import java.io.File;
import java.util.Date;
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
        File f = new File("src/main/java");
        File result = filter.maxDir(f);
        System.out.println(result + " Länge:" + result.length());

    }

    @Test
    public void filterTest3() {
        Filter filter = new Filter(".*txt");
        File f = new File("src/test/java");
        File result = filter.dateDir(f);
        System.out.println(result + " letztes Mal bearbeitet:" + new Date(result.lastModified()));

    }
}
