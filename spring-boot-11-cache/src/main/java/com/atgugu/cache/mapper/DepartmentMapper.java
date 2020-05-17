package com.atgugu.cache.mapper;

import com.atgugu.cache.bean.Department;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @version v1.0
 * @Author yangchen
 * @date 2020/5/17 15:05
 * @Description:
 */
@Mapper
public interface DepartmentMapper {

    @Select("SELECT * FROM department WHERE id = #{id}")
    Department getDeptById(Integer id);
}
