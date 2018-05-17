package org.mybatis.example;

import org.apache.ibatis.annotations.Select;

/**
 * @Author: Zezhao.Zhu
 * @Description:
 * @Create: 2018/5/14 14:05
 * @Modified By：
 */
public interface BlogMapper {
    @Select("SELECT * FROM blog WHERE id = #{id}")
    int selectBlog(int id);
}
