package com.guru.stock.dao.impl;

import  com.guru.stock.model.Stock;
import com.guru.stock.dao.StockDao;
import com.guru.util.CustomHibernateDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository("stockDao")
public class StockDaoImpl extends CustomHibernateDaoSupport implements StockDao{

    public void save(Stock stock) {
        getHibernateTemplate().save(stock);
    }

    public void update(Stock stock) {
        getHibernateTemplate().update(stock);
    }

    public void delete(Stock stock) {
        getHibernateTemplate().delete(stock);
    }

    public Stock findByStockCode(String stockCode) {
        List list = getHibernateTemplate().find(
                "from Stock where stockCode=?",stockCode
        );
        return (Stock)list.get(0);
    }
}
