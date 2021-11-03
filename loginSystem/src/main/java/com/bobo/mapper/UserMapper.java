package com.bobo.mapper;
import com.bobo.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
public interface UserMapper {
    User findById(Integer id);
    User guanlian(Integer id);
}
