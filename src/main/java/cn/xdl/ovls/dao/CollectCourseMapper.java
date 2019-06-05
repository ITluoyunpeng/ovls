package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.CollectCourse;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface CollectCourseMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Delete({
        "delete from collect_course",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Insert({
        "insert into collect_course (Id, user_id, ",
        "course_id, collect_time)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{courseId,jdbcType=INTEGER}, #{collectTime,jdbcType=TIMESTAMP})"
    })
    int insert(CollectCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @InsertProvider(type=CollectCourseSqlProvider.class, method="insertSelective")
    int insertSelective(CollectCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Select({
        "select",
        "Id, user_id, course_id, collect_time",
        "from collect_course",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="course_id", property="courseId", jdbcType=JdbcType.INTEGER),
        @Result(column="collect_time", property="collectTime", jdbcType=JdbcType.TIMESTAMP)
    })
    CollectCourse selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @UpdateProvider(type=CollectCourseSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CollectCourse record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Update({
        "update collect_course",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "course_id = #{courseId,jdbcType=INTEGER},",
          "collect_time = #{collectTime,jdbcType=TIMESTAMP}",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CollectCourse record);
}