package skyline.platform.repository.model;

public class THrmNews {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_news.id
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    private byte[] id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_news.news_title
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    private String newsTitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_news.news_istop
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    private String newsIstop;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_news.isenable
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    private String isenable;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_news.id
     *
     * @return the value of t_hrm_news.id
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public byte[] getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_news.id
     *
     * @param id the value for t_hrm_news.id
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public void setId(byte[] id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_news.news_title
     *
     * @return the value of t_hrm_news.news_title
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_news.news_title
     *
     * @param newsTitle the value for t_hrm_news.news_title
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_news.news_istop
     *
     * @return the value of t_hrm_news.news_istop
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public String getNewsIstop() {
        return newsIstop;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_news.news_istop
     *
     * @param newsIstop the value for t_hrm_news.news_istop
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public void setNewsIstop(String newsIstop) {
        this.newsIstop = newsIstop == null ? null : newsIstop.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_news.isenable
     *
     * @return the value of t_hrm_news.isenable
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public String getIsenable() {
        return isenable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_news.isenable
     *
     * @param isenable the value for t_hrm_news.isenable
     *
     * @mbggenerated Wed Oct 21 20:16:14 CST 2015
     */
    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }
}