package org.fourhorde.coolmemes.csv;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import org.fourhorde.coolmemes.model.SnapshotModel;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OpenCSVReadToBean {

    public static List<SnapshotModel> read(MultipartFile file) throws IOException {
        try (
                Reader reader = new InputStreamReader(file.getInputStream());
        ) {
            CsvToBean<SnapshotModel> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(SnapshotModel.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .withSeparator(',')
                    .build();

            return csvToBean.parse();
        }
    }
}
