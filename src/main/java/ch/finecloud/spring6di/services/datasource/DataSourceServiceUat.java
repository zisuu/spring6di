package ch.finecloud.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("uat")
@Service("datasourceService")
public class DataSourceServiceUat implements DataSourceServce {

    @Override
    public String getDataSource() {
        return "UAT";
    }
}
