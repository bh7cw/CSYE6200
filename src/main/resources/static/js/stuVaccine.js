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

            $("#date001").text(setDate(result.date001));
            $("#date002").text(setDate(result.date002));
            $("#date003").text(setDate(result.date003));
            $("#date004").text(setDate(result.date004));
            $("#date005").text(setDate(result.date005));
            $("#date006").text(setDate(result.date006));
        }
    })
})

var setDate = function (value) {
    var date;
    if(value == null){
        date = "";
    }else{
        date = ", at " + new Date(value).toLocaleDateString().replace(/\//g, "-");
    }
    return date;

}