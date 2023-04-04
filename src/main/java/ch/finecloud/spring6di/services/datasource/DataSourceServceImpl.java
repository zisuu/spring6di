package ch.finecloud.spring6di.services.datasource;

public class DataSourceServceImpl implements DataSourceServce {
    @Override
    public String getDataSource() {
        return "hello everyone from base DataSourceServiceImpl!";
    }
}
