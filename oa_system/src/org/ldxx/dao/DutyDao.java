package org.ldxx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.ldxx.bean.Duty;

public interface DutyDao {

	public int addDuty(@Param("duty")Duty duty);
	
	public int deleteDutyById(@Param("id")String id);
	
	public int updateDutyById(@Param("duty")Duty duty);
	
	public List<Duty> selectDutyByOmId(@Param("omId")String omId);
	
	public int countOfDutyName(@Param("name")String name,@Param("omId")String omId);
	
	public int countOfDutyNameToEdit(@Param("name")String name,@Param("omId")String omId,@Param("dutyId")String dutyId);

	public List<Duty> selectDutyByOmIdAndJobType(@Param("omId")String omId,@Param("jobType") String jobType);

	public Duty selectDutyBydutyId(@Param("dutyId")String dutyId);
	
	public List<Duty> selectDutyByUserId(@Param("id")String id);
}
