import java.util.Collections;
import java.util.List;

public class DefaultCsvSettings implements CsvSettings {

    @Override
    public char delimiter(){
        return ',';
    }


    @Override
    public boolean headers(){
        return true;
    }

    @Override
    public List<String> ignored(){
        return Collections.emptyList();
    }
}
