package cn.xdl.ovls.entity;

import java.util.Date;

public class CollectCourse {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect_course.Id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect_course.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect_course.course_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column collect_course.collect_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Date collectTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect_course.Id
     *
     * @return the value of collect_course.Id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect_course.Id
     *
     * @param id the value for collect_course.Id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect_course.user_id
     *
     * @return the value of collect_course.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect_course.user_id
     *
     * @param userId the value for collect_course.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect_course.course_id
     *
     * @return the value of collect_course.course_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect_course.course_id
     *
     * @param courseId the value for collect_course.course_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column collect_course.collect_time
     *
     * @return the value of collect_course.collect_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Date getCollectTime() {
        return collectTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column collect_course.collect_time
     *
     * @param collectTime the value for collect_course.collect_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }
}