package skyline.platform.repository.model.model_show;

public class MyTHrmNewsAndDept {

    private String id;
    private String newsTitle;
    private String newsImg;
    private String newsImgFlag;
    private String newsAttachment;
    private String modelId;
    private String teamId;
    private String newsIstop;
    private String newsToptime;
    private String isenable;
    private String newsCreatedtime;
    private String newsContent;
    private String nameDept;
    private String stripLine;

    /**
     * getting And setting
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsImg() {
        return newsImg;
    }

    public void setNewsImg(String newsImg) {
        this.newsImg = newsImg == null ? null : newsImg.trim();
    }

    public String getNewsImgFlag() {
        return newsImgFlag;
    }
    public void setNewsImgFlag(String newsImgFlag) {
        this.newsImgFlag = newsImgFlag == null ? null : newsImgFlag.trim();
    }

    public String getNewsAttachment() {
        return newsAttachment;
    }

    public void setNewsAttachment(String newsAttachment) {
        this.newsAttachment = newsAttachment == null ? null : newsAttachment.trim();
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId == null ? null : modelId.trim();
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId == null ? null : teamId.trim();
    }

    public String getNewsIstop() {
        return newsIstop;
    }

    public void setNewsIstop(String newsIstop) {
        this.newsIstop = newsIstop == null ? null : newsIstop.trim();
    }

    public String getNewsToptime() {
        return newsToptime;
    }

    public void setNewsToptime(String newsToptime) {
        this.newsToptime = newsToptime == null ? null : newsToptime.trim();
    }


    public String getIsenable() {
        return isenable;
    }


    public void setIsenable(String isenable) {
        this.isenable = isenable == null ? null : isenable.trim();
    }

    public String getNewsCreatedtime() {
        return newsCreatedtime;
    }


    public void setNewsCreatedtime(String newsCreatedtime) {
        this.newsCreatedtime = newsCreatedtime == null ? null : newsCreatedtime.trim();
    }


    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public String getNameDept() {
        return nameDept;
    }

    public void setNameDept(String nameDept) {
        this.nameDept = nameDept;
    }

    public String getStripLine() {
        return stripLine;
    }

    public void setStripLine(String stripLine) {
        this.stripLine = stripLine;
    }
}