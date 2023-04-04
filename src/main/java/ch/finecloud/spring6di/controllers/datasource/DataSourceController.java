package ch.finecloud.spring6di.controllers.datasource;

import ch.finecloud.spring6di.services.datasource.DataSourceServce;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class DataSourceController {

    private final DataSourceServce dataSourceService;

    public DataSourceController(@Qualifier("datasourceService") DataSourceServce dataSourceService) {
        this.dataSourceService = dataSourceService;
    }

    public String getDataSource() {
        return "You are in " + dataSourceService.getDataSource() + " Environment";
    }
}
