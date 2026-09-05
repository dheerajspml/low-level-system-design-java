package filesystem;

import java.util.ArrayList;
import java.util.List;

public class Directory  implements FileSystem{
    String directoryName;
    List<FileSystem> children;
    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.children = new ArrayList<>();
    }
    public void add(FileSystem fileSystem ){
        children.add(fileSystem);
    }
    public void remove(FileSystem fileSystem) {
        children.remove(fileSystem);
    }

    @Override
    public void printContents() {
        System.out.println("Directory Name: " + directoryName);
        for (FileSystem child : children) {
            child.printContents();
        }
    }

}
