import org.csveed.bean.BeanInstructions;
import org.csveed.bean.BeanInstructionsImpl;
import org.csveed.bean.BeanWriter;
import org.csveed.bean.BeanWriterImpl;

import java.io.Writer;
import java.util.stream.Stream;

public class ReportCsvWriter<T> {

    private BeanInstructions bi;

    public ReportCsvWriter(final Class<? extends T> cls,
                           final CsvPropertyMapper mapper,
                           final CsvSettings settings){

        bi = new BeanInstructionsImpl(cls);


        //map properties
        mapper.getMapping().forEach(prop -> bi.mapColumnNameToProperty(prop.getName(), prop.getField()));

        //apply settings
        bi.setUseHeader(settings.headers());
        bi.setSeparator(settings.delimiter());

        //ignore properties, always after the mappings !!
        settings.ignored().forEach(bi::ignoreProperty);
    }


    public void write(final Writer writer, final Stream<T> data) {
        final BeanWriter<T> beanWriter = new BeanWriterImpl<>(writer, bi);
        data.forEach(beanWriter::writeBean);
    }

}
