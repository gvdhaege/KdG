import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.ArrayList;
import java.util.Set;

public class Opdracht1 {
    public static void main(String[] args) {
        ArrayList<String> lines = new ArrayList<>();
        lines.add("Steven");
        lines.add("Excelmans");
        lines.add("TIB00001");

        Path testBestand = Paths.get("/Users/stevene/Desktop/Test/test.txt");
        Path copyBestand = Paths.get("/Users/stevene/Desktop/Test/copy.txt");
        System.out.println(testBestand.toAbsolutePath().toString());
        System.out.println(Files.exists(testBestand));

        Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rwxrwxrwx");
        FileAttribute<Set<PosixFilePermission>> fileAttributes = PosixFilePermissions.asFileAttribute(permissions);

        try {
            Files.createDirectories(testBestand.getParent(), fileAttributes);
            if (Files.exists(testBestand.getParent())) {
                Files.createFile(testBestand, fileAttributes);
                Files.write(testBestand, lines, Charset.defaultCharset(), StandardOpenOption.APPEND);
                BasicFileAttributes attr = Files.readAttributes(testBestand, BasicFileAttributes.class);
                System.out.println("creationTime     = " + attr.creationTime());
                System.out.println("lastAccessTime   = " + attr.lastAccessTime());
                System.out.println("lastModifiedTime = " + attr.lastModifiedTime());
                System.out.println("isDirectory      = " + attr.isDirectory());
                System.out.println("isOther          = " + attr.isOther());
                System.out.println("isRegularFile    = " + attr.isRegularFile());
                System.out.println("isSymbolicLink   = " + attr.isSymbolicLink());
                System.out.println("size             = " + attr.size());
                Files.copy(testBestand, copyBestand, StandardCopyOption.REPLACE_EXISTING);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
