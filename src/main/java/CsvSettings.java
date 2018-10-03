import java.util.List;

public interface CsvSettings {

    char delimiter();

    boolean headers();

    List<String> ignored();
}
