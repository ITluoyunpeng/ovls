package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.LoginHistory;
import org.apache.ibatis.jdbc.SQL;

public class LoginHistorySqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_history
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String insertSelective(LoginHistory record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("login_history");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getUserId() != null) {
            sql.VALUES("user_id", "#{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.VALUES("login_time", "#{loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCity() != null) {
            sql.VALUES("city", "#{city,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.VALUES("ip", "#{ip,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table login_history
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String updateByPrimaryKeySelective(LoginHistory record) {
        SQL sql = new SQL();
        sql.UPDATE("login_history");
        
        if (record.getUserId() != null) {
            sql.SET("user_id = #{userId,jdbcType=INTEGER}");
        }
        
        if (record.getLoginTime() != null) {
            sql.SET("login_time = #{loginTime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getCity() != null) {
            sql.SET("city = #{city,jdbcType=VARCHAR}");
        }
        
        if (record.getIp() != null) {
            sql.SET("ip = #{ip,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}