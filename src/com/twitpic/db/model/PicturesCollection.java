package com.twitpic.db.model;

import java.util.Date;

public class PicturesCollection {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pictures_collection.id
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    private Long id;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pictures_collection.id_collections
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    private Long idCollections;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pictures_collection.id_pictures
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    private Long idPictures;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column pictures_collection.create_time
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    private Date createTime;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pictures_collection.id
     *
     * @return the value of pictures_collection.id
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pictures_collection.id
     *
     * @param id the value for pictures_collection.id
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pictures_collection.id_collections
     *
     * @return the value of pictures_collection.id_collections
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public Long getIdCollections() {
        return idCollections;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pictures_collection.id_collections
     *
     * @param idCollections the value for pictures_collection.id_collections
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public void setIdCollections(Long idCollections) {
        this.idCollections = idCollections;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pictures_collection.id_pictures
     *
     * @return the value of pictures_collection.id_pictures
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public Long getIdPictures() {
        return idPictures;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pictures_collection.id_pictures
     *
     * @param idPictures the value for pictures_collection.id_pictures
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public void setIdPictures(Long idPictures) {
        this.idPictures = idPictures;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column pictures_collection.create_time
     *
     * @return the value of pictures_collection.create_time
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column pictures_collection.create_time
     *
     * @param createTime the value for pictures_collection.create_time
     *
     * @ibatorgenerated Wed Sep 02 16:12:27 CST 2009
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}