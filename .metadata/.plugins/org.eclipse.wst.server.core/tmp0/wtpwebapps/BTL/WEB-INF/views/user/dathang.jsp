<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/views/layouts/user/taglib.jsp"%>
<body>
	<form:form action="dat-hang/xac-nhan" class="form-pay" modelAttribute="thongTinLienHe_KhachHang">
			 
			 <table>
			 		<tr>
			 			<th colspan="2">Thông tin đơn hàng</th>
			 		</tr>
                    <tr>
                        <td>Họ tên:</td>
                        <td><form:input type="text" name="hoTen" id="hoTen" path="hoTen"  /></td>
                    </tr>
                    <tr>
                        <td>Địa chỉ:</td>
                        <td><form:input type="text" name="diaChi" id="diaChi" path="diaChi"  /></td>
                    </tr>
                    <tr>
                        <td>Số điện thoại:</td>
                        <td><form:input type="text" name="hoTen" id="hoTen" path="hoTen"  /></td>
                    </tr>
             </table>
			<div class="caption-list">Danh sách sản phẩm</div>
			<div class="list-product">
                <table border="1" cellspacing="0">
                    <tr>
                        <td>Tên sản phẩm</td>
                        <td>Số lượng</td>
                    </tr>
                    <c:forEach var="item" items="${GioHang }">
                        <tr>
                            <td>${item.value.sanPham.tenSanPham}</td>
                            <td>${item.value.soLuong }</td>
                        </tr>
				</c:forEach>
                </table>
			</div>
			
			<div class="total">Tổng tiền: ${TongTienGioHang }</div>
			

			<input type="submit" value="Xác nhận đặt">

		</form:form>
</body>