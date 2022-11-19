/*
package com.itheima;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.itheima.Dao.UserDao;
import com.itheima.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Map;

@SpringBootTest
class Mybaitisplus01StartApplicationTests {

    @Autowired
    private UserDao userDao;
    @Test
    void contextLoads() {
        List<java.awt.print.Book> books = userDao.selectList(null);
        System.out.println(books);
    }
    @Test
    void testSave(){
        Book book = new Book();
        book.setDescription("itheima777");
        book.setType("java");
        userDao.insert(book);
    }
    @Test
    void testDelete(){
        userDao.deleteById(29);
    }
    @Test
    void testUpdate(){
//        Book book = new Book();
//        book.setId(3L);
//        book.setName("jdk");
//        userDao.updateById(book);

//        //1.先通过要修改的数据id将当前数据查询出来
//        Book book1 = userDao.selectById(3L);
//        //2.将要修改属性逐一设置进去
//        book1.setName("sdg");
//        userDao.updateById(book1);

        //乐观锁案例,每执行一次update方法里面的version就会加一，这是mp特有的方法，
        Book book = userDao.selectById(3L);

        Book book1 = userDao.selectById(3L);

        book.setName("jdk");
        userDao.updateById(book);

        book1.setName("jock33");
        userDao.updateById(book1);
    }
    @Test
    void testGetById(){
        Book book = userDao.selectById(9);
        System.out.println(book);
    }

    @Test
    void testGetByPage(){
        IPage page=new Page(1,6);//查询的是第一页的两条的数据
        userDao.selectPage(page,null);
        System.out.println("当前页码为："+page.getCurrent());
        System.out.println("每页显示数："+page.getSize());
        System.out.println("一共多少页："+page.getPages());
        System.out.println("一共多少数据："+page.getTotal());
        System.out.println("数据："+page.getRecords());
    }

    @Test
    void selectBytiaojian(){
        //第一种方式,按条件查询
        */
/*QueryWrapper qw=new QueryWrapper();//设置条件对象
        qw.lt("id",9);//设置条件
        List<Book> list = userDao.selectList(qw);
        System.out.println(list);*//*


        //第二种方式,lambda按条件查询
        */
/*QueryWrapper<Book> qw=new QueryWrapper<Book>();//设置条件对象
       qw.lambda().lt(Book::getId,5);//设置条件
        List<Book> list = userDao.selectList(qw);
        System.out.println(list);*//*


        //第3种方式,lambda按条件查询
        LambdaQueryWrapper<Book> lqw=new LambdaQueryWrapper<Book>();
       */
/* lqw.lt(Book::getId,5);//设置条件
        lqw.gt(Book::getId,1);//多条件查询*//*

        lqw.lt(Book::getId,5).gt(Book::getId,1);//这是and的关系

        lqw.lt(Book::getId,5).or().gt(Book::getId,1);//or


       // lqw.lt(null!=uq.getAge(),User::getAge,up.getAges())//解决为null的问题
        List<Book> list = userDao.selectList(lqw);
        System.out.println(list);
        System.out.println("-----------");
        //分类查询
        QueryWrapper<Book> lqw2=new QueryWrapper<>();
        lqw2.select("count(*) as count,tel");
        lqw2.groupBy("id");
        List<Map<String, Object>> maps = userDao.selectMaps(lqw2);
        System.out.println(maps);
    }

    @Test
    void selectfeiye(){//分页统计
        QueryWrapper<Book> lqw2=new QueryWrapper<>();
        lqw2.select("count(*) as count,id");
        lqw2.groupBy("id");
        List<Map<String, Object>> maps = userDao.selectMaps(lqw2);
        System.out.println(maps);
    }

    @Test
    void selectBylike(){
        LambdaQueryWrapper<Book>  lqw=new LambdaQueryWrapper<Book>();
        //判断字符like
       */
/* lqw.likeLeft(Book::getName,"微软");*//*
//%微软
        lqw.likeRight(Book::getName,"微软");
        //lqw.like(Book::getName,"微软");微软%
        List<Book> books = userDao.selectList(lqw);
        System.out.println(books);
    }

}
*/
