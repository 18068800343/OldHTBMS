package org.ldxx.service.impl;

import java.util.List;
import java.util.UUID;

import org.ldxx.bean.Dictionary;
import org.ldxx.bean.DictionaryFirst;
import org.ldxx.dao.ProjectTypeDao;
import org.ldxx.service.ProjectTypeService;
import org.ldxx.util.TimeUUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProjectTypeServiceImpl implements ProjectTypeService {
	
	@Autowired
	private ProjectTypeDao projectTypeDao;

	@Override
	public int addOneProjectType(DictionaryFirst dictionaryFirst) {
		TimeUUID uuid=new TimeUUID();
		dictionaryFirst.setIdFirst(uuid.getTimeUUID());
		dictionaryFirst.setType("1");
		return projectTypeDao.addOneProjectType(dictionaryFirst);
	}
	
	@Override
	public int deleteFirstPrj(String idFirst) {
		int i = projectTypeDao.deleteOne_TwoPrj(idFirst);
		if(i>=0){
			i = projectTypeDao.deleteOnePrj(idFirst);
		}
		return i;
	}
	
	@Override
	public int updateFirstPrj(DictionaryFirst dictionaryFirst) {
		return projectTypeDao.updateFirstPrj(dictionaryFirst);
	}

	@Override
	public List<DictionaryFirst> selectAllFirstPrj() {
		return projectTypeDao.selectAllFirstPrj();
	}
	
	@Override
	public int addTwoPrj(Dictionary dictionary) {
		TimeUUID uuid=new TimeUUID();
		dictionary.setdId(uuid.getTimeUUID());
		return projectTypeDao.addTwoPrj(dictionary);
	}
	
	@Override
	public int deleteTwoPrj(String dId) {
		return projectTypeDao.deleteTwoPrj(dId);
	}

	@Override
	public int updateTwoPrj(Dictionary dictionary) {
		return projectTypeDao.updateTwoPrj(dictionary);
	}

	@Override
	public List<Dictionary> selectAllTwoPrj() {
		return projectTypeDao.selectAllTwoPrj();
	}

	@Override
	public List<Dictionary> selectOne_TwoPrj(String idFirst) {
		return projectTypeDao.selectOne_TwoPrj(idFirst);
	}

	@Override
	public int addFirstcostSubjects(DictionaryFirst dictionaryFirst) {
		TimeUUID uuid=new TimeUUID();
		dictionaryFirst.setIdFirst(uuid.getTimeUUID());
		dictionaryFirst.setType("2");
		return projectTypeDao.addOneProjectType(dictionaryFirst);
	}

	@Override
	public List<DictionaryFirst> selectAllFirstcostSubjects() {
		return projectTypeDao.selectAllFirstcostSubjects();
	}

	@Override
	public DictionaryFirst selectOneIdByName(String nameFirst) {
		return projectTypeDao.selectOneIdByName(nameFirst);
	}
	

}
