$(function () {
    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();

});

var TableInit = function () {

    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#stuInformation').bootstrapTable({
            url: 'http://localhost:9090/showAllStudentInfo',         //moc url // （*）
            method: 'GET',                      //请求方式（*）
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
            // height: 680,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "studentId",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            columns: [{
                field: 'studentFullName',
                title: 'name'
            }, {
                field: "studentId",
                title: "student id"
            }, {
                field: "month",
                title: "Month"
            }, {
                field: 'registerDate',
                title: 'register date',
                formatter: function (value, row) {
                    return new Date(value).toLocaleDateString().replace(/\//g, "-");
                }

            }, {
                field: 'parentFullName',
                title: 'parents',

            }, {
                field: 'parentEmail',
                title: 'E-Mail',

            }, {
                field: 'studentId',
                title: 'operation',
                formatter: function (value) {
                    return " <button onclick='vaccineDetail(" + value + ")' type='button' class='btn-dark btn'>vaccine</button>" +
                        " <button onclick=\'deleteStu(" + value + ")\' type='button' class='btn-dark btn'>delete</button>"
                }
            }]
        });
    };

    //得到查询的参数
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


<!-- get student vaccine detail page by student id-->
var vaccineDetail = function (value) {
    window.location.href = "http://localhost:9090/individual-vaccine.html#" + value;

};


<!--pass the id of student to back-end -->
var deleteStu = function (value) {
    $.ajax({
        url: "http://localhost:9090/deleteStu",
        method: 'POST',
        contentType: "application/json;charset=utf-8",
        data: JSON.stringify({
            "studentId": value
        }),
        dataType: "JSON",
        success: function (result) {
            alert(result.msg);
            $("#stuInformation").bootstrapTable('refresh');
        }
    })
};


