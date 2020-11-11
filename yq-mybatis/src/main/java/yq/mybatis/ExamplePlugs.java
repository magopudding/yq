package yq.mybatis;

import org.apache.ibatis.executor.Executor;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;

import java.util.Properties;

@Intercepts({@Signature(
        type= Executor.class,
        method = "update",
        args = {Integer.class})})
public class ExamplePlugs implements Interceptor {
    private Properties properties = new Properties();
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("开始执行查询");
        System.out.println(properties.getProperty("name"));
        Object proceed = invocation.proceed();
        System.out.println("查询结束");
        return proceed;
    }


    @Override
    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
