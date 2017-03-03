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

    /**
     * Seeks for the biggest File(bytes) in a given File(root).
     *
     * @param root (the File to work with)
     * @return the biggestFile (returns root, if root is not a directory)
     */

    public File maxDir(File root) {

        if ( root.isDirectory() ) {

            File biggestFile = null;
            File[] directoryFiles = root.listFiles();
            for ( File file : directoryFiles ) {
                File biggestFileOfChild = maxDir(file);
                if ( biggestFile == null ) {
                    biggestFile = biggestFileOfChild;
                } else if ( biggestFileOfChild == null ) {
                    //alles gut
                } else if ( biggestFile.length() < biggestFileOfChild.length() ) {
                    biggestFile = biggestFileOfChild;
                } else {
                    //alles gut
                }
            }
            return biggestFile;
        }

        else {

            return root;
        }
    }

    /**
     * Returns the File which has been modified most recently in a given File(root).
     * 
     * @param root (the File to work with)
     * @return the newestFile (returns root, if root is not a directory)
     */
    public File dateDir(File root) {

        if ( root.isDirectory() ) {

            File newestFile = null;
            File[] directoryFiles = root.listFiles();

            for ( File file : directoryFiles ) {
                File newestFileOfChild = maxDir(file);
                if ( newestFile == null ) {
                    newestFile = newestFileOfChild;
                } else if ( newestFileOfChild == null ) {
                    //alles gut
                } else if ( newestFile.lastModified() < newestFileOfChild.lastModified() ) {
                    newestFile = newestFileOfChild;
                } else {
                    //alles gut
                }
            }
            return newestFile;
        }

        else {

            return root;
        }
    }

}
