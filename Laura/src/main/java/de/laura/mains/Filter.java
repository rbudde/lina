package de.laura.mains;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Filter {
    private final Pattern pattern;

    public Filter(String patternString) {
        this.pattern = Pattern.compile(patternString);
    }

    /**
     * Seeks for all the non-Directory-Files in a given File(root).
     * Then checks which of these Files match the given Pattern.
     * The matching Files are then added to a List(resultDataList).
     *
     * @param root (the File to work with)
     * @return a List of Files, which match the given Pattern
     */
    public List<File> filterDir(File root) {

        List<File> resultDataList = new ArrayList<>();

        if ( root.isDirectory() ) {
            File[] directoryFiles = root.listFiles();
            for ( File file : directoryFiles ) {
                List<File> resultFiles = filterDir(file);
                resultDataList.addAll(resultFiles);

            }

        } else {
            Matcher matcher = this.pattern.matcher(root.getAbsolutePath());
            if ( matcher.matches() ) {
                resultDataList.add(root);

            }

        }
        return resultDataList;

    }

    public File maxDir(File root) {
        File longest;
        List<File> resultDataList = new ArrayList<>();

        if ( root.isDirectory() ) {
            if ( root.length() == 0 ) {
            }
            File[] directoryFiles = root.listFiles();
            for ( File file : directoryFiles ) {
                List<File> resultFiles = filterDir(file);
                resultDataList.addAll(resultFiles);
            }
            return null;
        } else {

            return root;

        }

    }
}