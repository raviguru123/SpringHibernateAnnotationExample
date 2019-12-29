package com.guru.common;

import com.guru.stock.bo.StockBo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.guru.stock.model.Stock;
public class App {
    public static  void main(String [] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("config/BeanLocations.xml");
    Integer suffix= 3;
        StockBo stockBo =(StockBo) applicationContext.getBean("stockBo");

        Stock stock = new Stock();
        stock.setStockCode("12345454"+suffix);
        stock.setStockName("Spring22"+suffix);
        stockBo.save(stock);

        /** select **/
        Stock stock2 = stockBo.findByStockCode("123454541");
        System.out.println(stock2);
//
//        /** update **/
//        stock2.setStockName("HAIO-1");
//        stockBo.update(stock2);

        /** delete **/
        //stockBo.delete(stock2);

        System.out.println("Done");
    }
}
