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


            if(result.require004 == true){
                $("#dose005").text(result.dose004);
                $("#date005").text(setDate(result.date004));
            }else{
                $("#dose006").text("failed in you skin test");
            }
            if(result.require005 == true){
                $("#dose005").text(result.dose005);
                $("#date005").text(setDate(result.date005));
            }else{
                $("#dose006").text("failed in you skin test");
            }
            if(result.require006 == true){
                $("#dose006").text(result.dose006);
                $("#date006").text(setDate(result.date006));
            }else{
                $("#dose006").text("failed in you skin test");
            }

            $("#date001").text(setDate(result.date001));
            $("#date002").text(setDate(result.date002));
            $("#date003").text(setDate(result.date003));



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

//001
$(document).ready(function () {
    //get the id by herf
    var id = location.href.substr(location.href.indexOf("#") + 1);
    $("#btn_1").click( function(){

        var data001 = getNowFormatDate();


            $.ajax({
                type: 'POST',
                url: "/inject001/" + id,
                contentType: "application/json;charset=utf-8",//如果想以json格式把数据提交到后台的话，这个必须有，否则只会当做表单提交
                data: JSON.stringify({
                    "date001": data001
                }),//JSON.stringify()必须有,否则只会当做表单的格式提交
                dataType: "JSON",
                success: function (result) {
                    // window.location.href = "localhost:9090/stuVaccine.html#"+id; //重定向到该页面
                    alert(result.msg);

                    window.location.reload();

                },
                error: function (err) {
                    alert("err");
                    window.location.href = "localhost:9090/stuVaccine.html#"+id;
                }
            });



    })
});

//002
$(document).ready(function () {
    //get the id by herf
    var id = location.href.substr(location.href.indexOf("#") + 1);
    $("#btn_2").click( function(){

        var data002 = getNowFormatDate();

        $.ajax({
            type: 'POST',
            url: "/inject002/" + id,
            contentType: "application/json;charset=utf-8",//如果想以json格式把数据提交到后台的话，这个必须有，否则只会当做表单提交
            data: JSON.stringify({
                "date002": data002
            }),//JSON.stringify()必须有,否则只会当做表单的格式提交
            dataType: "JSON",
            success: function (result) {
                // window.location.href = "localhost:9090/stuVaccine.html#"+id; //重定向到该页面
                alert(result.msg);

                window.location.reload();

            },
            error: function (err) {
                alert("err");
                window.location.href = "localhost:9090/stuVaccine.html#"+id;
            }
        });



    })
});

//003
$(document).ready(function () {
    //get the id by herf
    var id = location.href.substr(location.href.indexOf("#") + 1);
    $("#btn_3").click( function(){

        var data003 = getNowFormatDate();

        $.ajax({
            type: 'POST',
            url: "/inject003/" + id,
            contentType: "application/json;charset=utf-8",//如果想以json格式把数据提交到后台的话，这个必须有，否则只会当做表单提交
            data: JSON.stringify({
                "date003": data003
            }),//JSON.stringify()必须有,否则只会当做表单的格式提交
            dataType: "JSON",
            success: function (result) {
                // window.location.href = "localhost:9090/stuVaccine.html#"+id; //重定向到该页面
                alert(result.msg);

                window.location.reload();

            },
            error: function (err) {
                alert("err");
                window.location.href = "localhost:9090/stuVaccine.html#"+id;
            }
        });



    })
});

var getNowFormatDate =function(){
    var date = new Date();
    var s1 = "-";

    var month = date.getMonth() + 1;
    var strDate = date.getDate();
    if (month >= 1 && month <= 9) {
        month = "0" + month;
    }
    if (strDate >= 0 && strDate <= 9) {
        strDate = "0" + strDate;
    }
    return date.getFullYear() + s1 + month + s1 + strDate;

};

