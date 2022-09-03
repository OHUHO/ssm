package com.jingchao.mybatis;

import com.jingchao.mybatis.mapper.DynamicSQLMapper;
import com.jingchao.mybatis.pojo.Emp;
import com.jingchao.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DynamicMapperTest {

    @Test
    public void testGetEmpByCondition(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 20, "男");
        List<Emp> empList = mapper.getEmpByCondition(emp);
        empList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testGetEmpByChoose(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp = new Emp(null, "张三", 20, "男");
        List<Emp> empList = mapper.getEmpByChoose(emp);
        empList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    public void testInsertMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Emp emp1 = new Emp(null, "小王", 18, "男");
        Emp emp2 = new Emp(null, "小王", 18, "女");
        Emp emp3 = new Emp(null, "小王", 18, "男");
        List<Emp> empList = Arrays.asList(emp1, emp2, emp3);
        mapper.insertMoreEmp(empList);
        sqlSession.close();
    }

    @Test
    public void testDeleteMoreEmp(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        DynamicSQLMapper mapper = sqlSession.getMapper(DynamicSQLMapper.class);
        Integer[] integers = {6, 7};
        mapper.deleteMoreEmp(integers);
        sqlSession.close();
    }


}
