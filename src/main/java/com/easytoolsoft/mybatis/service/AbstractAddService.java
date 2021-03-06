package com.easytoolsoft.mybatis.service;

import java.util.List;

import com.easytoolsoft.mybatis.data.InsertRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @param <Dao>
 * @param <Po>
 * @author zhiwei.deng
 * @date 2017-03-25
 */
public abstract class AbstractAddService<Dao extends InsertRepository<Po>, Po> implements AddService<Po> {
    @Autowired
    protected Dao dao;

    @Override
    public int add(final Po record) {
        return this.dao.insert(record);
    }

    @Override
    public int batchAdd(final List<Po> records) {
        return this.dao.batchInsert(records);
    }
}
