package ch.finecloud.spring6di.controllers.datasource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles({"prod", "EN"})
@SpringBootTest
public class myDataSourceControllerTest {

    @Autowired
    DataSourceController dataSourceController;

    @Test
    void getDataSource() {
        System.out.println(dataSourceController.getDataSource());
    }
}
