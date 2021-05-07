import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.StringJoiner;

public class FileService {
    static void createFile(String path) throws IOException {
        File file=new File(path);
        file.createNewFile();
    }
    static void write(String path,Weapon data) throws IOException {
        StringJoiner sj=new StringJoiner(",");
        sj.add(data.model);
        sj.add(Integer.toString(data.flyDistance));
        sj.add(Integer.toString(data.deadlyFlyDistance));
        sj.add(Integer.toString(data.weight));
        sj.add(Integer.toString(data.year));
        sj.add(data.country);
        sj.add(data.continent);
        sj.add(Boolean.toString(data.isForbidden)+",");
        Files.write(Paths.get(path),sj.toString().getBytes(),StandardOpenOption.APPEND);
    }
    static void write(String path,String txt) throws IOException {
        StringBuilder sb=new StringBuilder();
        if(txt!="\n")
        sb.append(txt).append(",");
        else sb.append(txt);
        Files.write(Paths.get(path),sb.toString().getBytes(),StandardOpenOption.APPEND);
    }
    static List<String> read(String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }
}
