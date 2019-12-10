<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@page import="com.alibaba.fastjson.JSON"%>   
      
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>华通桥涵管理系统</title>
		
		<meta name="description" content="">
		<meta name="author" content="">
			
		<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">

		<!-- Basic Styles -->
		<link rel="stylesheet" type="text/css" media="screen" href="../css/bootstrap.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="../css/font-awesome.min.css">

		<!-- SmartAdmin Styles : Caution! DO NOT change the order -->
		<link rel="stylesheet" type="text/css" media="screen" href="../css/smartadmin-production-plugins.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="../css/smartadmin-production.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="../css/smartadmin-skins.min.css">
		<link rel="stylesheet" type="text/css" media="screen" href="../css/font.css">
		<!-- SmartAdmin RTL Support  -->
		<link rel="stylesheet" type="text/css" media="screen" href="../css/smartadmin-rtl.min.css">

		<!-- We recommend you use "your_style.css" to override SmartAdmin
		     specific styles this will also ensure you retrain your customization with each SmartAdmin update.
		<link rel="stylesheet" type="text/css" media="screen" href="css/your_style.css"> -->

		<!-- Demo purpose only: goes with demo.js, you can delete this css when designing your own WebApp -->

		<!-- FAVICONS -->
		<link rel="shortcut icon" href="../img/favicon/favicon.ico" type="image/x-icon">
		<link rel="icon" href="../img/favicon/favicon.ico" type="image/x-icon">


		<!-- Specifying a Webpage Icon for Web Clip 
			 Ref: https://developer.apple.com/library/ios/documentation/AppleApplications/Reference/SafariWebContent/ConfiguringWebApplications/ConfiguringWebApplications.html -->
		<link rel="apple-touch-icon" href="../img/splash/sptouch-icon-iphone.png">
		<link rel="apple-touch-icon" sizes="76x76" href="../img/splash/touch-icon-ipad.png">
		<link rel="apple-touch-icon" sizes="120x120" href="../img/splash/touch-icon-iphone-retina.png">
		<link rel="apple-touch-icon" sizes="152x152" href="../img/splash/touch-icon-ipad-retina.png">
		
		<!-- iOS web-app metas : hides Safari UI Components and Changes Status Bar Appearance -->
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		
		<!-- Startup image for web apps -->
		<link rel="apple-touch-startup-image" href="../img/splash/ipad-landscape.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:landscape)">
		<link rel="apple-touch-startup-image" href="../img/splash/ipad-portrait.png" media="screen and (min-device-width: 481px) and (max-device-width: 1024px) and (orientation:portrait)">
		<link rel="apple-touch-startup-image" href="../img/splash/iphone.png" media="screen and (max-device-width: 320px)">
		<style type="text/css">
		.loading{  
	    width:220px;  
	    height:56px;  
		position:fixed;
	    top:50%;  
	    left:50%;  
	    line-height:56px;  
	    color:#fff;  
	    padding-left:60px;  
	    font-size:15px;  
	    background: #000 url(../img/loader.gif) no-repeat 10px 50%;  
	    z-index:9999;  
	    -moz-border-radius:20px;  
	    -webkit-border-radius:20px;  
	    border-radius:20px;  
	    filter:progid:DXImageTransform.Microsoft.Alpha(opacity=70);
	      
	}  
	.cover {
	position:fixed; 
	top: 0px; 
	right:0px; 
	bottom:0px;
	filter: alpha(opacity=60);
	 background-color: #E2E2E2;
	z-index: 8888; left: 0px; 
	display:none;
	opacity:0.6; 
	-moz-opacity:0.5;
	}
	
	
