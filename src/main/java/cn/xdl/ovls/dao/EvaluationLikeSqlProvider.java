package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.EvaluationLike;
import org.apache.ibatis.jdbc.SQL;

public class EvaluationLikeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation_like
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String insertSelective(EvaluationLike record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("evaluation_like");
        
        if (record.getId() != null) {
            sql.VALUES("Id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getEvaluationId() != null) {
            sql.VALUES("evaluation_id", "#{evaluationId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLikeTime() != null) {
            sql.VALUES("like_time", "#{likeTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table evaluation_like
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String updateByPrimaryKeySelective(EvaluationLike record) {
        SQL sql = new SQL();
        sql.UPDATE("evaluation_like");
        
        if (record.getEvaluationId() != null) {
            sql.SET("evaluation_id = #{evaluationId,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLikeTime() != null) {
            sql.SET("like_time = #{likeTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("Id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}