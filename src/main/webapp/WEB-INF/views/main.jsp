<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
	<jsp:include page="top.jsp" flush="false"/>
	
	<div class="menu_box">
		<ul>
			<c:forEach items="${menulist}" var="dto">
				<li>
					<a href="">
						<div>
							<img src="${dto.img_url}">
						</div>
						<p>${dto.menu_nm}</p>
						<p>${dto.price} 원</p>
					</a>
				</li>
			</c:forEach>
		</ul>
	</div>