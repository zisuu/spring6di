package ch.finecloud.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("qa")
@Service("datasourceService")
public class DataSourceServiceQa implements DataSourceServce {

    @Override
    public String getDataSource() {
        return "QA";
    }
}
