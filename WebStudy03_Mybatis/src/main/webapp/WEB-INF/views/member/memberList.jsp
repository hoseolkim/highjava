<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<table class="table table-bordered">
	<thead>
		<tr>
			<th>회원명</th>
			<th>휴대폰</th>
			<th>이메일</th>
			<th>생일</th>
			<th>거주지역</th>
			<th>마일리지</th>
		</tr>
	</thead>
	<tbody>
		
		<c:if test="${empty memberList }">
			<tr>
				<td colspan="5">검색 조건에 맞는 회원 없음.</td>
			</tr>
		</c:if>
		<c:if test="${not empty memberList }">
			<c:forEach items="${memberList }" var="member">
				<tr data-mem-id="${member.memId}">
					<td>${member.memName }[${member.prodCount }]</td>
					<td>${member.memHp }</td>
					<td>${member.memMail }</td>
					<td>${member.memBir }</td>
					<td>${member.memAdd1 }</td>
					<td>${member.memMileage }</td>
				</tr>
			</c:forEach>
		</c:if>
	</tbody>
</table>
<div class="modal fade" id="memberDetailModal" tabindex="-1" aria-labelledby="memberModal" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h1 class="modal-title fs-5" id="memberModal">회원 상세정보</h1>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body" id="memberDetailArea">
           
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
      </div>
    </div>
  </div>
</div>

<script src="${pageContext.request.contextPath }/resources/js/app/member/member.js"></script>