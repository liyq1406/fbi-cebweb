package skyline.platform.repository.model;

public class THrmBranch {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_branch.branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    private String branch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_branch.name_branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    private String nameBranch;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_branch.describe
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    private String describe;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_hrm_branch.category
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    private String category;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_branch.branch
     *
     * @return the value of t_hrm_branch.branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public String getBranch() {
        return branch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_branch.branch
     *
     * @param branch the value for t_hrm_branch.branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public void setBranch(String branch) {
        this.branch = branch == null ? null : branch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_branch.name_branch
     *
     * @return the value of t_hrm_branch.name_branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public String getNameBranch() {
        return nameBranch;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_branch.name_branch
     *
     * @param nameBranch the value for t_hrm_branch.name_branch
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public void setNameBranch(String nameBranch) {
        this.nameBranch = nameBranch == null ? null : nameBranch.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_branch.describe
     *
     * @return the value of t_hrm_branch.describe
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public String getDescribe() {
        return describe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_branch.describe
     *
     * @param describe the value for t_hrm_branch.describe
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public void setDescribe(String describe) {
        this.describe = describe == null ? null : describe.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_hrm_branch.category
     *
     * @return the value of t_hrm_branch.category
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_hrm_branch.category
     *
     * @param category the value for t_hrm_branch.category
     *
     * @mbggenerated Tue Oct 27 20:45:26 CST 2015
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }
}