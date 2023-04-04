package ch.finecloud.spring6di.services.datasource;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"dev", "default"})
@Service("datasourceService")
public class DataSourceServiceDev implements DataSourceServce {

    @Override
    public String getDataSource() {
        return "DEV";
    }
}
