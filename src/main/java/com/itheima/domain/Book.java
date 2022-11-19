package com.itheima.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

@Data//替代了之前的set,get的方法，记得添加坐标
@TableName("tb_book")
public class Book {


   // @TableId(type = IdType.INPUT)//用户要添加id
   // @TableId(type = IdType.ASSIGN_ID)//雪花生成的id，如果没有id，用不了
   //@TableId(type = IdType.AUTO)//添加数据时id自增
    private long id;

    private String type;

    @TableField(value ="name",select = false)//把这个属性设为name，并且不查询
    private String name;

    private String description;

    @TableField(exist = false)
    private Integer online;

    //逻辑删除字段，标记当前记录是否被删除
   // @TableLogic(value = "0",delval = "1")//逻辑删除
    private Integer deleted;

    @Version
    private Integer version;

}
