package com.qingcheng.pojo.business;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

/**
 * activity实体类
 * @author Administrator
 *
 */
@Table(name="tb_activity")
public class Activity implements Serializable{

	@Id
	private Integer id;//ID


	

	private String title;//活动标题

	private Date startTime;//开始时间

	private Date endTime;//结束时间

	private String status;//状态

	private String content;//活动内容

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}


	
}
