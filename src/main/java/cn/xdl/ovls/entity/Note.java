package cn.xdl.ovls.entity;

import java.util.Date;

public class Note {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.publish_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Date publishTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.like_count
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.video_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private Integer videoId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.title
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column note.context
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    private String context;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.id
     *
     * @return the value of note.id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.id
     *
     * @param id the value for note.id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.publish_time
     *
     * @return the value of note.publish_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Date getPublishTime() {
        return publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.publish_time
     *
     * @param publishTime the value for note.publish_time
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.like_count
     *
     * @return the value of note.like_count
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.like_count
     *
     * @param likeCount the value for note.like_count
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.user_id
     *
     * @return the value of note.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.user_id
     *
     * @param userId the value for note.user_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.video_id
     *
     * @return the value of note.video_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public Integer getVideoId() {
        return videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.video_id
     *
     * @param videoId the value for note.video_id
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setVideoId(Integer videoId) {
        this.videoId = videoId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.title
     *
     * @return the value of note.title
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.title
     *
     * @param title the value for note.title
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column note.context
     *
     * @return the value of note.context
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public String getContext() {
        return context;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column note.context
     *
     * @param context the value for note.context
     *
     * @mbg.generated Wed Jun 05 10:30:51 CST 2019
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }
}