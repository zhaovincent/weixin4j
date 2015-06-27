package com.foxinmy.weixin4j.type;

import com.foxinmy.weixin4j.http.ContentType;

/**
 * 上传的媒体类型</br>
 * <p>
 * 公众平台上传限制:</br> 图片(image): 128K,支持JPG,PNG格式</br>
 * 语音(voice):256K,播放长度不超过60s,支持AMR\MP3格式</br> 视频(video):1MB,支持MP4格式</br>
 * 缩略图(thumb):64KB,支持JPG格式</br>
 * </p>
 * <p>
 * 企业号上传限制:</br> 图片（image）:1MB，支持JPG格式</br>
 * 语音（voice）：2MB，播放长度不超过60s，支持AMR格式</br> 视频（video）：10MB，支持MP4格式</br>
 * 普通文件（file）：10MB</br>
 * </p>
 * <p>
 * <font color='red'>媒体文件在后台保存时间为3天,即3天后media_id失效</font>
 * </p>
 * 
 * @author jy.hu
 * @date 2014年4月2日
 * @since JDK 1.7
 */
public enum MediaType {
	image(ContentType.IMAGE_JPG), voice(ContentType.AUDIO_MP3), video(
			ContentType.VIDEO_MPEG4), thumb(ContentType.IMAGE_JPG), file(
			ContentType.APPLICATION_OCTET_STREAM), news(
			ContentType.APPLICATION_OCTET_STREAM);

	MediaType(ContentType contentType) {
		this.contentType = contentType;
	}

	private ContentType contentType;

	public ContentType getContentType() {
		return contentType;
	}
}
