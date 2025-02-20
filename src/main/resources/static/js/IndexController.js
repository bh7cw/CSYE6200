$(function () {
    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();


    $.ajax({
        url: 'http://localhost:9090/getCountNumRecord',
        method: 'get',
        dataType: "json",//数据类型可以为 text xml json  script  jsonp
        success: function (result) {
            $("#student").text(result.studentNum);
            $("#teacher").text(result.teacherNum);
            $("#vaccine").text(result.recordNum);
        },
        error: function (e) {

        }
    })

});

var TableInit = function () {
    oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#stuInformation').bootstrapTable({
            url: 'http://localhost:9090/showHierarchy',         //moc url // （*）
            method: 'get',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: true,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sortable: true,                     //是否启用排序
            sortOrder: "ASC",                   //排序方式
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "client",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                       //初始化加载第一页，默认第一页
            pageSize: 5,                       //每页的记录行数（*）
            pageList: [5, 10, 15, 20],        //可供选择的每页的行数（*）
            search: true,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: false,                //是否启用点击选中行
            uniqueId: "num",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                field: 'studentFullName',
                title: 'Student Name',
            },{
                field: "classroomId",
                title: "Class"
            }, {
                field: "groupInfoId",
                title: "Group"
            }, {
                field: "studentAge",
                title: "Month"
            }, {
                field: 'teacherFullName',
                title: 'Group Teacher'
            }]
        });
    };

    oTableInit.queryParams = function (params) {
        var map = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            offset: params.offset,  //页码
            // room: $("#txt_search_room").val(),
            // statu: $("#txt_search_statu").val()
        };
        return map;
    };
    return oTableInit;
};


var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        $("#btn_query").click(function () {
            $("#stuInformation").bootstrapTable('refresh');
        });
    };

    return oInit;
};

$(document).ready(function(){
    $("#vac").click(function (event) {

            window.location.href = "http://localhost:9090/vaccines-information.html";

    });

    $("#stu").click(function (event) {

        window.location.href = "http://localhost:9090/students-information.html";

    });

    $("#tea").click(function (event) {

        window.location.href = "http://localhost:9090/teachers-information.html";

    });


});