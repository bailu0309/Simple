package com.bailu.mybatis;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @Author mabailu
 * @Date 2018/4/13 15:31
 * @Description
 */
public class BaseMapperTest {
    private static SqlSessionFactory sqlSessionFactory;


    @BeforeClass
    public static void init() throws IOException {
        Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);

        reader.close();
    }

    public SqlSession getSqlSession() {
        return sqlSessionFactory.openSession();
    }


}
