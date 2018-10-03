import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class CsvProperty {
    private String name;
    private String field;
}
