$(document).ready(function(){
	$("#btnDangNhap").click(function(){
		alert("àiajlkfjl");
		$ajax({
			url:"/BTL/api/KiemTraDangNhap",
			type:"GET",
			data:{
				session: "a",
				taiKhoan: "a"
			},
			success: function(value){
				alert(value);
			}
			
		})
	})
})