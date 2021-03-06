package cn.xdl.ovls.dao;

import cn.xdl.ovls.entity.PaperKnowledge;
import org.apache.ibatis.jdbc.SQL;

public class PaperKnowledgeSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String insertSelective(PaperKnowledge record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("paper_knowledge");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=INTEGER}");
        }
        
        if (record.getPaperId() != null) {
            sql.VALUES("paper_id", "#{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            sql.VALUES("knowledge_id", "#{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionNum() != null) {
            sql.VALUES("question_num", "#{questionNum,jdbcType=INTEGER}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_knowledge
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String updateByPrimaryKeySelective(PaperKnowledge record) {
        SQL sql = new SQL();
        sql.UPDATE("paper_knowledge");
        
        if (record.getPaperId() != null) {
            sql.SET("paper_id = #{paperId,jdbcType=INTEGER}");
        }
        
        if (record.getKnowledgeId() != null) {
            sql.SET("knowledge_id = #{knowledgeId,jdbcType=INTEGER}");
        }
        
        if (record.getQuestionNum() != null) {
            sql.SET("question_num = #{questionNum,jdbcType=INTEGER}");
        }
        
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        
        return sql.toString();
    }
}