package com.academy.core.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 * video
 * @author joe
 */
@Data
public class Video implements Serializable {

    public static final Integer CARD_VIDEO = 1;
    public static final Integer BANNER_VIDEO = 2;

    public static final Integer OFF = 0;
    public static final Integer ON = 1;

    public static final Integer TITLE_LENGTH = 40;
    public static final Integer INTRO_LENGTH = 140;
    public static final String VIDEO_FORMAT = "MP4";

    public static final String VIDEO_PIC_PATH = "/video/";

    public static final String PIC_PNG = "PNG";
    public static final String PIC_JPG = "JPG";


    /**
     * 自增id
     */
    private Long id;

    /**
     * 标题
     */
    private String title;

    /**
     * 分类
     */
    private Integer type;

    /**
     * 年级
     */
    private Integer grade;

    /**
     * 所属科目
     */
    private Integer subject;

    /**
     * 老师id
     */
    private Long teacherId;

    /**
     * 老师昵称
     */
    private String teacherNick;

    /**
     * 老师头像
     */
    private String teacherPic;

    /**
     * banner分类封面
     */
    private String cover;

    /**
     * 收藏数
     */
    private Integer collect;

    /**
     * 点赞数
     */
    private Integer like;

    /**
     * 状态
     */
    private Integer status;

    /**
     * 简介
     */
    private String intro;

    private String url;

    /**
     * 视频时长
     */
    private Long time;

    /**
     * 用户收藏状态
     */
    private Integer collectStatus;

    /**
     * 用户点赞状态
     */
    private Integer likeStatus;

    /**
     * 创建时间
     */
    private Long createAt;

    /**
     * 更新时间
     */
    private Long updateAt;

    /**
     * 创建人
     */
    private Long createBy;

    /**
     * 更新人
     */
    private Long updateBy;

    /**
     * 正文
     */
    private String content;

    private static final long serialVersionUID = 1L;
}