package hs.bm.bean;

public class ChkPassRegular {

	/**检查记录编号*/
	private String chk_id;
	/**项目编号*/
	private String prj_id;
	/**路线编号*/
	private String line_no;
	/**路线名称*/
	private String line_name;
	/**通道桩号*/
	private String culvert_stub_no;
	/**养护单位*/
	private String maintain_org;
	/**通道编号*/
	private String pass_id;
	/**检查时间*/
	private String check_date;
	/**涵洞技术状况总评（好、较好、较差、差、危险）*/
	private String tech_status_level;
	/**养护方案（日常养护、维修、加固、改建）*/
	private String maintain_solution;
	/**下次检查时间*/
	private String next_check_date;
	/**审核状态*/
	private String audit_state;
	/***/
	private String eval_level;
	/**负责人*/
	private String response_person;
	/**检验员*/
	private String inspection_person;
	/**涵洞类型,在涵洞卡片中有，字段名相同，请同步到这里*/
	private String pass_type;
	/**孔径在涵洞卡片中有，字段名相同，请同步到这里*/
	private String pass_aperture;

	public void setChk_id(String chk_id){
		this.chk_id=chk_id;
	}

	public String getChk_id(){
		return chk_id;
	}

	public void setPrj_id(String prj_id){
		this.prj_id=prj_id;
	}

	public String getPrj_id(){
		return prj_id;
	}

	public void setLine_no(String line_no){
		this.line_no=line_no;
	}

	public String getLine_no(){
		return line_no;
	}

	public void setLine_name(String line_name){
		this.line_name=line_name;
	}

	public String getLine_name(){
		return line_name;
	}

	public void setCulvert_stub_no(String culvert_stub_no){
		this.culvert_stub_no=culvert_stub_no;
	}

	public String getCulvert_stub_no(){
		return culvert_stub_no;
	}

	public void setMaintain_org(String maintain_org){
		this.maintain_org=maintain_org;
	}

	public String getMaintain_org(){
		return maintain_org;
	}

	public void setPass_id(String pass_id){
		this.pass_id=pass_id;
	}

	public String getPass_id(){
		return pass_id;
	}

	public void setCheck_date(String check_date){
		this.check_date=check_date;
	}

	public String getCheck_date(){
		return check_date;
	}

	public void setTech_status_level(String tech_status_level){
		this.tech_status_level=tech_status_level;
	}

	public String getTech_status_level(){
		return tech_status_level;
	}

	public void setMaintain_solution(String maintain_solution){
		this.maintain_solution=maintain_solution;
	}

	public String getMaintain_solution(){
		return maintain_solution;
	}

	public void setNext_check_date(String next_check_date){
		this.next_check_date=next_check_date;
	}

	public String getNext_check_date(){
		return next_check_date;
	}

	public void setAudit_state(String audit_state){
		this.audit_state=audit_state;
	}

	public String getAudit_state(){
		return audit_state;
	}

	public void setEval_level(String eval_level){
		this.eval_level=eval_level;
	}

	public String getEval_level(){
		return eval_level;
	}

	public void setResponse_person(String response_person){
		this.response_person=response_person;
	}

	public String getResponse_person(){
		return response_person;
	}

	public void setInspection_person(String inspection_person){
		this.inspection_person=inspection_person;
	}

	public String getInspection_person(){
		return inspection_person;
	}

	public void setPass_type(String pass_type){
		this.pass_type=pass_type;
	}

	public String getPass_type(){
		return pass_type;
	}

	public void setPass_aperture(String pass_aperture){
		this.pass_aperture=pass_aperture;
	}

	public String getPass_aperture(){
		return pass_aperture;
	}

}
