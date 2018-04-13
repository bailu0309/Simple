package com.bailu.mybatis;

import com.bailu.mybatis.model.country.Country;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @Author mabailu
 * @Date 2018/4/13 15:31
 * @Description
 */
public class CountryMapperTest extends BaseMapperTest {


    @Test
    public void testSelectAll() {
        SqlSession session = getSqlSession();
        try {
            List<Country> ls = session.selectList("selectAll");
            printList(ls);
        } finally {
            session.close();
        }

    }

    private void printList(List<Country> ls) {
        for (Country country : ls) {
            System.out.printf("%-4d%4s%4s\n", country.getId(), country.getCode(), country.getName());
        }
    }

}
