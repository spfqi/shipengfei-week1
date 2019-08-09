<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resource/mystyles.css" type="">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/resource/jquery-3.2.1.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/My97DatePicker/WdatePicker.js"></script>
<!--声明js代码块  -->
<script type="text/javascript">
	function query() {
		var pname=$("[name='pname']").val();
		location.href="${pageContext.request.contextPath}/list?pname="+pname
	}
</script>
</head>
<body>
	<a href="toAdd"> <input type="button" value="添加"></a>
	查询内容 <input type="text" name="pname"  value="${pname }"> <input type="button" value="搜索"  onclick="query()">
	<table>
		<tr>
			<td>序号</td>
			<td>植物名称</td>
			<td>描述</td>
			<td>类别</td>
			<td>操作</td>
		</tr>
		<c:forEach items="${list }" var="e" varStatus="i">
		<tr>
			<td>${i.index+1 }</td>
			<td>${e.pname }</td>
			<td>${e.desc }</td>
			<td>${e.cname }</td>
			<td>
			   <input type="button" value="查看">
			   <input type="button" value="编辑">
			   <input type="button" value="删除">
			</td>
		</tr>
		</c:forEach>
		<tr>
		 <td><input type="button" value="批量删除"></td> 
		 <td colspan="6">${fenye }</td>
		</tr>
	</table>
</body>
</html>