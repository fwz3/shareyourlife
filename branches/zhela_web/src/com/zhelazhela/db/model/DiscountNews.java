package com.zhelazhela.db.model;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

public class DiscountNews{
	
	private static DecimalFormat df = new DecimalFormat("######0.0");
	
	private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.approve_user
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String approveUser;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.approve_result
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Boolean approveResult;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.approve_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Date approveTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.sender_name
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String senderName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.sender_mail
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String senderMail;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.sender_link
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String senderLink;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.sender_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Date senderTime;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.read_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long readTimes;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.support_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long supportTimes;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.content_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long contentPoints;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.content_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long contentPointsTimes;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.publish_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long publishPoints;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.publish_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long publishPointsTimes;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.p_id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Long pId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.discount_category
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String discountCategory;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.discount_area
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String discountArea;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.discount_start
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Date discountStart;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.discount_end
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private Date discountEnd;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.news_source
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String newsSource;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.news_title
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String newsTitle;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.news_review
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String newsReview;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column discount_news.news_content
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    private String newsContent;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.id
     *
     * @return the value of discount_news.id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.id
     *
     * @param id the value for discount_news.id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.approve_user
     *
     * @return the value of discount_news.approve_user
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getApproveUser() {
        return approveUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.approve_user
     *
     * @param approveUser the value for discount_news.approve_user
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setApproveUser(String approveUser) {
        this.approveUser = approveUser;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.approve_result
     *
     * @return the value of discount_news.approve_result
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Boolean getApproveResult() {
        return approveResult;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.approve_result
     *
     * @param approveResult the value for discount_news.approve_result
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setApproveResult(Boolean approveResult) {
        this.approveResult = approveResult;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.approve_time
     *
     * @return the value of discount_news.approve_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.approve_time
     *
     * @param approveTime the value for discount_news.approve_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.sender_name
     *
     * @return the value of discount_news.sender_name
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getSenderName() {
        return senderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.sender_name
     *
     * @param senderName the value for discount_news.sender_name
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.sender_mail
     *
     * @return the value of discount_news.sender_mail
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getSenderMail() {
        return senderMail;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.sender_mail
     *
     * @param senderMail the value for discount_news.sender_mail
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setSenderMail(String senderMail) {
        this.senderMail = senderMail;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.sender_link
     *
     * @return the value of discount_news.sender_link
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getSenderLink() {
        return senderLink;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.sender_link
     *
     * @param senderLink the value for discount_news.sender_link
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setSenderLink(String senderLink) {
        this.senderLink = senderLink;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.sender_time
     *
     * @return the value of discount_news.sender_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Date getSenderTime() {
        return senderTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.sender_time
     *
     * @param senderTime the value for discount_news.sender_time
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setSenderTime(Date senderTime) {
        this.senderTime = senderTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.read_times
     *
     * @return the value of discount_news.read_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getReadTimes() {
        return readTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.read_times
     *
     * @param readTimes the value for discount_news.read_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setReadTimes(Long readTimes) {
        this.readTimes = readTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.support_times
     *
     * @return the value of discount_news.support_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getSupportTimes() {
        return supportTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.support_times
     *
     * @param supportTimes the value for discount_news.support_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setSupportTimes(Long supportTimes) {
        this.supportTimes = supportTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.content_points
     *
     * @return the value of discount_news.content_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getContentPoints() {
        return contentPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.content_points
     *
     * @param contentPoints the value for discount_news.content_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setContentPoints(Long contentPoints) {
        this.contentPoints = contentPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.content_points_times
     *
     * @return the value of discount_news.content_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getContentPointsTimes() {
        return contentPointsTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.content_points_times
     *
     * @param contentPointsTimes the value for discount_news.content_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setContentPointsTimes(Long contentPointsTimes) {
        this.contentPointsTimes = contentPointsTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.publish_points
     *
     * @return the value of discount_news.publish_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getPublishPoints() {
        return publishPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.publish_points
     *
     * @param publishPoints the value for discount_news.publish_points
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setPublishPoints(Long publishPoints) {
        this.publishPoints = publishPoints;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.publish_points_times
     *
     * @return the value of discount_news.publish_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getPublishPointsTimes() {
        return publishPointsTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.publish_points_times
     *
     * @param publishPointsTimes the value for discount_news.publish_points_times
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setPublishPointsTimes(Long publishPointsTimes) {
        this.publishPointsTimes = publishPointsTimes;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.p_id
     *
     * @return the value of discount_news.p_id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Long getpId() {
        return pId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.p_id
     *
     * @param pId the value for discount_news.p_id
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setpId(Long pId) {
        this.pId = pId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.discount_category
     *
     * @return the value of discount_news.discount_category
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getDiscountCategory() {
        return discountCategory;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.discount_category
     *
     * @param discountCategory the value for discount_news.discount_category
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setDiscountCategory(String discountCategory) {
        this.discountCategory = discountCategory;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.discount_area
     *
     * @return the value of discount_news.discount_area
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getDiscountArea() {
        return discountArea;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.discount_area
     *
     * @param discountArea the value for discount_news.discount_area
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setDiscountArea(String discountArea) {
        this.discountArea = discountArea;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.discount_start
     *
     * @return the value of discount_news.discount_start
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Date getDiscountStart() {
        return discountStart;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.discount_start
     *
     * @param discountStart the value for discount_news.discount_start
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setDiscountStart(Date discountStart) {
        this.discountStart = discountStart;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.discount_end
     *
     * @return the value of discount_news.discount_end
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public Date getDiscountEnd() {
        return discountEnd;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.discount_end
     *
     * @param discountEnd the value for discount_news.discount_end
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setDiscountEnd(Date discountEnd) {
        this.discountEnd = discountEnd;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.news_source
     *
     * @return the value of discount_news.news_source
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getNewsSource() {
        return newsSource;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.news_source
     *
     * @param newsSource the value for discount_news.news_source
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.news_title
     *
     * @return the value of discount_news.news_title
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getNewsTitle() {
        return newsTitle;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.news_title
     *
     * @param newsTitle the value for discount_news.news_title
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.news_review
     *
     * @return the value of discount_news.news_review
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getNewsReview() {
        return newsReview;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.news_review
     *
     * @param newsReview the value for discount_news.news_review
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setNewsReview(String newsReview) {
        this.newsReview = newsReview;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column discount_news.news_content
     *
     * @return the value of discount_news.news_content
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public String getNewsContent() {
        return newsContent;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column discount_news.news_content
     *
     * @param newsContent the value for discount_news.news_content
     *
     * @ibatorgenerated Fri Dec 18 16:20:44 CST 2009
     */
    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent;
    }
    
    private ProgramInfo programInfo;
    
    public ProgramInfo getProgramInfo() {
		return programInfo;
	}

	public void setProgramInfo(ProgramInfo programInfo) {
		this.programInfo = programInfo;
	}

	public boolean validate(){
    	if(StringUtils.isBlank(senderName)||StringUtils.isBlank(senderMail)||
    			pId==null||StringUtils.isBlank(discountCategory)||StringUtils.isBlank(discountArea)||
    			discountStart==null||discountEnd==null||StringUtils.isBlank(newsSource)||
    			StringUtils.isBlank(newsTitle)||StringUtils.isBlank(newsReview)||StringUtils.isBlank(newsContent)){
    		return false;
    	}
    	return true;
    }
	
	 private String discountStartStr;

	 private String discountEndStr;

	public String getDiscountStartStr() {
		return discountStartStr;
	}

	public void setDiscountStartStr(String discountStartStr) {
		this.discountStartStr = discountStartStr;
		try{
			discountStart = format.parse(discountStartStr);
		}catch(Exception e){
			
		}
	}

	public String getDiscountEndStr() {
		return discountEndStr;
	}

	public void setDiscountEndStr(String discountEndStr) {
		this.discountEndStr = discountEndStr;
		try{
			discountEnd = format.parse(discountEndStr);
		}catch(Exception e){
			
		}
	}
	public String getAvePPoints(){
		if(getPublishPointsTimes()==null||getPublishPointsTimes()==0){
			return "0";
		}
		double avg_points = (double)getPublishPoints()/(double)getPublishPointsTimes();
		return df.format(avg_points);
	}
	
	public String getAveCPoints(){
		if(getContentPointsTimes()==null||getContentPointsTimes()==0){
			return "0";
		}
		double avg_points = (double)getContentPoints()/(double)getContentPointsTimes();
		return df.format(avg_points);
	}
}