</style>
	</head>
	<body class="">
		<%@ include file="header.jsp" %>
		<%@ include file="menu.jsp" %>
		
		<!-- #MAIN PANEL -->
		<div id="main" role="main">
		
			<!-- RIBBON -->
			<div id="ribbon">

				<span class="ribbon-button-alignment"> 
					<span id="refresh" class="btn btn-ribbon" data-action="resetWidgets" data-title="refresh"  rel="tooltip" data-placement="bottom" data-original-title="<i class='text-warning fa fa-warning'></i> 清除缓存" data-html="true">
						<i class="fa fa-refresh"></i>
					</span> 
				</span>

				<!-- breadcrumb -->
				<ol class="breadcrumb">
					<li>检查评定</li><li>报告</li>
				</ol>
				<!-- end breadcrumb -->

			</div>
			<!-- END RIBBON -->
			
			<!-- #MAIN CONTENT -->
			<div id="content">
				<section id="widget-grid"><!-- widget grid -->
			        <!-- row -->			
			        <div class="row">
			        
			        	
			            <!-- SINGLE GRID -->
			            <article class="col-xs-12 col-sm-12 col-md-12 col-lg-12">
			
			                <!-- Widget ID (each widget will need unique ID)-->
							<div class="jarviswidget jarviswidget-color-darken" id="wid-id-0" data-widget-colorbutton="false"	
									data-widget-editbutton="false"
									data-widget-togglebutton="false"
									data-widget-deletebutton="false"
									data-widget-fullscreenbutton="false"
									data-widget-custombutton="false">
								
								<header>
									<span class="widget-icon"> <i class="fa fa-table"></i> </span>
									<h2>报告</h2>
				
								</header>
								
													
								<!-- widget div-->
								<div>
				
									<!-- widget edit box -->
									<div class="jarviswidget-editbox">
										<!-- This area used as dropdown edit box -->
				
									</div>
									<!-- end widget edit box -->
				
									<!-- widget content -->
									<div class="widget-body no-padding">
										
										<div class="widget-body-toolbar bg-color-white">
												<div class="row">
													<div class="col-sm-12 col-md-12 text-align-right">
													<div class="pull-left col-xs-3">
														<input class="form-control" id="searchData" value="" placeholder="搜索" type="text">
													</div>
													<div class="pull-left col-xs-2">
														<select class="form-control"  onChange="table.column(8).search(this.value).draw(true);">
															<option value="">全部</option>
															<option value="bridge">桥梁</option>
															<option value="pass">通道</option>
															<option value="culvert">涵洞</option>
														</select>
													</div>
														<a  class="btn btn-primary" onclick="allDownLoad()">批量下载</a>
														<a  class="btn btn-primary" href="reportBuild.jsp">批量报告</a>
													</div>
												</div>
										</div>
										
										<table id="reportGrid" class="table table-striped table-bordered table-hover"  style="width: 100%">
											<thead>			                
												<tr>
													<th>
														<label class="checkbox-inline" style="width: 100%;height: 100%;">
																 <input type="checkbox" class="checkbox style-0" id="autoChk">
																 <span></span>
														</label>
													</th>
													<th>任务编号</th>
													<th>项目名称</th>
													<th>结构编号</th>
													<th>结构名称</th>
													<th>文件名</th>
													<th>报告组成</th>
													<th>执行标准</th>
													<th>生成时间</th>
													<th>状态</th>
													<th style="width: 70px"> 开始时间</th>
													<th>操作</th>
												</tr>
											</thead>
										</table>
									</div>
									<!-- end widget content -->
				
								</div>
								<!-- end widget div -->
													
				
				
							</div>
							<!-- end widget -->
										
			            </article><!-- END GRID -->
			            
			            			
			        </div><!-- end row -->								        
			    </section><!-- end widget grid -->
			</div>
			<!-- END #MAIN CONTENT -->
		</div>
		<!-- END #MAIN PANEL -->
		
		<div id="cover" class="cover">		
			<div id="loading" class="loading">生成报告
			</div> 	
		</div>
		<%@ include file="footer.jsp" %>
		
		<!--================================================== -->

		<!-- PACE LOADER - turn this on if you want ajax loading to show (caution: uses lots of memory on iDevices)-->
		<script data-pace-options='{ "restartOnRequestAfter": true }' src="../js/plugin/pace/pace.min.js"></script>

		<!-- Link to Google CDN's jQuery + jQueryUI; fall back to local -->
		<script src="../js/libs/jquery-2.1.1.min.js"></script>
		<script src="../js/libs/jquery-ui-1.10.3.min.js"></script>

		<!-- IMPORTANT: APP CONFIG -->
		<script src="../js/app.config.js"></script>

		<!-- JS TOUCH : include this plugin for mobile drag / drop touch events-->
		<script src="../js/plugin/jquery-touch/jquery.ui.touch-punch.min.js"></script> 

		<!-- BOOTSTRAP JS -->
		<script src="../js/bootstrap/bootstrap.min.js"></script>

		<!-- CUSTOM NOTIFICATION -->
		<script src="../js/notification/SmartNotification.min.js"></script>

		<!-- JARVIS WIDGETS -->
		<script src="../js/smartwidgets/jarvis.widget.min.js"></script>

		<!-- EASY PIE CHARTS -->
		<script src="../js/plugin/easy-pie-chart/jquery.easy-pie-chart.min.js"></script>

		<!-- SPARKLINES -->
		<script src="../js/plugin/sparkline/jquery.sparkline.min.js"></script>

		<!-- JQUERY VALIDATE -->
		<script src="../js/plugin/jquery-validate/jquery.validate.min.js"></script>

		<!-- JQUERY MASKED INPUT -->
		<script src="../js/plugin/masked-input/jquery.maskedinput.min.js"></script>

		<!-- JQUERY SELECT2 INPUT -->
		<script src="../js/plugin/select2/select2.min.js"></script>

		<!-- JQUERY UI + Bootstrap Slider -->
		<script src="../js/plugin/bootstrap-slider/bootstrap-slider.min.js"></script>

		<!-- browser msie issue fix -->
		<script src="../js/plugin/msie-fix/jquery.mb.browser.min.js"></script>

		<!-- FastClick: For mobile devices -->
		<script src="../js/plugin/fastclick/fastclick.min.js"></script>

		<!--[if IE 8]>

		<h1>Your browser is out of date, please update your browser by going to www.microsoft.com/download</h1>

		<![endif]-->

		<!-- Demo purpose only -->

		<!-- MAIN APP JS FILE -->
		<script src="../js/app.min.js"></script>

		<!-- ENHANCEMENT PLUGINS : NOT A REQUIREMENT -->
		<!-- Voice command : plugin -->
		<script src="../js/speech/voicecommand.min.js"></script>

		<!-- SmartChat UI : plugin -->
		<script src="../js/smart-chat-ui/smart.chat.ui.min.js"></script>
		<script src="../js/smart-chat-ui/smart.chat.manager.min.js"></script>
		
		<!-- PAGE RELATED PLUGIN(S) -->
		
		<!-- Flot Chart Plugin: Flot Engine, Flot Resizer, Flot Tooltip -->
		<script src="../js/plugin/flot/jquery.flot.cust.min.js"></script>
		<script src="../js/plugin/flot/jquery.flot.resize.min.js"></script>
		<script src="../js/plugin/flot/jquery.flot.time.min.js"></script>
		<script src="../js/plugin/flot/jquery.flot.tooltip.min.js"></script>
		
		<!-- Vector Maps Plugin: Vectormap engine, Vectormap language -->
		<script src="../js/plugin/vectormap/jquery-jvectormap-1.2.2.min.js"></script>
		<script src="../js/plugin/vectormap/jquery-jvectormap-world-mill-en.js"></script>
		
		<!-- Full Calendar -->
		<script src="../js/plugin/moment/moment.min.js"></script>
		<script src="../js/plugin/fullcalendar/jquery.fullcalendar.min.js"></script>
		
		
		<script src="../js/plugin/datatables/jquery.dataTables.min.js"></script>
		<script src="../js/plugin/datatables/dataTables.colVis.min.js"></script>
		<script src="../js/plugin/datatables/dataTables.tableTools.min.js"></script>
		<script src="../js/plugin/datatables/dataTables.bootstrap.min.js"></script>
		<script src="../js/plugin/datatable-responsive/datatables.responsive.min.js"></script>
		
		<script src="../js/plugin/jquery-form/jquery-form.min.js"></script>
		
		<script type="text/javascript">
			$(document).ready(function() {
				pageSetUp();
				initTable();
			});
			
			$('#searchData').on('change', function(){
				var d = $(this).val();
				table.search(d).draw(true);
			});
			var table = $('#reportGrid').DataTable( {
				"deferRender": true,
				"processing": true,
		    	"sDom":
					"t"+
					"<'dt-toolbar-footer'<'col-sm-6 col-xs-12 hidden-xs'i><'col-xs-12 col-sm-6'p>>",
		        "bDestroy": true,
		        "iDisplayLength": 10,
		        "oLanguage": {
				    "sSearch": '<span class="input-group-addon"><i class="glyphicon glyphicon-search"></i></span>'
				},
		        "columns": [
					{ "data": "state", 'orderable': false ,"width":"5%"},
					{ "data": "task_id","width":"12%"},    
		            { "data": "prj_name","width":"13%" },
		            { "data": "struct_no","width":"10%"},
		            { "data": "struct_name","visible": false},
		            { "data": "report_file_name","width":"21%"},
		            { "data": "report_build","width":"9%"},
		            { "data": "report_sp","width":"7%"},
		            { "data": "report_date","width":"8%"},
		            { "data": "report_status","width":"7%"},
		            { "data": "report_start_time","visible": false},
		            {
		                "orderable":      false,
		                "data":           null,
		                "width": 50
		             //   "defaultContent": "<button class='down btn btn-warning btn-xs'><li class='fa fa-download'></li></button><button class='del btn btn-warning btn-xs'><span class='glyphicon glyphicon-trash'></span></button>"
		            },
		            {"data": "struct_mode", "visible": false}
		        ],
		        "columnDefs": [
								{	
									 "class": "tcenter",
								    "targets": 0,
								    "searchable": true,
								    "render": function(data, type, full) {
								  	  		return '<label class="checkbox-inline" style="width: 100%;height: 100%;"><input type="checkbox" class="checkbox style-0 cbox"><span></span></label>';
								        }
								  },
		                       {
		     				      "targets": 5,
		     				      "render": function(data, type, row) {
		     				    		  return row.report_file_name;
		     				          }
		     				    },
		                         {
				      "targets": 5,
				      "render": function(data, type, row) {
				    		  return formatBuild(row.report_build);
				          }
				    },
				    {
					      "targets": 9,
					      "render": function(data, type, row) {
					    		  if(row.report_status=='生成失败'){
					    			  return "<p style='color:red'>"+row.report_status+"</p>"
					    		  }else if(row.report_status=='成功'){
					    			  return "<p style='color:green'>"+row.report_status+"</p>"
					    		  }else{
					    			  if(row.rowno==1){
					    			   return "<p style='color:blue'>当前生成的报告</p>"
					    			  }else{
					    				  if(row.rowno!=undefined&&row.rowno!=null&&row.rowno!=0){
					    				   return "<p style='color:black'>等待中,当前顺位:"+(row.rowno-1)+"</p>"
					    				  }else{
					    					  return "<p style='color:black'>生成中 </p>"
					    				  }
					    			  }
					    		  }
					          }
					    },
				    {
					      "targets": 11,
					      "render": function(data, type, row) {
					    		  if(row.report_date!=null&&row.report_date!=''){
					    			  return "<button class='down btn btn-warning btn-xs'><li class='fa fa-download'></li></button><button class='del btn btn-warning btn-xs'><span class='glyphicon glyphicon-trash'></span></button>"
					    		  }else{
					    			  return "<button class='del btn btn-warning btn-xs'><span class='glyphicon glyphicon-trash'></span></button>"
					    		  }
					          }
					    }
				    ],
		        "order": [[8, 'desc']],
		        "oLanguage": { //国际化配置  
	                "sProcessing" : "正在获取数据，请稍后...",    
	                "sLengthMenu" : "显示 _MENU_ 条",    
	                "sZeroRecords" : "查询不到相关数据",    
	                "sInfo" : "从 _START_ 到  _END_ 条记录 总记录数为 _TOTAL_ 条",    
	                "sInfoEmpty" : "记录数为0",    
	                "sInfoFiltered" : "(全部记录数 _MAX_ 条)",    
	                "sInfoPostFix" : "",    
	                "sSearch" : "搜索",    
	                "sUrl" : "",    
	                "oPaginate": {    
	                    "sFirst" : "第一页",    
	                    "sPrevious" : "上一页",    
	                    "sNext" : "下一页",    
	                    "sLast" : "最后一页"    
	         		}  
		     	}
		    } );
			
			var tableData = {
					report_id:undefined,
					prj_id:undefined,
					prj_name:undefined,
					struct_id:undefined,
					struct_mode:undefined,
					struct_no: undefined,
					struct_name: undefined,
					report_file_name:undefined,
					report_file_path:undefined,
					report_date:undefined,
					report_build:undefined,
					report_sp:undefined
			}
			 $('#reportGrid').on('draw.dt',function() {
				 $("#autoChk").removeAttr("checked");
		        });
			 $('#autoChk').on('click', function(){
				 var s = $(this).prop('checked');
				$('#reportGrid .cbox').prop('checked', s).trigger('change');
			 });
			 $('#reportGrid').delegate('.cbox', 'change', function(){
				 var state = $(this).prop('checked');
				 var tr = $(this).closest('tr');
				 table.row(tr).data().state=state;
				 table.cell(tr, 10).data(state);
			 });

			 
			function initTable(){
				
				$.ajax({
					type: 'POST',
					url: '../ReportMgrServlet',
					dataType: 'json',
					data: {
						type:"initTableAll",
						tableData:JSON.stringify(tableData)
					},
					error : function(msg) {
						errMessage("请求ReportMgrServlet失败");
				    },
					success : function(json) {   
						 if(json.success=="fail"){
							 switch (json.error) {
							case 1:
								//successMessage("无数据");
								break;
							case 2:
								errMessage("服务器出错");
								break;
							case 3:
								//successMessage("！");
								break;
							default:
								break;
							}
							 $('#reportGrid').dataTable().fnClearTable();
						 }else{
							 $('#reportGrid').dataTable().fnClearTable();
							 var data = json.obj;
							 table.rows.add(data).draw(false); 
						 }
					}
				});
			}
			
			
		
			$('#reportGrid').delegate('.del','click', function () {
				 
				var dom = $(this).parents('tr');
				var data = table.row(dom).data();
				$.SmartMessageBox({
			        title: "删除提示",
			        content: "确认删除该条记录吗",
			        buttons: '[取消][确定]'
			    }, function (ButtonPressed) {
			        if (ButtonPressed === "确定") {
			        	 $.ajax({
								type: 'POST',
								url: '../ReportMgrServlet',
								dataType: 'json',
								data: {
									type:"delReport",
									report_id:data.report_id
								},
								error : function(msg) {
									errMessage("请求ReportMgrServlet失败");
							    },
								success : function(json) {   
									 if(json.success=="fail"){
										 switch (json.error) {
										case 1:
											errMessage("删除失败");
											break;
										case 2:
											errMessage("服务器错误！");
											break;
										case 3:
											errMessage("出错！");
											break;
										default:
											break;
										}
									 }else{
										 successMessage("删除成功");
										 table.row(dom).remove().draw(true); 
									 }
								}
							});
			        }
			    });
			});
			
			
			$('#reportGrid').delegate('.down','click', function () {
				var dom = $(this).parents('tr');
				var data = table.row(dom).data();
				var fileName = data.report_file_name.replace('+', '%2B');
				window.location.href=encodeURI("../ReportMgrServlet?type=downFile&report_id="+data.report_id+"&fileName="+fileName+"&struct_id="+data.struct_id+"&struct_mode="+data.struct_mode);
			});
			

			function formatBuild( d ){
				d=d.replace('1', '结构封面');
				d=d.replace('4', '检查记录');
				d=d.replace('5', '结构卡片');
				d=d.replace('6', '结构概述');
				d=d.replace('2', '04规范');
				d=d.replace('3', '11规范');
				return d;
			}
			function allDownLoad(now){
				
					var s=$('#reportGrid .cbox').is(':checked');
					if(!s){
						errMessage("请选择文件");
					}else{
						var data = table.data();
						var structs = new Array();
						for(var i=0;i<data.length;i++){
							if(data[i].state){
								structs.push(data[i]);
							}
						}
						 $.ajax({
								type: 'POST',
								url: '../ReportMgrServlet',
								dataType: 'json',
								data: {
									type:"downFileAll",
									structs:JSON.stringify(structs)
								},
								error : function(msg) {
									errMessage("请求ReportMgrServlet失败");
							    },
								success : function(json) { 
									var files=json.obj;
									window.location.href=encodeURI("../ReportMgrServlet?type=downFile2&files="+files);
								}  
							});
					}
			}
			

			function errMessage(info){
				$.smallBox({
	                title: "处理信息",
	                content: "<i class='fa fa-clock-o'></i> <i>"+info+"</i>",
	                color: "#C46A69",
	                iconSmall: "fa fa-times fa-2x fadeInRight animated",
	                timeout: 3000
	            });
			}
			
			function successMessage(info){
				$.smallBox({
	                title: "处理信息",
	                content: "<i class='fa fa-clock-o'></i> <i>"+info+"</i>",
	                color: "#659265",
	                iconSmall: "fa fa-times fa-2x fadeInRight animated",
	                timeout: 3000
	            });
			}
			
			 $('#reportGrid').delegate('.cbox', 'change', function(){
				 var state = $(this).prop('checked');
				 var tr = $(this).closest('tr');
				 table.row(tr).data().state=state;
				 table.cell(tr, 10).data(state);
				 
			 });
			
			$("#autoChk").on("click",function(){
				 var s = $(this).prop('checked');
				$('#reportGrid .cbox').prop('checked', s).trigger('change');
			});
			
			//屏蔽报错弹窗
			$.fn.dataTable.ext.errMode = 'none'; 

			
			 function showMask(){
		        	$("#cover").show();		
		       	}
		   	function hidMask(){
		       		$("#cover").css('display','none');
		       	}
			
			function releaseAdmin(){//管理员
				
			}
			function releaseManage(){//项目负责人
				
			}
			function releaseMember(){//项目参与人
				
			}
			function releaseGuest(){//普通用户
				
			}
		</script>
	</body>
</html>