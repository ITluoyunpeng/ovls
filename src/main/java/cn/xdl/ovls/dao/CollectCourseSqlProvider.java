package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.CollectCourse;
import org.apache.ibatis.jdbc.SQL;

public class CollectCourseSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String insertSelective(CollectCourse record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("collect_course");
        
        if (record.getId() != null) {
            sql.VALUES("Id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCourseId() != null) {
            sql.VALUES("course_id", "#{courseId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectTime() != null) {
            sql.VALUES("collect_time", "#{collectTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table collect_course
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String updateByPrimaryKeySelective(CollectCourse record) {
        SQL sql = new SQL();
        sql.UPDATE("collect_course");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getCourseId() != null) {
            sql.SET("course_id = #{courseId,jdbcType=INTEGER}");
        }
        
        if (record.getCollectTime() != null) {
            sql.SET("collect_time = #{collectTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("Id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}