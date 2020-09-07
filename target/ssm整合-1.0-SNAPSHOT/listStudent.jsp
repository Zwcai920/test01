<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%--%>
<%--    String basePath = request.getScheme() + "://" +--%>
<%--            request.getServerName() + ":" + request.getServerPort() +--%>
<%--            request.getContextPath() + "/";--%>
<%--%>--%>

<html>
<head>
<%--    <base href="<%=basePath%>"/>--%>
    <title>查询学生</title>
    <script type="text/javascript" src="js/jquery-3.4.1.js"></script>
    <script type="text/javascript">
        $(function () {
            $.ajax({
                url:"student/findStudent.do",
                type:"get",
                dataType:"json",
                success:function (resp) {
                    $("#stubody").html("");
                    $.each(resp,function (i,n) {
                        $("#stubody").append("<tr>")
                            .append("<td>"+n.id+"</td>")
                            .append("<td>"+n.name+"</td>")
                            .append("<td>"+n.age+"</td>")
                            .append("</tr>")
                    })
                }
            })
        })
    </script>
</head>
<body>
<div align="center">
    <p>查询学生数据</p>
    <table>
        <thead>
            <tr>
                <td>id</td>
                <td>姓名</td>
                <td>年龄</td>
            </tr>
        </thead>
        <tbody id="stubody">

        </tbody>
    </table>
</div>
</body>
</html>
