<%@ 
page language="java" contentType="application/msword; charset=UTF-8"
pageEncoding="UTF-8"%>
<!--정보를 줘서 넣는 방식이다.-->
<%
response.setHeader("Content-Disposition", "attachment;filename=member.doc");
response.setHeader("Content-Description", "JSP Generated Data");
%>
안녕하세요