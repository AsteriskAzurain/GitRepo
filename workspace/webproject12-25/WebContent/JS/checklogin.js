function queryall() {
		$.ajax({
			type : 'post',
			url : 'queryallaction.action',//此处的Action要与struts.xml中的action的name对应
			//data : "username=" + username + "&password=" + password,
			// dataType: "json",
			success : function(data) {
				//alert("success")
				var n = data.reMap.resultlist.length
				for (i = 0; i < n; i++) {
					var str = data.reMap.resultlist[i].username
					var userid = data.reMap.resultlist[i].userid
					resultuserlist.innerHTML += ('<li><a href="#">'
							+ str
							+ '</a><div class="btn2"><button onclick="updateuser('
							+ userid
							+ ')">修改</button><button onclick="deleteuser('
							+ userid + ')">删除</button></div></li>');
				}
			},
			error : function() {
				alert("failed")
			}
		});
	}

	function deleteuser(userid) {
		if (confirm("确定要删除吗？")) {
			//session.setAttribute("userid",userid)
			alert("已删除。")
			//window.location.href = "../deleteuseraction.action?userid="+userid ;
			window.location.replace("../deleteuseraction.action?userid="+ userid);
			//window.location.reload(true);
		} else {
			alert("已取消。")
		}
	}
	function updateuser(userid) {
		window.location.href = "update/user.html?userid=" + userid;
	}
	
	function querybyname(username) {
		alert(username)
		$.ajax({
			type : 'post',
			url : 'userquerybyeneityaction.action',
			data : "username=" +username,
			success : function(data) {
				alert("success")
				var n = data.reMap.resultlist.length
				alert(n)
				resultuserlist.innerHTML="";
				for (i = 0; i < n; i++) {
					var str = data.reMap.resultlist[i].username
					var userid = data.reMap.resultlist[i].userid
					resultuserlist.innerHTML += ('<li><a href="#">'
							+ str
							+ '</a><div class="btn2"><button onclick="updateuser('
							+ userid
							+ ')">修改</button><button onclick="deleteuser('
							+ userid + ')">删除</button></div></li>');
				}
			},
			error : function() {
					alert("failed")
				}
		});
	}