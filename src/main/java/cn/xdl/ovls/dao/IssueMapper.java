package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.Issue;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface IssueMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Delete({
        "delete from issue",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Insert({
        "insert into issue (id, headline, ",
        "issue_context, publish_time, ",
        "answer_count, browse_count, ",
        "video_id, user_id, ",
        "right_answer_id)",
        "values (#{id,jdbcType=INTEGER}, #{headline,jdbcType=VARCHAR}, ",
        "#{issueContext,jdbcType=VARCHAR}, #{publishTime,jdbcType=TIMESTAMP}, ",
        "#{answerCount,jdbcType=INTEGER}, #{browseCount,jdbcType=INTEGER}, ",
        "#{videoId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{rightAnswerId,jdbcType=INTEGER})"
    })
    int insert(Issue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @InsertProvider(type=IssueSqlProvider.class, method="insertSelective")
    int insertSelective(Issue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Select({
        "select",
        "id, headline, issue_context, publish_time, answer_count, browse_count, video_id, ",
        "user_id, right_answer_id",
        "from issue",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="headline", property="headline", jdbcType=JdbcType.VARCHAR),
        @Result(column="issue_context", property="issueContext", jdbcType=JdbcType.VARCHAR),
        @Result(column="publish_time", property="publishTime", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="answer_count", property="answerCount", jdbcType=JdbcType.INTEGER),
        @Result(column="browse_count", property="browseCount", jdbcType=JdbcType.INTEGER),
        @Result(column="video_id", property="videoId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="right_answer_id", property="rightAnswerId", jdbcType=JdbcType.INTEGER)
    })
    Issue selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @UpdateProvider(type=IssueSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Issue record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table issue
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Update({
        "update issue",
        "set headline = #{headline,jdbcType=VARCHAR},",
          "issue_context = #{issueContext,jdbcType=VARCHAR},",
          "publish_time = #{publishTime,jdbcType=TIMESTAMP},",
          "answer_count = #{answerCount,jdbcType=INTEGER},",
          "browse_count = #{browseCount,jdbcType=INTEGER},",
          "video_id = #{videoId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "right_answer_id = #{rightAnswerId,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Issue record);
}