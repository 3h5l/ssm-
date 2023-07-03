package com.hl.service.impl;


import com.hl.controller.Code;
import com.hl.exception.BusinessException;
import com.hl.exception.SystemException;
import com.hl.mapper.BookMapper;
import com.hl.pojo.Book;
import com.hl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    /* @Resource*/
    @Autowired
    private BookMapper bookMapper;

    public boolean save(Book book) {
        return bookMapper.save(book) > 0;
    }

    public boolean update(Book book) {
        return bookMapper.update(book) > 0;
    }

    public boolean delete(Integer id) {
        return bookMapper.delete(id) > 0;
    }

    public Book getById(Integer id) {
        if(id == 1){
            throw new BusinessException(Code.BUSINESS_ERR,"请不要使用你的技术挑战我的耐性!");
        }
//        //将可能出现的异常进行包装，转换成自定义异常
//        try{
//            int i = 1/0;
//        }catch (Exception e){
//            throw new SystemException(Code.SYSTEM_TIMEOUT_ERR,"服务器访问超时，请重试!",e);
//        }
        return bookMapper.getById(id);
    }

    public List<Book> getAll() {
        return bookMapper.getAll();
    }
}
