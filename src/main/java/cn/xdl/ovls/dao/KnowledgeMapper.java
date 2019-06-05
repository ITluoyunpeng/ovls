package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.Knowledge;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface KnowledgeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Delete({
        "delete from knowledge",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Insert({
        "insert into knowledge (Id, name, ",
        "subject_id, chapter_id)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{subjectId,jdbcType=INTEGER}, #{chapterId,jdbcType=INTEGER})"
    })
    int insert(Knowledge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @InsertProvider(type=KnowledgeSqlProvider.class, method="insertSelective")
    int insertSelective(Knowledge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Select({
        "select",
        "Id, name, subject_id, chapter_id",
        "from knowledge",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="Id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject_id", property="subjectId", jdbcType=JdbcType.INTEGER),
        @Result(column="chapter_id", property="chapterId", jdbcType=JdbcType.INTEGER)
    })
    Knowledge selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @UpdateProvider(type=KnowledgeSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(Knowledge record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    @Update({
        "update knowledge",
        "set name = #{name,jdbcType=VARCHAR},",
          "subject_id = #{subjectId,jdbcType=INTEGER},",
          "chapter_id = #{chapterId,jdbcType=INTEGER}",
        "where Id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Knowledge record);
}