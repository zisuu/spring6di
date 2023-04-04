package ch.finecloud.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("prod")
@Service("datasourceService")
public class DataSourceServiceProd implements DataSourceServce {

    @Override
    public String getDataSource() {
        return "PROD";
    }
}
