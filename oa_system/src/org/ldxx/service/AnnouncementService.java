package org.ldxx.service;

import java.util.List;

import org.ldxx.bean.Accessory;
import org.ldxx.bean.Announcement;

public interface AnnouncementService {

	public int addAnnouncement(Announcement announcement);
	
	public int deleteAnnouncement(String id);
	
	public int deleteAccessory(String id);
	
	public int updateAnnouncement(Announcement announcement);
	
	public List<Announcement> selectAnnouncement(String type,String status);
	
	public List<Accessory> selectAccessory(String id);
	
	public int deleteAccessoryByIdAndName(Accessory accessory);
}
