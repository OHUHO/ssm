package com.jingchao.spring.service.impl;

import com.jingchao.spring.dao.BookDao;
import com.jingchao.spring.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.TimeUnit;


@Service
public class BookServiceImpl implements BookService {


    @Autowired
    private BookDao bookDao;

    @Override
    @Transactional(isolation = Isolation.DEFAULT)
    public void buyBook(Integer userId, Integer bookId) {
        // 查询图书的价格
        Integer price = bookDao.getPriceByBookId(bookId);
        // 更新图书的库存
        bookDao.updateStock(bookId);
        // 更新用户余额
        bookDao.updateBalance(userId, price);

        System.out.println(1/0);
    }
}
