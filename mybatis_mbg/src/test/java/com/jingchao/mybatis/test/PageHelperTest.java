package com.jingchao.mybatis.test;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.jingchao.mybatis.mapper.EmpMapper;
import com.jingchao.mybatis.pojo.Emp;
import com.jingchao.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class PageHelperTest {

    @Test
    public void testPageHelper(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        EmpMapper mapper = sqlSession.getMapper(EmpMapper.class);
        // 查询功能之前开启分页
        Page<Object> page = PageHelper.startPage(1, 4);
        List<Emp> empList = mapper.selectByExample(null);
        // 查询功能之后可以获取分页相关的所有数据
        PageInfo<Emp> pageInfo = new PageInfo<>(empList,5);
        empList.forEach(System.out::println);
        System.out.println(page);
        System.out.println(pageInfo);

    }
}
