package com.bjpowernode.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
    @NoArgsConstructor //无参构造
    @AllArgsConstructor  //有参构造方法
    @Getter     //get方法
    @Setter     //set方法
    @EqualsAndHashCode   //equals(Object other) 和 hashCode()方法

   以上5个注解统一用@Data注解代替
*/
@Data
public class User {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id; //表中类型为Bigint

    private String name;

    private Integer age;

    private String email;

}
