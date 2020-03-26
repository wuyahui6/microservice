package com.ebon.springcloud;

import org.junit.jupiter.api.Test;

/**
 * @Auther: wyh
 * @Date: 2020/3/26 14:40
 * @Description:
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootTest
public class MyTest {

    @Autowired
    DataSource dataSource;

    @Test
    public void Test() throws SQLException {
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        connection.close();
    }
}
