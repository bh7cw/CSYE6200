$(function () {
    //get the id passed by href
    var id = location.href.substr(location.href.indexOf("#") + 1);

    $.ajax({
        type: "GET",//请求方式
        url: "http://localhost:9090/stuVaccine/" + id,//地址，就是json文件的请求路径
        dataType: "json",//数据类型可以为 text xml json  script  jsonp
        success: function (result) {
            //put the atrribute into page through lable id
            $("#dose001").text(result.dose001);
            $("#dose002").text(result.dose002);
            $("#dose003").text(result.dose003);
            $("#dose004").text(result.dose004);
            $("#dose005").text(result.dose005);
            $("#dose006").text(result.dose006);

            $("#date001").text(new Date(result.date001).toLocaleDateString().replace(/\//g, "-"));
            $("#date002").text(new Date(result.date002).toLocaleDateString().replace(/\//g, "-"));
            $("#date003").text(new Date(result.date003).toLocaleDateString().replace(/\//g, "-"));
            $("#date004").text(new Date(result.date004).toLocaleDateString().replace(/\//g, "-"));
            $("#date005").text(new Date(result.date005).toLocaleDateString().replace(/\//g, "-"));
            $("#date006").text(new Date(result.date006).toLocaleDateString().replace(/\//g, "-"));
        }
    })
})