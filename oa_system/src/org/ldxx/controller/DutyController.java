package org.ldxx.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.ldxx.bean.Duty;
import org.ldxx.service.DutyService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("duty")
public class DutyController {

	@Autowired
	private DutyService dservice;
	
	
	@RequestMapping("/addDuty")
	@ResponseBody
	public Map<String,Object> addDuty(Duty duty){
		Map<String,Object> map=new HashMap<>();
		
		int i=dservice.countOfDutyName(duty.getDutyName(), duty.getOmId());
		if(i<1){
			TimeUUID uuid=new TimeUUID();
			String id=uuid.getTimeUUID();
			duty.setDutyId(id);
			i=dservice.addDuty(duty);
		}else{
			i=2;
		}
		map.put("result", i);
		map.put("duty", duty);
		return map;
	}
	
	@RequestMapping("/deleteDutyById")
	@ResponseBody
	public int deleteDutyById(String id){
		return dservice.deleteDutyById(id);
	}
	
	
	@RequestMapping("/updateDutyById")
	@ResponseBody
	public Map<String,Object> updateDutyById(Duty duty){
		Map<String,Object> map=new HashMap<>();
		
		int i=dservice.countOfDutyNameToEdit(duty.getDutyName(), duty.getOmId(),duty.getDutyId());
		if(i<1){
			i=dservice.updateDutyById(duty);
		}else{
			i=2;
		}
		map.put("result", i);
		map.put("duty", duty);
		return map;
	}
	
	
	@RequestMapping("/selectDutyByOmId")
	@ResponseBody
	public List<Duty> selectDutyByOmId(String id){
		return dservice.selectDutyByOmId(id);
	}
	
	@RequestMapping("/selectDutyBydutyId")
	@ResponseBody
	public Duty selectDutyBydutyId(String dutyId){
		return dservice.selectDutyBydutyId(dutyId);
	}
	
	@RequestMapping("/selectDutyByOmIdAndJobType")
	@ResponseBody
	public List<Duty> selectDutyByOmIdAndJobType(String omId,String jobType){
		return dservice.selectDutyByOmIdAndJobType(omId,jobType);
	}
	
	@RequestMapping("/selectDutyByUserId")
	@ResponseBody
	public List<Duty> selectDutyByUserId(String id){
		return dservice.selectDutyByUserId(id);
	}
}
