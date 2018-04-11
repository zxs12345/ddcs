var countdown=30; 
						function sendMobileCode () {
                    if(countdown!=30)
                 {
                    	
                    	layer.alert('您的操作过于频繁啦！！！！', {
                    skin: 'layui-layer-molv' //样式类名
                    	,anim: 3 //动画类型
                     ,closeBtn: 0
                     }, function(){
                       layer.alert('请稍后再试哦！！！！', {
                     skin: 'layui-layer-molv'
                      ,closeBtn: 0
                       ,anim: 4 //动画类型 
                                                  }); 
                                                      }); 
                    	
	                       return
                                      }
                     if($("#phone").val()==""){
             		   
             		   layer.alert("用户名不能为空", {icon: 0});
             	   }else{
             		  $.ajax({
						    type : "POST",
						    url : "/ddcs/GetCode",
						    data : {
						        "phone" : $("#phone").val(),
						     
						    },
						    dataType : "json",
						    success : function(data) {
						    	layer.alert(data, {icon: 1});
						    }
						    });
             		  settime()
             	   }
							
						}
						
						
						function settime() { //发送验证码倒计时
                            if (countdown == 0) { 
   
                                   $("#dyMobileButton").text('获取')
                                  countdown = 30; 
                                    return;
                                   } else {
                                	   
                                $("#dyMobileButton").text(countdown+'s')
                                     
                                        countdown--; 
                                                                    } 
                          setTimeout(function() { 
                                       settime() }
                                           ,1000)  }
						
						
						//初始化数据
						function initData(){
						    $('#phone').val("");
						    $('#password2').val("");
						    $('#code').val("");
						}
						  $(document).ready(function(){
							  
							   $('#dhzc').click(function (){
								  
								
								   $.ajax({
								        url: "/ddcs/add",
								        cache: false,
								        dataType:'json',
								        data : {
								        	 "userName" : $("#phone").val(),
										     "password" : $("#password2").val(),
								             "code": $("#code").val(),
								             "recode": $("#passwordRepeat2").val(),
								             "readme": document.getElementById("reader-me2").checked
								           
								        },
								        type : 'post',
								         beforeSend: function () {
								            // 禁用按钮防止重复提交
								            $('#dhzc').attr({ disabled: "disabled"});
								        }, 
								        success: function(result){
								            if(result.flag == true){
								            	
								            	  layer.confirm(result.message, {
								            		  btn: ['好','取消'] //按钮
								            		}, function(){
								            			  window.location.href ="/ddcs/toLogin";
								            		}, function(){
								            			 layer.msg('欢迎成为叮咚超市会员！', {icon: 1});
								            			 initData()
								            		});
								            
								            
								                
								            }else{
								               
								               layer.alert(result.message, {icon: 0});
								            }
								        },
								        complete: function () {
								            $('#dhzc').removeAttr("disabled");
								        },
								        error: function (data) {
								            console.info("error: " + data.responseText);
								        }
								    });    
							   });
								
							   $('#tys').click(function  () { 
								  alert('这是服务协议')
											})
							  }) ;
						  $('#yxzc').click(function (){
							  
							  $.ajax({
							        url: "/ddcs/addyx",
							        cache: false,
							        dataType:'json',
							        data : {
							        	 "userName" : $("#email").val(),
									     "password" : $("#password1").val(),
									     "repassword" : $("#passwordRepeat1").val(),
							             "readme": document.getElementById("reader-me1").checked
							           
							        },
							        type : 'post',
							         beforeSend: function () {
							            // 禁用按钮防止重复提交
							            $('#yxzc').attr({ disabled: "disabled"});
							        }, 
							        success: function(result){
							            if(result.flag == true){
							            	
							            	  layer.confirm(result.message, {
							            		  btn: ['好','取消'] //按钮
							            		}, function(){
							            			  window.location.href ="/ddcs/toLogin";
							            		}, function(){
							            			 layer.msg('欢迎成为叮咚超市会员！', {icon: 1});
							            			 initData()
							            		});
							            
							            
							                
							            }else{
							               
							               layer.alert(result.message, {icon: 0});
							            }
							        },
							        complete: function () {
							            $('#yxzc').removeAttr("disabled");
							        },
							        error: function (data) {
							            console.info("error: " + data.responseText);
							        }
							    });
						  })
						  